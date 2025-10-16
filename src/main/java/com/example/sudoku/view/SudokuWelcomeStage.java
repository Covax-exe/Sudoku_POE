package com.example.sudoku.view;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import java.io.IOException;
import java.util.Objects;

import javafx.scene.image.Image;

/**
 * Custom Stage for the Welcome screen.
 * Implements Singleton pattern to guarantee only one welcome window exists.
 */
public class SudokuWelcomeStage extends Stage {

    private static SudokuWelcomeStage instance;

    private static final String FXML_PATH = "/com/example/sudoku/sudoku-welcome-view.fxml";
    private static final String APP_TITLE = "Sudoku 404 - Welcome";

    /**
     * Private constructor to prevent the creation of external instances
     */
    private SudokuWelcomeStage() throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource(FXML_PATH));
        Parent root = loader.load();

        this.setTitle(APP_TITLE);
        this.setScene(new Scene(root));
        this.setResizable(false);
        this.centerOnScreen();

        // set icon
        try {
            Image icon = new Image(getClass().getResourceAsStream("/images/icon.png"));
            this.getIcons().add(icon);
        } catch (Exception e) {
            System.err.println("Warning: The icon could not be loaded from the path /images/icon.png. " + e.getMessage());
        }
    }

    /**
     * Singleton access method. Creates the instance if it does not exist
     */
    public static SudokuWelcomeStage getInstance() throws IOException {
        if (instance == null) {
            instance = new SudokuWelcomeStage();
        }
        return instance;
    }
}