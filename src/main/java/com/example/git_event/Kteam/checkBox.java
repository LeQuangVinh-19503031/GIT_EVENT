package com.example.git_event.Kteam;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class checkBox extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        Label label = new Label("Program Language");
        CheckBox checkBox1 = new CheckBox("Java");
        CheckBox checkBox2 = new CheckBox("Python");
        CheckBox checkBox3 = new CheckBox("C sharp");

        checkBox1.setSelected(true);

        Button button = new Button("Submit");
        button.setOnAction(e->{
            String message = "Your language: ";
            if(checkBox1.isSelected())
                message += checkBox1.getText();
            else if(checkBox2.isSelected())
                message += checkBox2.getText();
            else
                message += checkBox3.getText();
            System.out.println(message);
            HBox layoutH = new HBox(10);
            layoutH.getChildren().addAll(checkBox1, checkBox2, checkBox3);

            VBox layoutV = new VBox(10);
            layoutV.getChildren().addAll(label, layoutH,button);

            Scene scene = new Scene(layoutV, 300,200);

//            primaryStage.setTitle("CheckBox");
            primaryStage.setScene(scene);
            primaryStage.show();
        });
    }
}
