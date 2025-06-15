package com.modulartd.ui;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.fxml.FXMLLoader;

/**
 * Controller for PlaymodeMenu.fxml
 */
public class PlaymodeMenuController {

    @FXML
    private Button btnSinglePlayer;
    @FXML
    private Button btnMultiplayer;
    @FXML
    private Button btnBack;

    @FXML
    private void initialize() {
        btnSinglePlayer.setOnAction(e -> startSinglePlayer());
        btnMultiplayer.setOnAction(e -> startMultiplayer());
        btnBack.setOnAction(e -> showMainMenu());
    }

    private void startSinglePlayer() {
        // TODO: Launch your single player game logic here
        System.out.println("Single Player selected");
    }

    private void startMultiplayer() {
        // TODO: Launch your multiplayer game logic here
        System.out.println("Multiplayer selected");
    }

    private void showMainMenu() {
        try {
            Parent mainMenuRoot = FXMLLoader.load(getClass().getResource("/fxml/MainMenu.fxml"));
            Stage stage = (Stage) btnBack.getScene().getWindow();
            stage.setScene(new Scene(mainMenuRoot, 800, 600));
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}