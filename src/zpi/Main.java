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

        primaryStage.setTitle("zpi");
        primaryStage.show();

        runButton = (Button) scene.lookup("#runButton");
        runButton.setOnAction(this);

        addCodeArea(scene);

//        GMLNode_copy head = new GMLNode_copy();
//        head.getPoint().y=22;
//
//        GMLNode_copy chest = new GMLNode_copy();
//        chest.getPoint().y = 15;
//
//        GMLNode_copy lhand = new GMLNode_copy();
//        lhand.getPoint().x = -6;
//        lhand.getPoint().y = 10;
//        GMLNode_copy rhand = new GMLNode_copy();
//        rhand.getPoint().x = 6;
//        rhand.getPoint().y = 10;
//
//        GMLNode_copy ass = new GMLNode_copy();
//        ass.getPoint().y = 10;
//
//        GMLNode_copy lfeet = new GMLNode_copy();
//        lfeet.getPoint().x = -4;
//        GMLNode_copy rfeet = new GMLNode_copy();
//        rfeet.getPoint().x = 4;

        model3D = new Model3D();
//        model3D.addNode(head, "head");
//        model3D.addNode(chest, "chest");
//        model3D.addNode(ass,"ass");
//        model3D.addNode(rhand, "rhand");
//        model3D.addNode(lhand, "lhand");
//        model3D.addNode(lfeet, "lfeet");
//        model3D.addNode(rfeet, "rfeet");
//
//        model3D.connectNodes("head", "chest", "neck");
//        model3D.connectNodes("chest", "ass","stomach");
//        model3D.connectNodes("chest", "rhand", "rarm");
//        model3D.connectNodes("chest", "lhand", "larm");
//        model3D.connectNodes("ass", "rfeet", "rleg");
//        model3D.connectNodes("ass", "lfeet", "lleg");



//        for(int i = 0; i< 10; i++){
//            if(i%2==0){
//                NodeMovementTriple moveLHand = new NodeMovementTriple("lhand", new GMLPoint_copy(0,0,-2,5,0,0, i*10), i*10, 2);
//                NodeMovementTriple moveRHand = new NodeMovementTriple("rhand", new GMLPoint_copy(0,0,2,0,0,0, i*10), i*10, 2);
//                NodeMovementTriple moveLFeet = new NodeMovementTriple("lfeet", new GMLPoint_copy(0,0,2,0,0,10, i*10), i*10, 2);
//                NodeMovementTriple moverFeet = new NodeMovementTriple("rfeet", new GMLPoint_copy(0,0,-2,0,10,0, i*10), i*10, 2);
//                Model3D.addToMovementHistory(moveLHand);
//                Model3D.addToMovementHistory(moveRHand);
//                Model3D.addToMovementHistory(moveLFeet);
//                Model3D.addToMovementHistory(moverFeet);
//            }else {
//                NodeMovementTriple moveLHand = new NodeMovementTriple("lhand", new GMLPoint_copy(0,0,2,0,5,0, i*10), i*10, 2);
//                NodeMovementTriple moveRHand = new NodeMovementTriple("rhand", new GMLPoint_copy(0,0,-2,0,0,0, i*10), i*10, 2);
//                NodeMovementTriple moveLFeet = new NodeMovementTriple("lfeet", new GMLPoint_copy(0,0,-2,0,10,0, i*10), i*10, 2);
//                NodeMovementTriple moverFeet = new NodeMovementTriple("rfeet", new GMLPoint_copy(0,0,2,10,10,10, i*10), i*10, 2);
//                Model3D.addToMovementHistory(moveLHand);
//                Model3D.addToMovementHistory(moveRHand);
//                Model3D.addToMovementHistory(moveLFeet);
//                Model3D.addToMovementHistory(moverFeet);
//            }
//        }
//        NodeMovementTriple moveLHand = new NodeMovementTriple("lhand", new GMLPoint_copy(0,0,0,0,0,0, 100), 100, 2);
//        NodeMovementTriple moveRHand = new NodeMovementTriple("rhand", new GMLPoint_copy(0,0,0,0,0,0, 100), 100, 2);
//        NodeMovementTriple moveLFeet = new NodeMovementTriple("lfeet", new GMLPoint_copy(0,0,0,0,0,0, 100), 100, 2);
//        NodeMovementTriple moverFeet = new NodeMovementTriple("rfeet", new GMLPoint_copy(0,0,0,0,0,0, 100), 100, 2);
//        Model3D.addToMovementHistory(moveLHand);
//        Model3D.addToMovementHistory(moveRHand);
//        Model3D.addToMovementHistory(moveLFeet);
//        Model3D.addToMovementHistory(moverFeet);


        model3D.startMovement();

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

        codeArea.appendText("node1: NODE = node(point(.0, .0, .0), point(.0, .05, .0), point(.0, .0, .0));\n" +
                "\n" +
                "ADDNODE(node1);");
    }

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void handle(ActionEvent event) {
        if (event.getSource() == runButton) {

            model3D = new Model3D();

            // ---------

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
