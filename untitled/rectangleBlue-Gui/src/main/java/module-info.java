module com.example.rectanglebluegui {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;

    opens com.example.rectanglebluegui to javafx.fxml;
    exports com.example.rectanglebluegui;
}