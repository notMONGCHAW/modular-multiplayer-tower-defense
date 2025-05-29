package com.modulartd.ui;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.control.Button;

import static com.almasb.fxgl.dsl.FXGLForKtKt.getGameScene;
import static com.almasb.fxgl.dsl.FXGL.getGameController;

public class MainMenuController {

    @FXML
    private Button startButton;

    @FXML
    private Button exitButton;

    @FXML
    private void initialize() {
        startButton.setOnAction(e -> {
            try {
                Parent gameRoot = FXMLLoader.load(getClass().getResource("/fxml/GameScreen.fxml"));
                getGameScene().getContentRoot().getChildren().setAll(gameRoot);

                // Give focus to the game root to receive key events immediately
                gameRoot.requestFocus();
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        });

        exitButton.setOnAction(e -> {
            getGameController().exit();
        });
    }
}
