module com.example.multipleshapesgui {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;

    opens com.example.multipleshapesgui to javafx.fxml;
    exports com.example.multipleshapesgui;
}