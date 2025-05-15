module com.example.bd_d {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;


    opens com.example.bd_d to javafx.fxml;
    exports com.example.bd_d;
}