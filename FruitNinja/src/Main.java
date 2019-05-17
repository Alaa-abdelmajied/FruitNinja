package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class Main extends Application {



    @Override
    public void start(Stage stage) throws Exception {
        stage.setResizable(false);
        MainMenu main = new MainMenu(stage);
        main.buildScene();
        stage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
