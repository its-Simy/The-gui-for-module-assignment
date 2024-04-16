module com.example.linegui {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;

    opens com.example.linegui to javafx.fxml;
    exports com.example.linegui;
}