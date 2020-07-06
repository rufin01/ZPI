package zpi;

import antlr.ExprLexer;
import antlr.ExprParser;
import expression.*;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.*;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;
import javafx.scene.input.ScrollEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.transform.Rotate;
import javafx.scene.transform.Translate;
import javafx.stage.Stage;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.fxmisc.richtext.CodeArea;
import org.fxmisc.richtext.LineNumberFactory;

public class Main extends Application implements EventHandler<ActionEvent> {

    private double mousePosX, mousePosY;
    private double mouseOldX, mouseOldY;
    private final Rotate rotateX = new Rotate(190, Rotate.X_AXIS);
    private final Rotate rotateY = new Rotate(190, Rotate.Y_AXIS);

    private Button runButton;
    private CodeArea codeArea;
    private SubScene subScene;
    private Model3D model3D;

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("app.fxml"));

        Scene scene = new Scene(root, 1024, 768);
        primaryStage.setScene(scene);

        primaryStage.setMinWidth(1000);
        primaryStage.setMinHeight(800);

        primaryStage.setTitle("4GML Visualizator");
        primaryStage.show();

        runButton = (Button) scene.lookup("#runButton");
        runButton.setOnAction(this);

        addCodeArea(scene);

        model3D = new Model3D();

        PerspectiveCamera camera = new PerspectiveCamera(true);
        camera.getTransforms().addAll(rotateX, rotateY, new Translate(0, 0, -35));

        Group root3D = new Group(camera, model3D.getModel());
        subScene = new SubScene(root3D, 30000, 30000, true, SceneAntialiasing.BALANCED);
        subScene.setFill(Color.AQUAMARINE);
        subScene.setCamera(camera);

        StackPane stackPane = (StackPane) scene.lookup("#stackPane");

        subScene.widthProperty().bind(stackPane.widthProperty());
        subScene.heightProperty().bind(stackPane.heightProperty());

        stackPane.getChildren().add(subScene);

        subScene.setOnMousePressed((MouseEvent me) -> {
            mouseOldX = me.getSceneX();
            mouseOldY = me.getSceneY();
        });

        subScene.setOnMouseDragged((MouseEvent me) -> {
            if(me.isPrimaryButtonDown()){
                mousePosX = me.getSceneX();
                mousePosY = me.getSceneY();
                rotateX.setAngle(rotateX.getAngle()-(mousePosY - mouseOldY));
                rotateY.setAngle(rotateY.getAngle()+(mousePosX - mouseOldX));
                mouseOldX = mousePosX;
                mouseOldY = mousePosY;
            }
            if(me.isSecondaryButtonDown()){
                mousePosX = me.getSceneX();
                mousePosY = me.getSceneY();
                camera.setTranslateX(camera.getTranslateX()+((mousePosX - mouseOldX)/100));
                camera.setTranslateY(camera.getTranslateY()+((mousePosY - mouseOldY)/100));
                mouseOldX = mousePosX;
                mouseOldY = mousePosY;
            }
            if(me.isMiddleButtonDown()){
                mousePosX = me.getSceneX();
                mousePosY = me.getSceneY();
                camera.setTranslateZ(camera.getTranslateZ()+((mousePosX - mouseOldX)/100));
                mouseOldX = mousePosX;
                mouseOldY = mousePosY;
            }
        });

        subScene.setOnScroll((ScrollEvent event) -> {
            double zoomFactor = 1.05;
            double deltaY = event.getDeltaY();
            if (deltaY < 0){
                zoomFactor = 2.0 - zoomFactor;
            }
            model3D.getModel().setScaleX(model3D.getModel().getScaleX() * zoomFactor);
            model3D.getModel().setScaleY(model3D.getModel().getScaleY() * zoomFactor);
            model3D.getModel().setScaleZ(model3D.getModel().getScaleZ() * zoomFactor);
            event.consume();
        });
    }

    private void addCodeArea(Scene scene) {
        codeArea = new CodeArea();

        // add line numbers to the left of area
        codeArea.setParagraphGraphicFactory(LineNumberFactory.get(codeArea));

        AnchorPane codeAreaAnchorPane = (AnchorPane) scene.lookup("#codeAreaAnchorPane");
        codeAreaAnchorPane.getChildren().add(codeArea);

        codeArea.prefWidthProperty().bind(codeAreaAnchorPane.widthProperty());
        codeArea.prefHeightProperty().bind(codeAreaAnchorPane.heightProperty());
        
        codeArea.appendText("head: NODE = node(point(.0, 19.0, .0), point(.0, .0, .0, .0, 1.0, .0, 0), point(.0, .0, .0));\n" +
                "chest: NODE = node(point(.0, 15.0, .0), point(.0, .0, .0), point(.0, .0, .0));\n" +
                "bottom: NODE = node(point(.0, 9.0, .0), point(.0, .0, .0), point(.0, .0, .0));\n" +
                "\n" +
                "lhand: NODE = node(point(-6.0, 8.0, .0), point(.0, .0, .05), point(.0, .0, .0));\n" +
                "rhand: NODE = node(point(6.0, 8.0, .0), point(.0, .0, -.05), point(.0, .0, .0));\n" +
                "\n" +
                "lfeet: NODE = node(point(-4.0, .0, .0), point(.0, .0, -.05), point(.0, .0, .0));\n" +
                "rfeet: NODE = node(point(4.0, .0, .0), point(.0, .0, .05), point(.0, .0, .0));\n" +
                "\n" +
                "ADDNODE(head);\n" +
                "ADDNODE(chest);\n" +
                "ADDNODE(bottom);\n" +
                "\n" +
                "ADDNODE(rhand);\n" +
                "ADDNODE(lhand);\n" +
                "ADDNODE(rfeet);\n" +
                "ADDNODE(lfeet);\n" +
                "\n" +
                "ADDEDGE(head, chest);\n" +
                "ADDEDGE(chest, bottom);\n" +
                "\n" +
                "ADDEDGE(chest, lhand);\n" +
                "ADDEDGE(chest, rhand);\n" +
                "\n" +
                "ADDEDGE(rfeet, bottom);\n" +
                "ADDEDGE(lfeet, bottom);\n" +
                "\n" +
                "MODIFYNODE(lhand, 2, point(.0, .0, -.05), 100);\n" +
                "MODIFYNODE(rhand, 2, point(.0, .0, .05), 100);\n" +
                "MODIFYNODE(lfeet, 2, point(.0, .0, .05), 100);\n" +
                "MODIFYNODE(rfeet, 2, point(.0, .0, -.05), 100);\n" +
                "\n" +
                "MODIFYNODE(lhand, 2, point(.0, .0, .05), 300);\n" +
                "MODIFYNODE(rhand, 2, point(.0, .0, -.05), 300);\n" +
                "MODIFYNODE(lfeet, 2, point(.0, .0, -.05), 300);\n" +
                "MODIFYNODE(rfeet, 2, point(.0, .0, .05), 300);\n" +
                "\n" +
                "MODIFYNODE(lhand, 2, point(.0, .0, -.05), 500);\n" +
                "MODIFYNODE(rhand, 2, point(.0, .0, .05), 500);\n" +
                "MODIFYNODE(lfeet, 2, point(.0, .0, .05), 500);\n" +
                "MODIFYNODE(rfeet, 2, point(.0, .0, -.05), 500);\n" +
                "\n" +
                "MODIFYNODE(lhand, 2, point(.0, .0, .00), 600);\n" +
                "MODIFYNODE(rhand, 2, point(.0, .0, -.0), 600);\n" +
                "MODIFYNODE(lfeet, 2, point(.0, .0, -.0), 600);\n" +
                "MODIFYNODE(rfeet, 2, point(.0, .0, .00), 600);\n" +
                "\n" +
                "MODIFYNODE(head, 2, point(.0, .0, .0), 1000);");
    }

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void handle(ActionEvent event) {
        if (event.getSource() == runButton) {
            model3D = new Model3D();
            Model3D.resetModel();
            String code = codeArea.getText();

            ExprParser parser = getParser(code);

            // tell ANTLR to build parse tree
            // parse from the start symbol 'prog'
            ParseTree antlrAST = parser.prog();

            if (SyntaxErrorListener.hasError) {
                /*let the syntax error be reported */
            }
            else {
                // create a visitor for converting the parse tree into Program/Expression object
                AntlrToProgram progVisitor = new AntlrToProgram();
                Program prog = progVisitor.visit(antlrAST);

                if(progVisitor.semanticErrors.isEmpty()) {
                    ExpressionProcessor ep = new ExpressionProcessor(prog.expressions);
                    for(Object evaluation: ep.getEvaluationResults()) {

                    }
                }
                else {
                    for(String err: progVisitor.semanticErrors) {
                        System.err.println(err);
                    }
                }
            }

            // -------------

            PerspectiveCamera camera = new PerspectiveCamera(true);
            camera.getTransforms().addAll(rotateX, rotateY, new Translate(0, 0, -35));

            Group root3D = new Group(camera, model3D.getModel());
            subScene.setRoot(root3D);

            model3D.startMovement();
        }
    }

    private static ExprParser getParser(String code) {
        CharStream input = CharStreams.fromString(code);
        ExprLexer lexer = new ExprLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        ExprParser parser = new ExprParser(tokens);

        // syntax error handling
        parser.removeErrorListeners();
        parser.addErrorListener(new SyntaxErrorListener());

        return parser;
    }
}
