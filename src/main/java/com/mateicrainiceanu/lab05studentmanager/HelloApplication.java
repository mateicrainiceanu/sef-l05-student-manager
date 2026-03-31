package com.mateicrainiceanu.lab05studentmanager;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.Objects;

public class HelloApplication extends Application {@Override
public void start(Stage primaryStage) throws Exception {
    Parent root = FXMLLoader.load(getClass().getResource("fxml/view-students.fxml"));
    primaryStage.setTitle("Student Manager");
    primaryStage.setScene(new Scene(root, 600, 400));
    primaryStage.show();
}

}
