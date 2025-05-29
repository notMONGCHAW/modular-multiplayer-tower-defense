package com.modulartd.ui;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;

import static com.almasb.fxgl.dsl.FXGLForKtKt.getGameScene;

public class GameScreenController {

    @FXML
    private void initialize() {
        // Set key press handler on the root node
        getGameScene().getRoot().setOnKeyPressed(this::onKeyPressed);

        // Focus the root so it receives key events
        getGameScene().getRoot().requestFocus();
    }

    private void onKeyPressed(KeyEvent event) {
        if (event.getCode() == KeyCode.ESCAPE) {
            try {
                Parent menuRoot = FXMLLoader.load(getClass().getResource("/fxml/MainMenu.fxml"));
                getGameScene().getContentRoot().getChildren().setAll(menuRoot);

                // Focus the menu root for keyboard input
                menuRoot.requestFocus();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
