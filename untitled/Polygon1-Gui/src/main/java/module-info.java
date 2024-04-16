module com.example.polygon1gui {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;

    opens com.example.polygon1gui to javafx.fxml;
    exports com.example.polygon1gui;
}