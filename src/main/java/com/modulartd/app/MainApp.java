package com.modulartd.app;

import com.modulartd.ui.MainMenuController;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 * Entry point for the Modular Multiplayer Tower Defense application.
 * Initializes and displays the Main Menu.
 */
public class MainApp extends Application {

    private MainMenuController mainMenuController;

    @Override
    public void start(Stage primaryStage) {
        try {
            // Load FXML for the main menu
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/fxml/MainMenu.fxml"));
            Parent root = loader.load();

            // Get the controller instance from FXML
            mainMenuController = loader.getController();
            mainMenuController.setPrimaryStage(primaryStage); // Optional: Pass stage if needed

            // Set up the stage
            primaryStage.setTitle("Modular Multiplayer Tower Defense");
            primaryStage.setScene(new Scene(root));
            primaryStage.setResizable(false);
            primaryStage.show();

        } catch (Exception e) {
            e.printStackTrace();
            System.err.println("Failed to load the Main Menu.");
        }
    }

    public static void main(String[] args) {
        launch(args);
    }

    // Optionally, provide access to the main menu controller
    public MainMenuController getMainMenuController() {
        return mainMenuController;
    }
}