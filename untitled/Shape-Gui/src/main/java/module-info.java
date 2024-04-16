module com.example.shapegui {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;

    opens com.example.shapegui to javafx.fxml;
    exports com.example.shapegui;
}