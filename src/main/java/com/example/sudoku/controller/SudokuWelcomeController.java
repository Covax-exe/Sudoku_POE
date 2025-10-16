package com.example.sudoku.controller;

import com.example.sudoku.view.SudokuGameStage;
import com.example.sudoku.view.SudokuWelcomeStage;
import javafx.fxml.FXML;
import javafx.event.ActionEvent;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import java.io.IOException;

/**
 * Controller for the Welcome Stage (sudoku-welcome-view.fxml).
 * Handles the 'Play' button action and manages the transition between windows.
 */
public class SudokuWelcomeController {

    @FXML
    private TextField nicknameTxt;

    /**
     * Maneja el evento de presión de tecla en el TextField (NUEVO MÉTODO).
     * Si la tecla presionada es ENTER, llama a handlePlay.
     * @param event El evento de teclado.
     * @throws IOException Si ocurre un error de carga.
     */
    @FXML
    void handleEnterKey(KeyEvent event) throws IOException {
        if (event.getCode() == KeyCode.ENTER) {
            handlePlay(new ActionEvent());
            event.consume();
        }
    }

    /**
     * Handles the 'Play Sudoku' button press, which initiates the game.
     * @param event El evento de acción (puede ser simulado por handleEnterKey).
     * @throws IOException If the FXML for the SudokuGameStage cannot be loaded.
     */
    @FXML
    void handlePlay(ActionEvent event) throws IOException {
        try {
            // hide the welcome window (Singleton)
            SudokuWelcomeStage.getInstance().hide();

            // displays the game window (Singleton). If it does not exist, it creates it
            SudokuGameStage gameStage = SudokuGameStage.getInstance();
            gameStage.show();

        } catch (IOException e) {
            System.err.println("Error loading the main Sudoku game view.");
            e.printStackTrace();
        }
    }
}