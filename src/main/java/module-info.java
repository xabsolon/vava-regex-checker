module com.example.checker {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;

    opens com.example.checker to javafx.fxml;
    exports com.example.checker;
}