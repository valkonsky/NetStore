module com.example.valkonskynetstore {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.valkonskynetstore to javafx.fxml;
    exports com.example.valkonskynetstore;
}