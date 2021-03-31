package sample;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class Game {

    Random random = new Random();

    @FXML
    Button boton1, boton2, boton3, boton4, boton5, boton6, boton7, boton8, boton9;
    @FXML
    List<Button> buttonList;
    @FXML
    RadioButton playerPlayer, playerMachine, machineMachine;
    @FXML
    ToggleGroup gameMode;
    @FXML
    Button startGame;
    @FXML
    Label gameModeLabel;
    @FXML
    Label buttonsDisabledLabel;
    @FXML

    boolean hayGanador;
    static String turno = "X";
    String XWinner = "Ha ganado la X";
    String OWinner = "Ha ganado la O";

    /********** PLAYER VS PLAYER MODE **********/
    public void playerPlayer() throws IOException {

        enableButtons();

        /*for que da 9 vueltas, que es el tamaño de la lista, ya que hay 9 boton dentro*/
        for (int i = 0; i < buttonList.size(); i++) {
            /*buttonList.get(i) le añado el setOnAction para pasarle un obejeto tipo EventHandler, para utilizarlo en el la linea Button boton = (Button) e.getSource();, ya que si lo recive
            * por parametro cuando llamo al metodo desde el initialize tendria que pasar el objeto tipo EventHandler el cual no sabia como*/
            buttonList.get(i).setOnAction(e -> {
                Button boton = (Button) e.getSource();
                /*if para comprobar si el boton clicado esta vacio, en caso de que lo este se pone la marca, en caso de que no, no la pone*/
                if (boton.getText().equals("")) {
                    /*if para cambiar el color de la marca dependiendo de lo que valga la variable turno*/
                    if (turno.equals("X")) {
                        boton.setStyle("-fx-text-fill: rgb(36, 201, 64);");
                    } else {
                        boton.setStyle("-fx-text-fill: rgb(232, 12, 45);");
                    }
                    boton.setText(turno);
                    turno = switchPlayer(turno);

                    /*Llamada al metodo que comprueba si la X ha ganado, en caso de que la X gane, la variable hay ganador vale true*/
                    try{hayGanador = ComprobarGanador.comprobarX(buttonList, XWinner, hayGanador);}catch (IOException ioException){ioException.printStackTrace();}
                    /*if para comprobar si la X ha ganado antes, en ese caso la variable hay ganador sera true y no entrara a comprobar si el la O ha ganado, en el caso
                    * de no estar este if, cuando llama al metodo para comprobar si la O a ganado, la variable hayGanador se pone a false y genera problemas*/
                    if (!hayGanador) {
                        try{
                            ComprobarGanador.comprobarO(buttonList, OWinner, hayGanador);}catch(IOException ioException){ioException.printStackTrace(); }
                    }

                }
            });
        }
    }

    /********** PLAYER VS MACHINE MODE **********/
    public void playerMachine() {

        enableButtons();

        /*for que da 9 vueltas, que es el tamaño de la lista, ya que hay 9 boton dentro*/
        for (int i = 0; i < buttonList.size(); i++) {
            /*buttonList.get(i) le añado el setOnAction para pasarle un obejeto tipo EventHandler, para utilizarlo en el la linea Button boton = (Button) e.getSource();, ya que si lo recive
             * por parametro cuando llamo al metodo desde el initialize tendria que pasar el objeto tipo EventHandler el cual no sabia como*/
            buttonList.get(i).setOnAction(e -> {
                Button boton = (Button) e.getSource();
                /*if para comprobar si el boton clicado esta vacio, en caso de que lo este se pone la marca, en caso de que no, no la pone*/
                if (boton.getText().equals("")) {
                    /*if para cambiar el color de la marca dependiendo de lo que valga la variable turno*/
                    if (turno.equals("X")) {
                        boton.setStyle("-fx-text-fill: rgb(36, 201, 64);");
                    } else {
                        boton.setStyle("-fx-text-fill: rgb(232, 12, 45);");
                    }
                    boton.setText(turno);
                    turno = switchPlayer(turno);

                    /*Llamada al metodo que comprueba si la X ha ganado, en caso de que la X gane, la variable hay ganador vale true*/
                    try {hayGanador = ComprobarGanador.comprobarX(buttonList, XWinner, hayGanador);}catch (IOException ioException) {ioException.printStackTrace();}
                    /*if para comprobar si la X ha ganado antes, en ese caso la variable hay ganador sera true y no entrara a comprobar si el la O ha ganado, en el caso
                     * de no estar este if, cuando llama al metodo para comprobar si la O a ganado, la variable hayGanador se pone a false y genera problemas*/
                    if (!hayGanador) {
                        try{hayGanador = ComprobarGanador.comprobarO(buttonList, OWinner, hayGanador);}catch (IOException ioException) {ioException.printStackTrace();}
                    }

                    boolean quedan = false;
                    /*Este for recorre la lista de botones para comprobar si queda algun boton libre, en el caso de que quede pone la variable quedan a true, de lo contrario se queda en false*/
                    for (Button button : buttonList) {
                        if (button.getText().equals("")) {
                            quedan = true;
                            break;
                        }
                    }

                    /*if que comprueba si quedan botones en los que la maquina puede poner marca y si hay un ganador, en el caso de que se cumplan ambas condiciones, la maquina no puede poner,
                    * lo que soluciona el problema de que la maquina busca un boton donde poner infinimente  */
                    if (quedan && !hayGanador) {
                        int num;
                        /*este for que da solo una vuelta, por que mas adelante si la condicion no se cumple se le resta a la j*/
                        for (int j = 0; j < 1; j++) {
                            /*Genera un numero randon entre 0 y 8 que sera el boton en el que pondra la maquina*/
                            num = random.nextInt(9);
                            /*Este if, comprueba si el boton que se clica esta vacio, si lo esta, pone la marca, en el caso de que no este vacio, salta el else, que lo que hace es restarle uno a la j,
                            * de esta manera no sale del bucle hasta que no encuentra un boton, se sabe que quedan botones libres, ya que de lo contrario no hubiese entrado al blucle.*/
                            if (buttonList.get(num).getText().equals("")) {
                                /*if para cambiar el color de la marca dependiendo de lo que valga la variable turno*/
                                if (turno.equals("X")) {
                                    buttonList.get(num).setStyle("-fx-text-fill: rgb(36, 201, 64);");
                                } else {
                                    buttonList.get(num).setStyle("-fx-text-fill: rgb(232, 12, 45);");
                                }
                                buttonList.get(num).setText(turno);
                                turno = switchPlayer(turno);

                                /*Llamada al metodo que comprueba si la X ha ganado, en caso de que la X gane, la variable hay ganador vale true*/
                                try {hayGanador = ComprobarGanador.comprobarX(buttonList, XWinner, hayGanador);}catch (IOException ioException) {ioException.printStackTrace();}
                                /*if para comprobar si la X ha ganado antes, en ese caso la variable hay ganador sera true y no entrara a comprobar si el la O ha ganado, en el caso
                                 * de no estar este if, cuando llama al metodo para comprobar si la O a ganado, la variable hayGanador se pone a false y genera problemas*/
                                if (!hayGanador) {
                                    try{hayGanador = ComprobarGanador.comprobarO(buttonList, OWinner, hayGanador);}catch (IOException ioException) {ioException.printStackTrace();}
                                }

                            } else {
                                j--;
                            }
                        }
                    }
                }
            });
        }
    }

    /********** MACHINE VS MACHINE MODE **********/
    public void machineMachine() throws IOException {

        enableButtons();
        int num;

        for (int i = 0; i < buttonList.size(); i++) {
            /*Genera un numero randon entre 0 y 8 que sera el boton en el que pondra la maquina*/
            num = random.nextInt(9);
            /*Este if, comprueba si el boton que se clica esta vacio, si lo esta, pone la marca, en el caso de que no este vacio, salta el else, que lo que hace es restarle uno a la j,
             * de esta manera no sale del bucle hasta que no encuentra un boton, se sabe que quedan botones libres, ya que de lo contrario no hubiese entrado al blucle.*/
            if (buttonList.get(num).getText().equals("")) {
                /*if para cambiar el color de la marca dependiendo de lo que valga la variable turno*/
                if (turno.equals("X")) {
                    buttonList.get(num).setStyle("-fx-text-fill: rgb(36, 201, 64);");
                } else {
                    buttonList.get(num).setStyle("-fx-text-fill: rgb(232, 12, 45);");
                }
                buttonList.get(num).setText(turno);
                turno = switchPlayer(turno);

                /*Llamada al metodo que comprueba si la X ha ganado, en caso de que la X gane, la variable hay ganador vale true*/
                hayGanador = ComprobarGanador.comprobarX(buttonList, XWinner, hayGanador);
                /*if para comprobar si la X ha ganado antes, en ese caso la variable hay ganador sera true y no entrara a comprobar si el la O ha ganado, en el caso
                 * de no estar este if, cuando llama al metodo para comprobar si la O a ganado, la variable hayGanador se pone a false y genera problemas*/
                if (!hayGanador) {
                    hayGanador = ComprobarGanador.comprobarO(buttonList, OWinner, hayGanador);
                }

                /*Si hay ganador, sale del bucle, y pone el turno a X, ya que la X siempre pone primero*/
                if (hayGanador) {
                    turno = "X";
                    break;
                }

            } else {
                i--;
            }
        }
    }


    /********** Metodo para cambiar la marca que representa a cada jugador **********/
    private static String switchPlayer(String turno) {
        turno = turno.equals("X") ? "O" : "X";
        return turno;
    }

    /********** Metodo para resetean todos los botones **********/
    public void reset() {
        buttonList = Arrays.asList(boton1, boton2, boton3, boton4, boton5, boton6, boton7, boton8, boton9);
        for (Button button : buttonList) {
            button.setText("");
        }
        turno = "X";

        for (Button button : buttonList) {
            button.setStyle("-fx-background-color: rgb(74, 68, 105);");
        }
    }

    /********** Metodo para activar todos los botones **********/
    public void enableButtons() {
        for (Button button : buttonList) {
            button.setDisable(false);
        }
    }

    /********** Metodo para desactivar todos los botones **********/
    public void disableButtons() {
        for (Button button : buttonList) {
            button.setDisable(true);
        }
    }

    /********** Method initialized **********/
    public void initialize() throws IOException {

        /*Esta label indica que los botones estan desabilitados, para indicar al jugador que los botones estan desabilitados*/
        buttonsDisabledLabel.setText("Buttons are disabled!");

        buttonList = Arrays.asList(boton1, boton2, boton3, boton4, boton5, boton6, boton7, boton8, boton9);
        disableButtons();

        gameMode.selectedToggleProperty().addListener((observableValue, toggle, t1) -> {

            /*if para comprobar si el radiobotton esta seleccionado, en el caso de que si llama al metodo playerPlayer()*/
            if (playerPlayer.isSelected()) {
                startGame.setText("START GAME");
                startGame.setOnAction(e -> {
                    try {
                        startGame.setText("PLAY AGAIN");
                        System.out.println("SE EJECUTA EL MODO PVP");
                        gameModeLabel.setText("Player VS Player");
                        /*Resetea el tablero cada vez que el jugador vaya a comenzar una partida*/
                        reset();
                        /*Llama al metodo playerPlayer() para comenzar la partida*/
                        enableButtons();
                        buttonsDisabledLabel.setVisible(false);
                        playerPlayer.setStyle("");
                        playerPlayer();
                    } catch (IOException ioException){ioException.printStackTrace();}
                });
            } else if (playerMachine.isSelected()) {
                startGame.setText("START GAME");
                startGame.setOnAction(e -> {
                    startGame.setText("PLAY AGAIN");
                    System.out.println("SE EJECUTA EL PVM");
                    gameModeLabel.setText("Player VS Machine");
                    /*Resetea el tablero cada vez que el jugador vaya a comenzar una partida*/
                    reset();
                    /*Llama al metodo playerMachine() para comenzar la partida*/
                    enableButtons();
                    buttonsDisabledLabel.setVisible(false);
                    playerMachine();
                });
            } else if (machineMachine.isSelected()){
                startGame.setText("START GAME");
                startGame.setOnAction(e -> {
                    try {
                        System.out.println("SE EJECUTA EL MVM");
                        startGame.setText("PLAY AGAIN");
                        gameModeLabel.setText("Machine VS Machine");
                        /*Resetea el tablero cada vez que el jugador vaya a comenzar una partida*/
                        reset();
                        /*Llama al metodo machineMachine() para comenzar la partida*/
                        enableButtons();
                        buttonsDisabledLabel.setVisible(false);
                        machineMachine();
                    }catch (IOException ioException){ioException.printStackTrace();}
                });
            } else {

            }
        });
    }
}
