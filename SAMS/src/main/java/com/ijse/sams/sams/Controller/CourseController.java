package com.ijse.sams.sams.Controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.layout.AnchorPane;

import java.io.IOException;

public class CourseController {
    public AnchorPane ancCourseManagement;

    public void goAddPage(ActionEvent actionEvent) throws IOException {
        ancCourseManagement.getChildren().clear();
        AnchorPane anchorPane = FXMLLoader.load(getClass().getResource("/com/ijse/sams/sams/views/addCourse.fxml"));
        ancCourseManagement.getChildren().add(anchorPane);
    }

    public void goCourseInformation(ActionEvent actionEvent) throws IOException {
        ancCourseManagement.getChildren().clear();
        AnchorPane anchorpane1 = FXMLLoader.load(getClass().getResource("/com/ijse/sams/sams/views/courseInformation.fxml"));
        ancCourseManagement.getChildren().add(anchorpane1);
    }
}
