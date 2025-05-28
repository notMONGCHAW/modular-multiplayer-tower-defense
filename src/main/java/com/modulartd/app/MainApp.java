package com.modulartd.app;

import com.almasb.fxgl.app.GameApplication;
import com.almasb.fxgl.app.GameSettings;

public class MainApp extends GameApplication {

    @Override
    protected void initSettings(GameSettings settings) {
        settings.setTitle("Modular Tower Defense");
        settings.setVersion("1.0");
        settings.setWidth(1280);
        settings.setHeight(720);
        settings.setMainMenuEnabled(false);
        settings.setGameMenuEnabled(false);
    }

    public static void main(String[] args) {
        launch(args);
    }
}
