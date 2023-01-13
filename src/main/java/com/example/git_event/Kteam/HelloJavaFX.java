package com.example.git_event.Kteam;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class HelloJavaFX extends Application {

    Stage window;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        window = primaryStage;
        Button button = new Button("Hello javafx");
        Label label = new Label("Welcome to event-driven !");
        StackPane layout = new StackPane();
        layout.getChildren().setAll(label,button);
        Scene scene = new Scene(layout, 300, 300);
        window.setTitle("Welcome to the first project");
        window.setScene(scene);
        window.show();
    }
}
