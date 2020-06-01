package zpi;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Group;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import org.fxmisc.richtext.CodeArea;
import org.fxmisc.richtext.LineNumberFactory;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("app.fxml"));
        primaryStage.setTitle("zpi");

        Scene scene = new Scene(root, 1024, 768);
        primaryStage.setScene(scene);

        primaryStage.setMinWidth(1000);
        primaryStage.setMinHeight(800);

        primaryStage.show();

        addCodeArea(scene);
        addVisualisationArea(scene);
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

    private void addVisualisationArea(Scene scene){
        Group group = new Group();
        Model3DView viewArea = new Model3DView(scene, group);
        viewArea.createScene();
        //viewArea.handleMouse(scene, group);

        AnchorPane visualisationAnchorPane = (AnchorPane) scene.lookup("#visualisationAreaAnchorPane");
        visualisationAnchorPane.getChildren().add(group);

        group.translateXProperty().bind(visualisationAnchorPane.widthProperty().divide(2));
        group.translateYProperty().bind(visualisationAnchorPane.heightProperty().divide(2));
    }


    public static void main(String[] args) {
        launch(args);
    }
}
