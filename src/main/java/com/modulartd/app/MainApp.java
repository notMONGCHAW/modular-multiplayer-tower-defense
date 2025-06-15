package com.modulartd.app;

import com.almasb.fxgl.app.GameApplication;
import com.almasb.fxgl.app.GameSettings;
import com.almasb.fxgl.app.scene.FXGLDefaultMenu;
import com.modulartd.ui.FXMLMainMenu;

public class MainApp extends GameApplication {

    @Override
    protected void initSettings(GameSettings settings) {
        settings.setTitle("Modular Tower Defense");
        settings.setVersion("0.1");
        settings.setWidth(800);
        settings.setHeight(600);
        settings.setMainMenuEnabled(true);
        settings.setIntroEnabled(false);
        settings.setGameMenuEnabled(false);
    }

    @Override
    protected FXGLDefaultMenu createMainMenu() {
        return new FXMLMainMenu();
    }

    public static void main(String[] args) {
        launch(args);
    }
}