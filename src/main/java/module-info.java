module com.example.sudoku { // Use your module's name if it is different.
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.graphics; // Include it just in case

    // EXPORT the main class package (the launcher)
    exports com.example.sudoku;

    // OPEN the controller packages so that the FXML Loader can instantiate them
    // loader.getController() requires this line:
    opens com.example.sudoku.controller to javafx.fxml;

    // Open the view package if the Stage classes are there
    opens com.example.sudoku.view to javafx.fxml;

}