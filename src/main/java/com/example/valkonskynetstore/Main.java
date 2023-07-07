package com.example.valkonskynetstore;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class Main extends Application {
    @Override
    public void start(Stage primaryStage) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("main.fxml"));
        primaryStage.setTitle("ValkonskyNetStore");
        primaryStage.setScene(new Scene(root,1280,600));
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}