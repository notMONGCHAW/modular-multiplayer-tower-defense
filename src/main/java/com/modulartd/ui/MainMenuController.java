package com.modulartd.ui;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class MainMenuController {

    @FXML private Button btnPlay;

    @FXML
    private void onPlay() {
        try {
            Parent playModeRoot = FXMLLoader.load(getClass().getResource("/fxml/PlaymodeMenu.fxml"));
            Stage stage = (Stage) btnPlay.getScene().getWindow();
            stage.setScene(new Scene(playModeRoot, 800, 600));
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}