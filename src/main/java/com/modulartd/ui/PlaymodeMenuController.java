package com.modulartd.ui;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class PlaymodeMenuController {

    @FXML
    private Button btnBack;

    @FXML
    private void onBack() {
        try {
            Parent mainMenuRoot = FXMLLoader.load(getClass().getResource("/fxml/MainMenu.fxml"));
            Stage stage = (Stage) btnBack.getScene().getWindow();
            stage.setScene(new Scene(mainMenuRoot, 800, 600));
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}