package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{

        Parent root = FXMLLoader.load(getClass().getResource("Game.fxml"));
        Scene scene = new Scene(root, 900, 570);
        String css = PopUpResult.class.getResource("Game.css").toExternalForm();
        scene.getStylesheets().add(css);
        primaryStage.setTitle("Choose your name");
        primaryStage.setScene(scene);
        primaryStage.setResizable(false);
        primaryStage.show();

    }

    public static void main(String[] args) {
        launch(args);
    }
}
