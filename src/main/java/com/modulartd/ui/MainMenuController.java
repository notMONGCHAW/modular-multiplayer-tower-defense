package com.modulartd.ui;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.stage.Stage;

/**
 * Controller for the Main Menu.
 * Handles user interactions on the main menu screen.
 */
public class MainMenuController {
    private Button playButton;
    @FXML
    private Button exitButton;

    private Stage primaryStage;

    // Optional: Allow MainApp to inject the primary stage if needed
    public void setPrimaryStage(Stage stage) {
        this.primaryStage = stage;
    }

    @FXML
    private void initialize() {
        // Any additional initialization if needed
    }

    @FXML
    private void onPlayClicked(ActionEvent event) {
        // TODO: Implement scene swap to play mode or game screen
        System.out.println("Play button clicked!");
    }

    @FXML
    private void onExitClicked(ActionEvent event) {
        // Exit the application
        if (primaryStage != null) {
            primaryStage.close();
        } else {
            // fallback in case stage is not set
            System.exit(0);
        }
    }
}