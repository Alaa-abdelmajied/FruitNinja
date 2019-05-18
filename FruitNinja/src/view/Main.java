package view;

import javafx.application.Application;
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
