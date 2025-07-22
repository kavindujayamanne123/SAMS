package com.ijse.sams.sams.Controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;

import java.io.IOException;

public class addCourseController {
    public AnchorPane ancAddCourse;
    public TextField txtCourseID;
    public TextField txtName;
    public TextField txtDesc;
    public TextField txtLectures;
    public TextField txtDuration;
    public TextField txtCourseFee;
    public TextField txtMinQualification;

    public void goCourseManagement(ActionEvent actionEvent) throws IOException {
        ancAddCourse.getChildren().clear();
        AnchorPane anchorPane = FXMLLoader.load(getClass().getResource("/com/ijse/sams/sams/views/Course.fxml"));
        ancAddCourse.getChildren().add(anchorPane);
    }

    public void btnAddCourse(ActionEvent actionEvent) {
        String courseID = txtCourseID.getText();
        String courseName = txtName.getText();
        String courseDesc = txtDesc.getText();
        String courseLectures = txtLectures.getText();
        String courseDuration = txtDuration.getText();
        String courseFee = txtCourseFee.getText();
        String courseMinQualification = txtMinQualification.getText();

        System.out.println("courseID: " + courseID);
        System.out.println("courseName: " + courseName);
        System.out.println("courseDesc: " + courseDesc);
        System.out.println("courseLectures: " + courseLectures);
        System.out.println("courseDuration: " + courseDuration);
        System.out.println("courseFee: " + courseFee);
        System.out.println("courseMinQualification: " + courseMinQualification);
    }
}
