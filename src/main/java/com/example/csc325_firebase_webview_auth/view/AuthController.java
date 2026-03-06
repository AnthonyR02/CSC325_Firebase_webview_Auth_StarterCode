package com.example.csc325_firebase_webview_auth.view;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

public class AuthController {

    @FXML
    private TextField nameField;

    @FXML
    private TextField emailField;

    @FXML
    private PasswordField passwordField;

    @FXML
    private Label statusLabel;

    @FXML
    private void handleRegister() {

        String name = nameField.getText();
        String email = emailField.getText();

        statusLabel.setText("Registered user: " + name + " (" + email + ")");
    }

    @FXML
    private void handleSignIn() {

        String email = emailField.getText();

        statusLabel.setText("Signed in: " + email);
    }
}
