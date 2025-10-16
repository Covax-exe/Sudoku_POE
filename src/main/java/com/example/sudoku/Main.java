package com.example.sudoku;

import com.example.sudoku.view.SudokuWelcomeStage;
import javafx.application.Application;
import javafx.stage.Stage;
import java.io.IOException;

/**
 * Main application class
 * This class serves as the entry point for the JavaFX application.
 */
public class Main extends Application {

    @Override
    public void start(Stage primaryStage) {
        try {
            SudokuWelcomeStage welcomeStage = SudokuWelcomeStage.getInstance();
            welcomeStage.show();
        } catch (IOException e) {
            System.err.println("Error initializing the welcome stage.");
            e.printStackTrace();
        }
    }

    /**
     * Java's standard main method for launching the application
     * @param args Command line arguments.
     */
    public static void main(String[] args) {
        launch(args);
    }
}
