module com.example.rectanglegui {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;

    opens com.example.rectanglegui to javafx.fxml;
    exports com.example.rectanglegui;
}