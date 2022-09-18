module com.example.layout2 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.layout2 to javafx.fxml;
    exports com.example.layout2;
}