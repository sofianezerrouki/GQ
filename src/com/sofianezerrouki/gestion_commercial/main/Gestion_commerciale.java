package com.sofianezerrouki.gestion_commercial.main;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Gestion_commerciale extends Application {

    @Override
    public void start(Stage stage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("/com/sofianezerrouki/gestion_commercial/gui/client/manupilerClient/AjouterClient.fxml"));

        Scene scene = new Scene(root);

        stage.setScene(scene);
        stage.show();
    }
    
    public static void main(String[] args) {
        launch(args);

    }

}
