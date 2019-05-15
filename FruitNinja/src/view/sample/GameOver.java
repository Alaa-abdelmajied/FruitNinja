package view.sample;

import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;


public class GameOver {
    Stage stage;
    MainMenu main = new MainMenu(stage);
    public void Display(){
        Stage GO = new Stage();
        GO.setTitle("Game Over");
        GO.setResizable(false);
        VBox v = new VBox();
        Label gameOver = new Label("GAME OVER!!");
        Button ok = new Button("OK");
        ok.setOnAction(e->{
            GO.close();
            main.buildScene();
        });
        Scene scene = new Scene(v);
        GO.setScene(scene);
        GO.show();
    }
}
