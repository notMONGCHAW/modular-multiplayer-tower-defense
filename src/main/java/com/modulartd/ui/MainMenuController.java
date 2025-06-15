package com.modulartd.ui;

import com.almasb.fxgl.app.scene.FXGLMenu;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class MainMenuController {

    @FXML
    private Button btnPlay;
    @FXML
    private Button btnOptions;
    @FXML
    private Button btnExit;

    private FXGLMenu fxglMenu;

    public void setFXGLMenu(FXGLMenu menu) {
        this.fxglMenu = menu;
    }

    @FXML
    private void initialize() {
        btnPlay.setOnAction(e -> showPlayModeMenu());
        btnOptions.setOnAction(e -> {
            if (fxglMenu instanceof FXMLMainMenu) ((FXMLMainMenu)fxglMenu).showOptions();
        });
        btnExit.setOnAction(e -> {
            if (fxglMenu instanceof FXMLMainMenu) ((FXMLMainMenu)fxglMenu).exitGame();
        });
    }

    private void showPlayModeMenu() {
        try {
            Parent playModeRoot = FXMLLoader.load(getClass().getResource("/fxml/PlaymodeMenu.fxml"));
            Stage stage = (Stage) btnPlay.getScene().getWindow();
            stage.setScene(new Scene(playModeRoot, 800, 600));
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}