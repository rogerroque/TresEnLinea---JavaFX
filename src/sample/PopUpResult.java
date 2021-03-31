package sample;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.stage.Stage;

import java.io.IOException;

public class PopUpResult {

    Game game = new Game();

    @FXML
    Label labelGanador = new Label();

    @FXML
    static Button botonVolver = new Button();

    static String elGanador;

    static Stage windowPopUp = new Stage();

    /*Este metodo lo unico que hace es crear el popup que dice el ganador y dar valor a la variable elgnador, que es el mensaje que pone en la ventana que crea*/
    public static void createPopUpResult(String ganador) throws IOException {

        windowPopUp.setTitle("Resultado");
        windowPopUp.setMinWidth(300);
        windowPopUp.setResizable(false);
        /*windowPopUp.initModality(Modality.APPLICATION_MODAL);*/
        elGanador = ganador;

        Parent root = FXMLLoader.load(PopUpResult.class.getResource("Winner.fxml"));
        Scene scene = new Scene(root, 350, 250);
        String css = PopUpResult.class.getResource("Game.css").toExternalForm();
        scene.getStylesheets().add(css);
        windowPopUp.setScene(scene);
        windowPopUp.showAndWait();


    }

    public void initialize() {
        labelGanador.setText(elGanador);
    }

    public void closePopUpWinner() {
        windowPopUp.close();
    }
}
