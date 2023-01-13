module com.example.skillsdemo1 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.skillsdemo1 to javafx.fxml;
    exports com.example.skillsdemo1;
}