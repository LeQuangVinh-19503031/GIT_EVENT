package com.example.git_event.Kteam;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Node;
import javafx.scene.control.*;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;
import javafx.util.Pair;

import java.util.Optional;

public class twoLayout extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        javafx.scene.control.Dialog<Pair<String, String>> dialog = new javafx.scene.control.Dialog<>();
        dialog.setTitle("Login Dialog");
        dialog.setHeaderText("Sign Up");

        ButtonType loginButtonType = new ButtonType("Login", ButtonBar.ButtonData.OK_DONE);
        dialog.getDialogPane().getButtonTypes().addAll(loginButtonType, ButtonType.CANCEL);
        GridPane grid = new GridPane();
        grid.setHgap(10);
        grid.setVgap(10);
        grid.setPadding(new Insets(20,150,10,10));

        TextField userName = new TextField();
        userName.setPromptText("Username");
        PasswordField passwordField = new PasswordField();
        passwordField.setPromptText("Password");
        grid.add(new Label("Username"),0,0);
        grid.add(userName,1,0);
        grid.add(new Label("Password"),0,1);
        grid.add(passwordField, 1,1);

        Node loginButton = dialog.getDialogPane().lookupButton(loginButtonType);
        loginButton.setDisable(true);

        userName.textProperty().addListener((observableValue, oldValue, newValue) -> loginButton.setDisable(newValue.trim().isEmpty()));
        dialog.getDialogPane().setContent(grid);

        dialog.setResultConverter(dialogButton->{
            if (dialogButton == loginButtonType)
                return new Pair<>(userName.getText(), passwordField.getText());
            return null;
        });
        Optional<Pair<String, String>> result = dialog.showAndWait();
        result.ifPresent(userNamePassWord->{
            System.out.println("User name:"+userNamePassWord.getKey()+", Password:"+userNamePassWord.getValue());
        });
    }
}
