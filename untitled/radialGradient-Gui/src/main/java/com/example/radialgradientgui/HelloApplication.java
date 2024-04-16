package com.example.radialgradientgui;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.Group;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.paint.RadialGradient;
import javafx.scene.paint.CycleMethod;
import javafx.scene.paint.Stop;


import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage primaryStage) throws IOException {
        primaryStage.setTitle("Radial Gradient Example");
        Group root = new Group();
        Scene scene = new Scene(root, 400, 300, Color.WHITE);
        primaryStage.setScene(scene);
        addRectangle(scene);
        primaryStage.show();
    }
    private void addRectangle(final Scene scene) {
        Circle C = new Circle(200,150,100);
        RadialGradient gradient1 = new RadialGradient(0,
                .1,
                100,
                100,
                200,
                false,
                CycleMethod.NO_CYCLE,
                new Stop(0, Color.YELLOW),
                new Stop(1, Color.RED));
        C.setFill(gradient1);
        final Group root = (Group) scene.getRoot();
        root.getChildren().add(C);
    }


    public static void main(String[] args) {
        launch();
    }
}