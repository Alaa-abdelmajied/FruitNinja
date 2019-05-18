package view;

import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.stage.Stage;
import javafx.util.Duration;

public class Arcade {
    Stage stage;
    public Arcade(Stage stage){
        this.stage = stage;
    }
    AnchorPane root;
    Scene scene;
    Image background;
    ImageView image;
    Label SCORE;
    Label BEST;
    Label score;
    Label best;

    Image ba;
    ImageView back;

    Image backGround;
    Image gameOver;
    ImageView BACKGROUND;
    ImageView BACK;
    ImageView GAMEOVER;
    ImageView fSCOREVIEW;
    Label fscore;


    Integer startTime = 60;
    Integer seconds = startTime;
    Label timer;

    int TIMER =60 ;
    int DisplayedScore = 0;

    public void buildScene(){
        stage.setTitle("Arcade");
        stage.setResizable(false);
        root = new AnchorPane();
        scene = new Scene(root,1200,671);

        background = new Image("WhatsApp Image 2019-05-08 at 4.23.16 AM.jpeg");
        image = new ImageView(background);
        image.setFitWidth(1200);
        image.setFitHeight(671);

        Image SCORE =new Image("Score.png");
        ImageView SCOREVIEW = new ImageView(SCORE);
        SCOREVIEW.setX(14);
        SCOREVIEW.setY(14);
        SCOREVIEW.setFitHeight(50);
        SCOREVIEW.setFitWidth(156);

        Image bestSCORE = new Image("BestScore.png");
        ImageView BESTSCOREView = new ImageView(bestSCORE);
        BESTSCOREView.setFitHeight(23);
        BESTSCOREView.setFitWidth(150);
        BESTSCOREView.setX(14);
        BESTSCOREView.setY(76);

        score = new Label("0");
        score.setFont(new Font("Impact",45));
        score.setLayoutX(180);
        score.setLayoutY(14);
        score.setTextFill(Color.WHITE);

        best = new Label("10000");
        best.setFont(new Font("Impact",19));
        best.setLayoutX(166);
        best.setLayoutY(75);
        best.setTextFill(Color.WHITE);

        ba = new Image("back-icon-10.jpg");
        back = new ImageView(ba);
        back.setFitHeight(66);
        back.setFitWidth(66);
        back.setX(1113);
        back.setY(19);
        back.setOnMouseClicked(e->{
            MainMenu main = new MainMenu(stage);
            main.buildScene();
            main.mediaPlayer.setMute(false);
        });
        back.setOnMouseEntered(e->{
            back.setFitHeight(72);
            back.setFitWidth(72);
            back.setX(1110);
            back.setY(16);
        });
        back.setOnMouseExited(e->{
            back.setFitHeight(66);
            back.setFitWidth(66);
            back.setX(1113);
            back.setY(19);

        });


        backGround = new Image("Slider.png");
        BACKGROUND = new ImageView(backGround);
        BACKGROUND.setVisible(false);
        BACKGROUND.setFitWidth(1240);
        BACKGROUND.setFitHeight(711);
//        BACKGROUND.setFitWidth(522);
//        BACKGROUND.setFitHeight(319);
        BACKGROUND.setX(-20);
        BACKGROUND.setY(-20);
//        BACKGROUND.setX(339);
//        BACKGROUND.setY(176);

        gameOver = new Image("Game Over.png");
        GAMEOVER = new ImageView(gameOver);
        GAMEOVER.setVisible(false);
        GAMEOVER.setFitWidth(288);
        GAMEOVER.setFitHeight(66);
        GAMEOVER.setX(456);
        GAMEOVER.setY(237);

        BACK = new ImageView(ba);
        BACK.setVisible(false);
        BACK.setFitWidth(66);
        BACK.setFitHeight(66);
        BACK.setX(567);
        BACK.setY(392);
        BACK.setOnMouseClicked(e->{
            MainMenu main = new MainMenu(stage);
            main.buildScene();
            main.mediaPlayer.setMute(false);
        });
        BACK.setOnMouseEntered(e->{
            BACK.setFitHeight(72);
            BACK.setFitWidth(72);
            BACK.setX(564);
            BACK.setY(389);
        });
        BACK.setOnMouseExited(e->{
            BACK.setFitHeight(66);
            BACK.setFitWidth(66);
            BACK.setX(567);
            BACK.setY(392);

        });

        Image fSCORE =new Image("Score.png");
        fSCOREVIEW = new ImageView(fSCORE);
        fSCOREVIEW.setVisible(false);
        fSCOREVIEW.setX(465);
        fSCOREVIEW.setY(319);
        fSCOREVIEW.setFitHeight(50);
        fSCOREVIEW.setFitWidth(156);


        fscore = new Label();
        fscore.setFont(new Font("Impact",45));
        fscore.setVisible(false);
        fscore.setLayoutX(633);
        fscore.setLayoutY(319);
        fscore.setTextFill(Color.WHITE);

        timer = new Label(seconds.toString());
        timer.setFont(new Font("Impact", 64));
        timer.setLayoutX(566);
        timer.setLayoutY(10);
        timer.setTextFill(Color.WHITE);

        doTime();

        root.getChildren().addAll(image,BESTSCOREView,SCOREVIEW,best,score,back,timer,BACKGROUND,GAMEOVER,BACK);
        root.getChildren().addAll(fSCOREVIEW,fscore);
        stage.setScene(scene);
    }

    public void gameOver(){
        MainMenu main = new MainMenu(stage);
        Stage stg = new Stage();
        VBox v = new VBox();
        Label GameOver = new Label("GameOver");
        GameOver.setTextFill(Color.WHITE);
        GameOver.setFont(new Font("Impact" , 20));
        Button close = new Button("CLOSE");
        close.setOnAction(e->{
            main.buildScene();
            stg.close();
        });
        v.getChildren().addAll(GameOver,close);
        Scene sc = new Scene(v);
        stg.show();

    }

    private void doTime() {
        Timeline time = new Timeline();
        time.setCycleCount(Timeline.INDEFINITE);
        if (time != null) {
            time.stop();
        }
//        if(seconds <= 3){
//            timer.setTextFill(Color.RED);
//        }
        KeyFrame frame = new KeyFrame(Duration.seconds(1), new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                ;
                seconds--;
//                System.out.println(seconds.toString());
                if (seconds == 0) {
                    time.stop();
                    BACKGROUND.setVisible(true);
                    GAMEOVER.setVisible(true);
                    BACK.setVisible(true);
                    fSCOREVIEW.setVisible(true);
                    fscore.setVisible(true);
                    fscore.setText(Integer.toString(DisplayedScore));

                }
                if (seconds <= 3) {
                    timer.setTextFill(Color.RED);
                }
                timer.setText(seconds.toString());

            }
        });
        time.getKeyFrames().add(frame);
        time.playFromStart();

    }

}
