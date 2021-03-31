package sample;

import javafx.scene.control.Button;

import java.io.IOException;
import java.util.List;

public class ComprobarGanador {

    public static boolean comprobarX(List<Button> botonLista, String xwinner, boolean hayGanador) throws IOException {

        /*Este if comprueba todas las combinaciones que pueden dar victoria a la X, en caso de que se cumpla alguna, retorna la variable hayGanador con valor true, por otro lado el else if,
        * comprueba si todos los botones estan marcados, si lo estan, ya que no ha habido ganador previamente, es un empate y pone la variable hayGanador a true (aunque no lo hay) para que asi
        * pueda acabar la partida*/
        if (botonLista.get(0).getText().equals("X") && botonLista.get(1).getText().equals("X") && botonLista.get(2).getText().equals("X")) {
            /*Imprime el ganador por consola si se ejecuta desde el IDE*/
            System.out.println(xwinner);
            hayGanador = true;
            botonLista.get(0).setStyle("-fx-text-fill: rgb(59, 255, 0); -fx-background-color: rgb(108, 131, 189);");
            botonLista.get(1).setStyle("-fx-text-fill: rgb(59, 255, 0); -fx-background-color: rgb(108, 131, 189);");
            botonLista.get(2).setStyle("-fx-text-fill: rgb(59, 255, 0); -fx-background-color: rgb(108, 131, 189);");
            PopUpResult.createPopUpResult(xwinner);
        } else if (botonLista.get(0).getText().equals("X") && botonLista.get(3).getText().equals("X") && botonLista.get(6).getText().equals("X")) {
            /*Imprime el ganador por consola si se ejecuta desde el IDE*/
            System.out.println(xwinner);
           hayGanador = true;
            botonLista.get(0).setStyle("-fx-text-fill: rgb(59, 255, 0); -fx-background-color: rgb(108, 131, 189);");
            botonLista.get(3).setStyle("-fx-text-fill: rgb(59, 255, 0); -fx-background-color: rgb(108, 131, 189);");
            botonLista.get(6).setStyle("-fx-text-fill: rgb(59, 255, 0); -fx-background-color: rgb(108, 131, 189);");
           PopUpResult.createPopUpResult(xwinner);
       } else if (botonLista.get(0).getText().equals("X") && botonLista.get(4).getText().equals("X") && botonLista.get(8).getText().equals("X")) {
            /*Imprime el ganador por consola si se ejecuta desde el IDE*/
           System.out.println(xwinner);
           hayGanador = true;
            botonLista.get(0).setStyle("-fx-text-fill: rgb(59, 255, 0); -fx-background-color: rgb(108, 131, 189);");
            botonLista.get(4).setStyle("-fx-text-fill: rgb(59, 255, 0); -fx-background-color: rgb(108, 131, 189);");
            botonLista.get(8).setStyle("-fx-text-fill: rgb(59, 255, 0); -fx-background-color: rgb(108, 131, 189);");
            PopUpResult.createPopUpResult(xwinner);
       } else if (botonLista.get(6).getText().equals("X") && botonLista.get(7).getText().equals("X") && botonLista.get(8).getText().equals("X")) {
            /*Imprime el ganador por consola si se ejecuta desde el IDE*/
            System.out.println(xwinner);
            hayGanador = true;
            botonLista.get(6).setStyle("-fx-text-fill: rgb(59, 255, 0); -fx-background-color: rgb(108, 131, 189);");
            botonLista.get(7).setStyle("-fx-text-fill: rgb(59, 255, 0); -fx-background-color: rgb(108, 131, 189);");
            botonLista.get(8).setStyle("-fx-text-fill: rgb(59, 255, 0); -fx-background-color: rgb(108, 131, 189);");
            PopUpResult.createPopUpResult(xwinner);
        } else if (botonLista.get(8).getText().equals("X") && botonLista.get(5).getText().equals("X") && botonLista.get(2).getText().equals("X")) {
            /*Imprime el ganador por consola si se ejecuta desde el IDE*/
            System.out.println(xwinner);
            hayGanador = true;
            botonLista.get(8).setStyle("-fx-text-fill: rgb(59, 255, 0); -fx-background-color: rgb(108, 131, 189);");
            botonLista.get(5).setStyle("-fx-text-fill: rgb(59, 255, 0); -fx-background-color: rgb(108, 131, 189);");
            botonLista.get(2).setStyle("-fx-text-fill: rgb(59, 255, 0); -fx-background-color: rgb(108, 131, 189);");
            PopUpResult.createPopUpResult(xwinner);
        } else if (botonLista.get(2).getText().equals("X") && botonLista.get(4).getText().equals("X") && botonLista.get(6).getText().equals("X")) {
            /*Imprime el ganador por consola si se ejecuta desde el IDE*/
            System.out.println(xwinner);
            hayGanador = true;
            botonLista.get(2).setStyle("-fx-text-fill: rgb(59, 255, 0); -fx-background-color: rgb(108, 131, 189);");
            botonLista.get(4).setStyle("-fx-text-fill: rgb(59, 255, 0); -fx-background-color: rgb(108, 131, 189);");
            botonLista.get(6).setStyle("-fx-text-fill: rgb(59, 255, 0); -fx-background-color: rgb(108, 131, 189);");
            PopUpResult.createPopUpResult(xwinner);
        } else if (botonLista.get(3).getText().equals("X") && botonLista.get(4).getText().equals("X") && botonLista.get(5).getText().equals("X")) {
            /*Imprime el ganador por consola si se ejecuta desde el IDE*/
            System.out.println(xwinner);
            hayGanador = true;
            botonLista.get(3).setStyle("-fx-text-fill: rgb(59, 255, 0); -fx-background-color: rgb(108, 131, 189);");
            botonLista.get(4).setStyle("-fx-text-fill: rgb(59, 255, 0); -fx-background-color: rgb(108, 131, 189);");
            botonLista.get(5).setStyle("-fx-text-fill: rgb(59, 255, 0); -fx-background-color: rgb(108, 131, 189);");
            PopUpResult.createPopUpResult(xwinner);
        } else if (botonLista.get(1).getText().equals("X") && botonLista.get(4).getText().equals("X") && botonLista.get(7).getText().equals("X")) {
            /*Imprime el ganador por consola si se ejecuta desde el IDE*/
            System.out.println(xwinner);
            hayGanador = true;
            botonLista.get(1).setStyle("-fx-text-fill: rgb(59, 255, 0); -fx-background-color: rgb(108, 131, 189);");
            botonLista.get(4).setStyle("-fx-text-fill: rgb(59, 255, 0); -fx-background-color: rgb(108, 131, 189);");
            botonLista.get(7).setStyle("-fx-text-fill: rgb(59, 255, 0); -fx-background-color: rgb(108, 131, 189);");
            PopUpResult.createPopUpResult(xwinner);
        } else if (!botonLista.get(0).getText().equals("") && !botonLista.get(1).getText().equals("") && !botonLista.get(2).getText().equals("") && !botonLista.get(3).getText().equals("")
                && !botonLista.get(4).getText().equals("") && !botonLista.get(5).getText().equals("") && !botonLista.get(6).getText().equals("") && !botonLista.get(7).getText().equals("")
                && !botonLista.get(8).getText().equals("")) {
            /*Imprime el ganador por consola si se ejecuta desde el IDE*/
                    System.out.println("Empate");
                    hayGanador = true;
                    PopUpResult.createPopUpResult("Empate");
        } else {
            hayGanador = false;
        }

        return hayGanador;

    }

