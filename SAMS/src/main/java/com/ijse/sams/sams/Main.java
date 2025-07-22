package com.ijse.sams.sams;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.util.Objects;

public class Main extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {
        Parent load = FXMLLoader.load((getClass().getResource("/com/ijse/sams/sams/views/Course.fxml")));
        Scene scene = new Scene(load);

        stage.setScene(scene);
        stage.show();

    }
}
