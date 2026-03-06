package com.example.csc325_firebase_webview_auth.view;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class App extends Application {

    private static Scene scene;

    @Override
    public void start(Stage stage) throws Exception {
        SplashScreen.show(stage);
    }

    public static void showMainView(Stage stage) throws IOException {

        FXMLLoader loader = new FXMLLoader(App.class.getResource("/files/AccessFBView.fxml"));
        scene = new Scene(loader.load(), 900, 600);

        scene.getStylesheets().add(
                App.class.getResource("/files/style.css").toExternalForm()
        );

        stage.setScene(scene);
        stage.setTitle("Firebase JavaFX App");
        stage.show();
    }

    public static void setRoot(String fxml) throws IOException {
        scene.setRoot(
                FXMLLoader.load(App.class.getResource(fxml))
        );
    }

    public static void main(String[] args) {
        launch();
    }
}
