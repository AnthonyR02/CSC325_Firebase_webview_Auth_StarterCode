package com.example.csc325_firebase_webview_auth.view;

import com.example.csc325_firebase_webview_auth.model.Person;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.FileChooser;
import javafx.stage.Stage;

import java.io.File;
import java.io.FileInputStream;

public class AccessFBView {

    @FXML
    private ImageView profileImageView;

    @FXML
    private TableView<Person> personTable;

    @FXML
    private TableColumn<Person, String> nameColumn;

    @FXML
    private TableColumn<Person, String> majorColumn;

    @FXML
    private TableColumn<Person, Integer> ageColumn;

    ObservableList<Person> list = FXCollections.observableArrayList();

    @FXML
    public void initialize(){

        nameColumn.setCellValueFactory(cell -> cell.getValue().nameProperty());
        majorColumn.setCellValueFactory(cell -> cell.getValue().majorProperty());
        ageColumn.setCellValueFactory(cell -> cell.getValue().ageProperty().asObject());

        personTable.setItems(list);
    }

    @FXML
    private void addSample(){

        list.add(new Person("Anthony","Computer Science",21));
    }

    @FXML
    private void uploadPicture(){

        FileChooser chooser = new FileChooser();

        chooser.getExtensionFilters().add(
                new FileChooser.ExtensionFilter("Images","*.png","*.jpg")
        );

        Stage stage = (Stage) profileImageView.getScene().getWindow();

        File file = chooser.showOpenDialog(stage);

        try{

            Image img = new Image(new FileInputStream(file));

            profileImageView.setImage(img);

        }catch(Exception e){
            e.printStackTrace();
        }
    }

    @FXML
    private void openAuth() throws Exception{

        App.setRoot("/files/AuthView.fxml");
    }

    @FXML
    private void exitApp(){

        System.exit(0);
    }
}
