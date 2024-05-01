package main;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import javafx.stage.StageStyle;


public class Main extends Application{
    double x,y;
    public static int CURRENCY =40;
    @Override
    public void start(Stage primaryStage) throws Exception {

        Parent root = FXMLLoader.load(getClass().getResource("../views/carport.fxml"));
        primaryStage.initStyle(StageStyle.UNDECORATED);
        root.setOnMousePressed(event -> {
            x= event.getSceneX();
            y= event.getSceneY();
        });
        root.setOnMouseDragged(event -> {
            primaryStage.setX(event.getSceneX()-x);
            primaryStage.setY(event.getSceneY()-y);

        });
        primaryStage.setTitle("Carport");
        primaryStage.setScene(new Scene(root));
        primaryStage.show();

    }
    public static void main(String[] args) {
        launch(args);
    }
}