    public static boolean comprobarO(List<Button> botonLista, String owinner, boolean hayGanador) throws IOException {

        /*Este if comprueba todas las combinaciones que pueden dar victoria a la O, en caso de que se cumpla alguna, retorna la variable hayGanador con valor true, por otro lado el else if,
         * comprueba si todos los botones estan marcados, si lo estan, ya que no ha habido ganador previamente, es un empate y pone la variable hayGanador a true (aunque no lo hay) para que asi
         * pueda acabar la partida*/
        if (botonLista.get(0).getText().equals("O") && botonLista.get(1).getText().equals("O") && botonLista.get(2).getText().equals("O")) {
            /*Imprime el ganador por consola si se ejecuta desde el IDE*/
            System.out.println(owinner);
            hayGanador = true;
            botonLista.get(0).setStyle("-fx-text-fill: rgb(255, 0, 0); -fx-background-color: rgb(108, 131, 189);");
            botonLista.get(1).setStyle("-fx-text-fill: rgb(255, 0, 0); -fx-background-color: rgb(108, 131, 189);");
            botonLista.get(2).setStyle("-fx-text-fill: rgb(255, 0, 0); -fx-background-color: rgb(108, 131, 189);");
            PopUpResult.createPopUpResult(owinner);
        } else if (botonLista.get(0).getText().equals("O") && botonLista.get(3).getText().equals("O") && botonLista.get(6).getText().equals("O")) {
            System.out.println(owinner);
            hayGanador = true;
            botonLista.get(0).setStyle("-fx-text-fill: rgb(255, 0, 0); -fx-background-color: rgb(108, 131, 189);");
            botonLista.get(3).setStyle("-fx-text-fill: rgb(255, 0, 0); -fx-background-color: rgb(108, 131, 189);");
            botonLista.get(6).setStyle("-fx-text-fill: rgb(255, 0, 0); -fx-background-color: rgb(108, 131, 189);");
            PopUpResult.createPopUpResult(owinner);
        } else if (botonLista.get(0).getText().equals("O") && botonLista.get(4).getText().equals("O") && botonLista.get(8).getText().equals("O")) {
            System.out.println(owinner);
            hayGanador = true;
            botonLista.get(0).setStyle("-fx-text-fill: rgb(255, 0, 0); -fx-background-color: rgb(108, 131, 189);");
            botonLista.get(4).setStyle("-fx-text-fill: rgb(255, 0, 0); -fx-background-color: rgb(108, 131, 189);");
            botonLista.get(8).setStyle("-fx-text-fill: rgb(255, 0, 0); -fx-background-color: rgb(108, 131, 189);");
            PopUpResult.createPopUpResult(owinner);
        } else if (botonLista.get(6).getText().equals("O") && botonLista.get(7).getText().equals("O") && botonLista.get(8).getText().equals("O")) {
            System.out.println(owinner);
            hayGanador = true;
            botonLista.get(6).setStyle("-fx-text-fill: rgb(255, 0, 0); -fx-background-color: rgb(108, 131, 189);");
            botonLista.get(7).setStyle("-fx-text-fill: rgb(255, 0, 0); -fx-background-color: rgb(108, 131, 189);");
            botonLista.get(8).setStyle("-fx-text-fill: rgb(255, 0, 0); -fx-background-color: rgb(108, 131, 189);");
            PopUpResult.createPopUpResult(owinner);
        } else if (botonLista.get(8).getText().equals("O") && botonLista.get(5).getText().equals("O") && botonLista.get(2).getText().equals("O")) {
            System.out.println(owinner);
            hayGanador = true;
            botonLista.get(8).setStyle("-fx-text-fill: rgb(255, 0, 0); -fx-background-color: rgb(108, 131, 189);");
            botonLista.get(5).setStyle("-fx-text-fill: rgb(255, 0, 0); -fx-background-color: rgb(108, 131, 189);");
            botonLista.get(2).setStyle("-fx-text-fill: rgb(255, 0, 0); -fx-background-color: rgb(108, 131, 189);");
            PopUpResult.createPopUpResult(owinner);
        } else if (botonLista.get(2).getText().equals("O") && botonLista.get(4).getText().equals("O") && botonLista.get(6).getText().equals("O")) {
            System.out.println(owinner);
            hayGanador = true;
            botonLista.get(2).setStyle("-fx-text-fill: rgb(255, 0, 0); -fx-background-color: rgb(108, 131, 189);");
            botonLista.get(4).setStyle("-fx-text-fill: rgb(255, 0, 0); -fx-background-color: rgb(108, 131, 189);");
            botonLista.get(6).setStyle("-fx-text-fill: rgb(255, 0, 0); -fx-background-color: rgb(108, 131, 189);");
            PopUpResult.createPopUpResult(owinner);
        } else if (botonLista.get(3).getText().equals("O") && botonLista.get(4).getText().equals("O") && botonLista.get(5).getText().equals("O")) {
            System.out.println(owinner);
            hayGanador = true;
            botonLista.get(3).setStyle("-fx-text-fill: rgb(255, 0, 0); -fx-background-color: rgb(108, 131, 189);");
            botonLista.get(4).setStyle("-fx-text-fill: rgb(255, 0, 0); -fx-background-color: rgb(108, 131, 189);");
            botonLista.get(5).setStyle("-fx-text-fill: rgb(255, 0, 0); -fx-background-color: rgb(108, 131, 189);");
            PopUpResult.createPopUpResult(owinner);
        } else if (botonLista.get(1).getText().equals("O") && botonLista.get(4).getText().equals("O") && botonLista.get(7).getText().equals("O")) {
            System.out.println(owinner);
            hayGanador = true;
            botonLista.get(1).setStyle("-fx-text-fill: rgb(255, 0, 0); -fx-background-color: rgb(108, 131, 189);");
            botonLista.get(4).setStyle("-fx-text-fill: rgb(255, 0, 0); -fx-background-color: rgb(108, 131, 189);");
            botonLista.get(7).setStyle("-fx-text-fill: rgb(255, 0, 0); -fx-background-color: rgb(108, 131, 189);");
            PopUpResult.createPopUpResult(owinner);
        } else if (!botonLista.get(0).getText().equals("") && !botonLista.get(1).getText().equals("") && !botonLista.get(2).getText().equals("") && !botonLista.get(3).getText().equals("")
                && !botonLista.get(4).getText().equals("") && !botonLista.get(5).getText().equals("") && !botonLista.get(6).getText().equals("") && !botonLista.get(7).getText().equals("")
                && !botonLista.get(8).getText().equals("")) {
                /*Imprime el ganador por consola si se ejecuta desde el IDE*/
                    System.out.println("Empate");
                    hayGanador = true;
                    PopUpResult.createPopUpResult("Empate");
        } else {
            hayGanador = false;
        }

        return hayGanador;

    }

}
