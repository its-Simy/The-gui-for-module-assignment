module com.example.honeycombgui {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;

    opens com.example.honeycombgui to javafx.fxml;
    exports com.example.honeycombgui;
}