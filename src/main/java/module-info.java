module com.example.jair {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;

    opens com.example.jair to javafx.fxml;
    exports com.example.jair;
}