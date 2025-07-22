module com.ijse.sams.sams {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;


    opens com.ijse.sams.sams.Controller to javafx.fxml;
    exports com.ijse.sams.sams;
}