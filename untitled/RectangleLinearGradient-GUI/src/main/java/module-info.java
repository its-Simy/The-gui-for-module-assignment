module com.example.rectanglelineargradientgui {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;

    opens com.example.rectanglelineargradientgui to javafx.fxml;
    exports com.example.rectanglelineargradientgui;
}