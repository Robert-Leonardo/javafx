module com.example.bd_d {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;
    requires javafx.graphics;


    opens com.example.bd_d to javafx.fxml;
    exports com.example.bd_d;
}