package com.soft1841.sm;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class DengLuApp extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {
        primaryStage.setTitle("管理员");
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/fxml/first.fxml"));
        Parent root  = fxmlLoader.load();
        Scene scene = new Scene(root,1100,750);
        scene.getStylesheets().addAll("/css/style.css");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
