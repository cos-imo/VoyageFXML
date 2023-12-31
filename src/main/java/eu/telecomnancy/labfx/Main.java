package eu.telecomnancy.labfx;

import java.io.IOException;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.Parent;
import javafx.scene.control.*; 
import javafx.fxml.FXMLLoader;
import javafx.scene.layout.BorderPane;
import javafx.scene.image.ImageView;
import javafx.application.Platform;
import javafx.scene.layout.AnchorPane;

import javafx.fxml.FXMLLoader;

public class Main extends Application {

    public static void main(String[] args) {
        Application.launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws IOException {
        primaryStage.setTitle("Carnet de Voyage");

        FXMLLoader loader = new FXMLLoader(getClass().getResource("/eu/telecomnancy/labfx/Main.fxml"));
        AnchorPane root = loader.load();

       // BorderPane MainPane = new BorderPane();

        //MainPane.setTop(root);

        Scene scene = new Scene(root, 400, 400);
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
