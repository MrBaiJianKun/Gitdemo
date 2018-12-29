package com.soft1841.sm;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class SellerApp extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {

        primaryStage.setTitle("收银员");
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/fxml/seller.fxml"));
        Parent root  = fxmlLoader.load();
        Scene scene = new Scene(root,600,800);
        scene.getStylesheets().addAll("/css/style.css");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
