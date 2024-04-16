package com.example.polygon1gui;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.shape.Polygon;
import javafx.scene.Group;

import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml"));
        //Creating a Polygon
        Polygon polygon = new Polygon();
//Adding coordinates to the polygon
        polygon.getPoints().addAll(new Double[]{
                490.0,50.0,
                750.0, 50.0,
                890.0, 277.0,
                754.0, 500.0,
                490.0, 500.0,
                370.0, 277.0,
        });
//Creating a Group object
        Group root = new Group(polygon);
//Creating a scene object
        Scene scene = new Scene(root, 1208, 581);
//Setting title to the Stage
        stage.setTitle("Drawing a Polygon");
//Adding scene to the stage
        stage.setScene(scene);
//Displaying the contents of the stage
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}