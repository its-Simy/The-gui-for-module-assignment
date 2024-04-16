module com.example.rectanglered {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;

    opens com.example.rectanglered to javafx.fxml;
    exports com.example.rectanglered;
}