module com.example.linestrokedashgui {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;

    opens com.example.linestrokedashgui to javafx.fxml;
    exports com.example.linestrokedashgui;
}