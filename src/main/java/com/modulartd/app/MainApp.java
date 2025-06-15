package com.modulartd.app;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 * Entry point for Modular Multiplayer Tower Defense.
 * Loads and displays the main menu.
 */
public class MainApp extends Application {
    @Override
    public void start(Stage primaryStage) {
        try {
            Parent root = FXMLLoader.load(getClass().getResource("/fxml/MainMenu.fxml"));
            primaryStage.setTitle("Modular Multiplayer Tower Defense");
            primaryStage.setScene(new Scene(root, 800, 600));
            primaryStage.setResizable(false);
            primaryStage.show();
        } catch (Exception e) {
            e.printStackTrace();
            System.err.println("Failed to load Main Menu.");
        }
    }

    public static void main(String[] args) {
        launch(args);
    }
}