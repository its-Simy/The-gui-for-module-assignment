module com.example.polygongui {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;

    opens com.example.polygongui to javafx.fxml;
    exports com.example.polygongui;
}