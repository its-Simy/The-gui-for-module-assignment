module com.example.hexagongui {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;

    opens com.example.hexagongui to javafx.fxml;
    exports com.example.hexagongui;
}