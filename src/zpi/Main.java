package zpi;

import javafx.animation.AnimationTimer;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.*;
import javafx.scene.input.MouseEvent;
import javafx.scene.input.ScrollEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.paint.PhongMaterial;
import javafx.scene.shape.Box;
import javafx.scene.shape.Cylinder;
import javafx.scene.shape.Sphere;
import javafx.scene.transform.Rotate;
import javafx.scene.transform.Translate;
import javafx.stage.Stage;
import library.GMLNode;
import org.fxmisc.richtext.CodeArea;
import org.fxmisc.richtext.LineNumberFactory;

public class Main extends Application {

    private double mousePosX, mousePosY;
    private double mouseOldX, mouseOldY;
    private final Rotate rotateX = new Rotate(-20, Rotate.X_AXIS);
    private final Rotate rotateY = new Rotate(-20, Rotate.Y_AXIS);

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("app.fxml"));

        Scene scene = new Scene(root, 1024, 768);
        primaryStage.setScene(scene);

        primaryStage.setMinWidth(1000);
        primaryStage.setMinHeight(800);

        primaryStage.setTitle("zpi");
        primaryStage.show();

        addCodeArea(scene);

        GMLNode node1 = new GMLNode();
        GMLNode node2 = new GMLNode();
        node2.getPoint().x = 5;
        node2.getPoint().y = 5;
        node2.getPoint().z = 5;
        GMLNode node3 = new GMLNode();
        node3.getPoint().x = -5;
        node3.getPoint().y = 25;
        node3.getPoint().z = -15;

        Model3D model3D = new Model3D();
        model3D.addNode(node1, "node1");
        model3D.addNode(node2, "node2");
        //model3D.addNode(node3,"3");
        model3D.connectNodes("node1", "node2", "edge");
        //model3D.connectNodes("node2", "3","w");
        AnimationTimer animationTimer = new AnimationTimer() {
            boolean right = true;
            long counter = 0;
            long counter2 = 0;
            @Override
            public void handle(long l) {
                if(counter%100==0)right=!right;
                if(right){
                    counter++;
                }else counter--;
                counter2++;
                //model3D.deleteEdge1("edge");
                //model3D.getModel().getChildren().remove(2);
                model3D.moveNode("node1", counter/2,0,0,counter2/2,counter2/2,counter2/2);
                //System.out.print(model3D.connectNodes("node1", "node2", "edge"));

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
        CodeArea codeArea = new CodeArea();

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
}
