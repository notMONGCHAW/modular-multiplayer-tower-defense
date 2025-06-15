package com.modulartd.ui;

import com.almasb.fxgl.app.scene.FXGLMenu;
import com.almasb.fxgl.app.scene.MenuType;
import com.almasb.fxgl.dsl.FXGL;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;

public class CustomMainMenu extends FXGLMenu {

    public CustomMainMenu() {
        super(MenuType.MAIN_MENU);

        VBox menuBox = new VBox(20);
        menuBox.setAlignment(Pos.CENTER);

        Button btnSingle = new Button("Single Player");
        btnSingle.setOnAction(e -> fireNewGame());

        Button btnMulti = new Button("Multiplayer");
        btnMulti.setOnAction(e -> FXGL.showMessage("Multiplayer not implemented yet!"));

        Button btnExit = new Button("Exit");
        btnExit.setOnAction(e -> fireExit());

        menuBox.getChildren().addAll(btnSingle, btnMulti, btnExit);

        StackPane root = new StackPane(menuBox);
        root.setPrefSize(FXGL.getAppWidth(), FXGL.getAppHeight());

        getContentRoot().getChildren().setAll(root);
    }
}