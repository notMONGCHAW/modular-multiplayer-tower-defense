package com.modulartd.app;

import com.almasb.fxgl.app.GameApplication;
import com.almasb.fxgl.app.GameSettings;

public class MainApp extends GameApplication {

    @Override
    protected void initSettings(GameSettings settings) {
        settings.setWidth(800);
        settings.setHeight(600);
        settings.setTitle("MMTD");
        settings.setVersion("0.1");
        settings.setMainMenuEnabled(true);  // Enable default main menu
    }

    @Override
    protected void initGame() {
        // Initialize your game here, but it won't start until player clicks start in menu
    }

    public static void main(String[] args) {
        launch(args);
    }
}
