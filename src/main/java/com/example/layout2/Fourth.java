package com.example.layout2;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.geometry.Pos;
import javafx.scene.layout.BorderPane;

public class Fourth extends Application{

    public static void main(String[] args) {

        Application.launch(args);
    }

    @Override
    public void start(Stage stage) {

        BorderPane root = new BorderPane();

        Button top = new Button("Top");
        BorderPane.setAlignment(top, Pos.CENTER);
        root.setTop(top);

        Button center = new Button("Center");
        root.setCenter(center);

        Scene scene = new Scene(root, 300, 150);
        stage.setScene(scene);

        stage.setTitle("BorderPane in JavaFX");

        stage.show();
    }
}