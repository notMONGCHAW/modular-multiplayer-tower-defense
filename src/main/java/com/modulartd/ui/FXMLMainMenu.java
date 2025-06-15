package com.modulartd.ui;

import com.almasb.fxgl.app.scene.FXGLMenu;
import com.almasb.fxgl.app.scene.MenuType;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;

public class FXMLMainMenu extends FXGLMenu {

    public FXMLMainMenu() {
        super(MenuType.MAIN_MENU);

        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/fxml/MainMenu.fxml"));
            Parent root = loader.load();
            MainMenuController controller = loader.getController();
            controller.setFXGLMenu(this);
            getContentRoot().getChildren().setAll(root);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // Public method to show the options menu using the protected FXGLMenu method
    public void showOptions() {
//        fireOptionsMenu();
    }

    // Public method to exit the game using the protected FXGLMenu method
    public void exitGame() {
        fireExit();
    }
}