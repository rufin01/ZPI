package zpi;

import javafx.animation.AnimationTimer;
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
import library.GMLNode;
import org.fxmisc.richtext.CodeArea;
import org.fxmisc.richtext.LineNumberFactory;

public class Main extends Application implements EventHandler<ActionEvent> {

    private double mousePosX, mousePosY;
    private double mouseOldX, mouseOldY;
    private final Rotate rotateX = new Rotate(-20, Rotate.X_AXIS);
    private final Rotate rotateY = new Rotate(-20, Rotate.Y_AXIS);

    private Button runButton;
    private CodeArea codeArea;

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

        GMLNode head = new GMLNode();
        head.getPoint().y=22;

        GMLNode chest = new GMLNode();
        chest.getPoint().y = 15;

        GMLNode lhand = new GMLNode();
        lhand.getPoint().x = -6;
        lhand.getPoint().y = 10;
        GMLNode rhand = new GMLNode();
        rhand.getPoint().x = 6;
        rhand.getPoint().y = 10;

        GMLNode ass = new GMLNode();
        ass.getPoint().y = 10;

        GMLNode lfeet = new GMLNode();
        lfeet.getPoint().x = -4;
        GMLNode rfeet = new GMLNode();
        rfeet.getPoint().x = 4;

        Model3D model3D = new Model3D();
        model3D.addNode(head, "head");
        model3D.addNode(chest, "chest");
        model3D.addNode(ass,"ass");
        model3D.addNode(rhand, "rhand");
        model3D.addNode(lhand, "lhand");
        model3D.addNode(lfeet, "lfeet");
        model3D.addNode(rfeet, "rfeet");

        model3D.connectNodes("head", "chest", "neck");
        model3D.connectNodes("chest", "ass","stomach");
        model3D.connectNodes("chest", "rhand", "rarm");
        model3D.connectNodes("chest", "lhand", "larm");
        model3D.connectNodes("ass", "rfeet", "rleg");
        model3D.connectNodes("ass", "lfeet", "lleg");

        AnimationTimer animationTimer = new AnimationTimer() {
            boolean right = true;
            long counter = 25;
            long counter2 = 0;
            @Override
            public void handle(long l) {
                if(counter%25==0&&counter!=0)right=!right;
                if(right){
                    counter++;
                }else counter--;
                counter2++;
                model3D.moveNode("lhand",-6,10,counter/2,0,0,0);
                model3D.moveNode("rhand",6,10,-counter/2,0,0,0);
                model3D.moveNode("lfeet",-4,0,-counter/2,0,0,0);
                model3D.moveNode("rfeet",4,0,counter/2,0,0,0);

            }
        };

        PerspectiveCamera camera = new PerspectiveCamera(true);
        camera.getTransforms().addAll(rotateX, rotateY, new Translate(0, 0, -35));

        Group root3D = new Group(camera, model3D.getModel());
        SubScene subScene = new SubScene(root3D, 30000, 30000, true, SceneAntialiasing.BALANCED);
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
            mousePosX = me.getSceneX();
            mousePosY = me.getSceneY();
            rotateX.setAngle(rotateX.getAngle()-(mousePosY - mouseOldY));
            rotateY.setAngle(rotateY.getAngle()+(mousePosX - mouseOldX));
            mouseOldX = mousePosX;
            mouseOldY = mousePosY;
        });

        subScene.setOnScroll((ScrollEvent se) -> {
            camera.setTranslateZ(camera.getTranslateZ() + se.getDeltaY()/10);
        });

        animationTimer.start();
    }

    private void addCodeArea(Scene scene) {
        codeArea = new CodeArea();

        // add line numbers to the left of area
        codeArea.setParagraphGraphicFactory(LineNumberFactory.get(codeArea));

        AnchorPane codeAreaAnchorPane = (AnchorPane) scene.lookup("#codeAreaAnchorPane");
        codeAreaAnchorPane.getChildren().add(codeArea);

        codeArea.prefWidthProperty().bind(codeAreaAnchorPane.widthProperty());
        codeArea.prefHeightProperty().bind(codeAreaAnchorPane.heightProperty());
    }

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void handle(ActionEvent event) {
        if (event.getSource() == runButton) {
            String code = codeArea.getText();
            // System.out.println(code);
        }
    }
}
