package com.example.layout2;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import javafx.scene.layout.Priority;

public class Third extends Application{

    public static void main(String[] args) {

        Application.launch(args);
    }

    @Override
    public void start(Stage stage) {

        Button okBtn = new Button("OK");
        Button cancelBtn = new Button("Cancel");
        Label lbl = new Label("Select");

        VBox vbox = new VBox(15);

        VBox.setVgrow(okBtn, Priority.ALWAYS);
        okBtn.setMaxWidth(100);
        //okBtn.setMaxWidth(100);

        VBox.setVgrow(cancelBtn, Priority.ALWAYS);
        cancelBtn.setMaxWidth(100);
        //cancelBtn.setMaxWidth(100);

        vbox.getChildren().addAll(lbl, okBtn, cancelBtn);

        Scene scene = new Scene(vbox, 300, 150);
        stage.setScene(scene);

        stage.setTitle("VBox in JavaFX");

        stage.show();
    }
}