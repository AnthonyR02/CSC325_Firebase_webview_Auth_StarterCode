package com.example.csc325_firebase_webview_auth.view;

import javafx.animation.PauseTransition;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import javafx.util.Duration;

public class SplashScreen {

    public static void show(Stage stage) {
        Label title = new Label("Student Firebase App");
        title.setStyle("-fx-font-size: 28px; -fx-font-weight: bold;");

        StackPane root = new StackPane(title);
        Scene splashScene = new Scene(root, 800, 500);

        stage.setScene(splashScene);
        stage.setTitle("Splash Screen");
        stage.show();

        PauseTransition pause = new PauseTransition(Duration.seconds(2));
        pause.setOnFinished(event -> {
            try {
                App.showMainView(stage);
            } catch (Exception e) {
                e.printStackTrace();
            }
        });
        pause.play();
    }
}
