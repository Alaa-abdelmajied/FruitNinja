package view;

import javafx.animation.TranslateTransition;
import javafx.scene.Group;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.media.MediaView;
import javafx.stage.Stage;
import javafx.*;
import javafx.util.Duration;

import java.io.File;

import controller.Controller;

public class MainMenu {
    Stage stage;
    Scene scene;
    AnchorPane root;
    Image background;
    ImageView mainMenu;
    Image btn1;
    Image btn2;
    Image btn3;
    Image btn4;
    ImageView Arcade;
    ImageView start;
    ImageView credit;
    ImageView exit;
    Image slide;
    ImageView slider1;
    ImageView slider2;
    ImageView slider3;
    Image ba;
    Image ba2;
    ImageView back;
    ImageView back2;
    Image cred;
    ImageView Credits;
    Image ti;
    ImageView title;
    Image des1;
    Image des2;
    Image des3;
    ImageView easyDescription;
    ImageView normalDescription;
    ImageView hardDescription;
    Image Dif1;
    Image Dif2;
    Image Dif3;
    ImageView easy;
    ImageView normal;
    ImageView hard;
    Image Mon;
    Image Moff;
    Image Ques;
    ImageView Howto;
    ImageView MusicOn;
    ImageView MusicOff;
    Image descripe;
    ImageView description;

    Media sound;
    MediaPlayer mediaPlayer;
    AnchorPane StartSlider;
    AnchorPane CreditSlider;

    Controller controller = new Controller();
    public MainMenu(Stage stage){
        this.stage = stage;
    }

    public void buildScene(){
        stage.setResizable(false);
        root = new AnchorPane();
        scene = new Scene(root,1200,671);

        background = new Image("main menu.png");
        mainMenu = new ImageView(background);
        mainMenu.setFitHeight(683);
        mainMenu.setFitWidth(1212);
        btn1 = new Image("Start.png");
        start = new ImageView(btn1);
        start.setFitHeight(70.0);
        start.setFitWidth(200);
        start.setX(100);
        start.setY(329);
        start.setOnMouseClicked((e)->{
            ClickStart();
            SlideOut2();
            SlideIn1();
        });
        start.setOnMouseEntered(e->{
            start.setFitWidth(206);
            start.setFitHeight(76);
            start.setX(97);
            start.setY(326);
        });
        start.setOnMouseExited(e->{
            start.setFitWidth(200);
            start.setFitHeight(70);
            start.setX(100);
            start.setY(329);
        });
        start.setOnMousePressed(e->{
            start.setFitWidth(200);
            start.setFitHeight(70);
            start.setX(100);
            start.setY(329);
        });
        start.setOnMouseReleased(e->{
            start.setFitWidth(206);
            start.setFitHeight(76);
            start.setX(97);
            start.setY(326);
        });
        

        btn2 = new Image("Credit.png");
        credit = new ImageView(btn2);
        credit.setOnMouseClicked(e->{
            ClickCredit();
            SlideOut1();
            SlideIn2();
        });
        credit.setFitHeight(70.0);
        credit.setFitWidth(200);
        credit.setX(300);
        credit.setY(467);
        credit.setOnMouseEntered(e->{
            credit.setFitWidth(206);
            credit.setFitHeight(76);
            credit.setX(297);
            credit.setY(464);
        });
        credit.setOnMouseExited(e->{
            credit.setFitWidth(200);
            credit.setFitHeight(70);
            credit.setX(300);
            credit.setY(467);
        });
        credit.setOnMousePressed(e->{
        	credit.setFitWidth(200);
        	credit.setFitHeight(70);
        	credit.setX(300);
        	credit.setY(467);
        });
        credit.setOnMouseReleased(e->{
        	credit.setFitWidth(206);
        	credit.setFitHeight(76);
        	credit.setX(297);
        	credit.setY(464);
        });
        

        btn3 = new Image("Exit.png");
        exit = new ImageView(btn3);
        exit.setOnMouseClicked(e->{
            ClickExit();
        });
        exit.setFitHeight(70);
        exit.setFitWidth(200);
        exit.setX(400);
        exit.setY(536);
        exit.setOnMouseEntered(e->{
            exit.setFitWidth(206);
            exit.setFitHeight(76);
            exit.setX(397);
            exit.setY(533);
        });
        exit.setOnMouseExited(e->{
            exit.setFitWidth(200);
            exit.setFitHeight(70);
            exit.setX(400);
            exit.setY(536);
        });
        exit.setOnMousePressed(e->{
        	exit.setFitWidth(200);
        	exit.setFitHeight(70);
        	exit.setX(400);
        	exit.setY(536);
        });
//        exit.setOnMouseReleased(e->{
//        	exit.setFitWidth(206);
//        	exit.setFitHeight(76);
//        	exit.setX(397);
//        	exit.setY(533);
//        });

        btn4 = new Image("Arcade.png");
        Arcade = new ImageView(btn4);
        Arcade.setOnMouseClicked(e->{
            Arcade arcade = new Arcade(stage);
            arcade.buildScene();
            mediaPlayer.setMute(true);
        });
        Arcade.setFitHeight(70);
        Arcade.setFitWidth(200);
        Arcade.setX(200);
        Arcade.setY(398);
        Arcade.setOnMouseEntered(e->{
            Arcade.setFitWidth(206);
            Arcade.setFitHeight(76);
            Arcade.setX(197);
            Arcade.setY(395);
        });
        Arcade.setOnMouseExited(e->{
            Arcade.setFitWidth(200);
            Arcade.setFitHeight(70);
            Arcade.setX(200);
            Arcade.setY(398);
        });
        Arcade.setOnMousePressed(e->{
        	Arcade.setFitWidth(200);
        	Arcade.setFitHeight(70);
        	Arcade.setX(200);
        	Arcade.setY(398);
        });
//        Arcade.setOnMouseReleased(e->{
//        	Arcade.setFitWidth(206);
//        	Arcade.setFitHeight(76);
//        	Arcade.setX(197);
//        	Arcade.setY(395);
//        });
//----------------------------------------------------------------------------
        StartSlider = new AnchorPane();
        StartSlider.setVisible(true);
        StartSlider.setPrefSize(540,320);
        StartSlider.setLayoutX(630);
        StartSlider.setLayoutY(325);

        slide = new Image("Slider.png");
        slide = new Image("Slider.png");
        slider1 = new ImageView(slide);
        slider1.setVisible(false);
        slider1.setFitHeight(320);
        slider1.setFitWidth(540);
        slider1.setX(730);
        slider1.setY(325);
        ba = new Image("back.png");
        back = new ImageView(ba);
        back.setOnMouseClicked(e->{
            ClickBack();
            SlideOut1();
            SlideOut2();
        });
        back.setVisible(false);
        back.setFitHeight(35);
        back.setFitWidth(35);
        back.setX(716);
        back.setY(319);
        back.setOnMouseEntered(e->{
            back.setFitWidth(41);
            back.setFitHeight(41);
            back.setX(713);
            back.setY(316);
        });
        back.setOnMouseExited(e->{
            back.setFitWidth(35);
            back.setFitHeight(35);
            back.setX(716);
            back.setY(319);
        });

        ti = new Image("title.png");
        title = new ImageView(ti);
        title.setVisible(false);
        title.setFitHeight(34);
        title.setFitWidth(485);
        title.setX(755);
        title.setY(357);

        des1 = new Image("EasyDescription.png");
        easyDescription = new ImageView(des1);
        easyDescription.setVisible(false);
        easyDescription.setFitHeight(80);
        easyDescription.setFitWidth(330);
        easyDescription.setX(932);
        easyDescription.setY(444);

        des2 = new Image("normalDescription.png");
        normalDescription = new ImageView(des2);
        normalDescription.setVisible(false);
        normalDescription.setFitHeight(80);
        normalDescription.setFitWidth(330);
        normalDescription.setX(932);
        normalDescription.setY(444);

        des3 = new Image("hardDescription.png");
        hardDescription = new ImageView(des3);
        hardDescription.setVisible(false);
        hardDescription.setFitHeight(80);
        hardDescription.setFitWidth(330);
        hardDescription.setX(932);
        hardDescription.setY(444);


        Dif1 = new Image("Easy.png");
        easy = new ImageView(Dif1);
        easy.setOnMouseEntered(e->{
            easyDescription.setVisible(true);
            easy.setFitWidth(142);
            easy.setFitHeight(54);
            easy.setX(792);
            easy.setY(417);
        });
        easy.setOnMouseExited(e->{
            easyDescription.setVisible(false);
            easy.setFitWidth(136);
            easy.setFitHeight(48);
            easy.setX(795);
            easy.setY(420);
        });
        easy.setOnMousePressed(e->{
        	easy.setFitHeight(48);
            easy.setFitWidth(136);
            easy.setX(795);
            easy.setY(420);
        });
        easy.setVisible(false);
        easy.setFitHeight(48);
        easy.setFitWidth(136);
        easy.setX(795);
        easy.setY(420);
        easy.setOnMouseClicked(e->{
            Level1 easyLevel = new Level1(stage,controller);
            controller.play(1);
            easyLevel.buildScene();
            mediaPlayer.setMute(true);
        });

        Dif2 = new Image("Normal.png");
        normal = new ImageView(Dif2);
        normal.setOnMouseEntered(e->{
            normalDescription.setVisible(true);
            normal.setFitWidth(142);
            normal.setFitHeight(54);
            normal.setX(792);
            normal.setY(468);
        });
        normal.setOnMouseExited(e->{
            normalDescription.setVisible(false);
            normal.setFitWidth(136);
            normal.setFitHeight(48);
            normal.setX(795);
            normal.setY(474);
        });
        normal.setOnMousePressed(e->{
            normal.setFitWidth(136);
            normal.setFitHeight(48);
            normal.setX(795);
            normal.setY(474);
        });
        
        normal.setOnMouseClicked(e->{
            Level2 normalLevel = new Level2(stage);
            normalLevel.buildScene();
            mediaPlayer.setMute(true);
        });
        normal.setVisible(false);
        normal.setFitHeight(48);
        normal.setFitWidth(136);
        normal.setX(795);
        normal.setY(474);

        Dif3 = new Image("Hard.png");
        hard = new ImageView(Dif3);
        hard.setOnMouseEntered(e->{
            hardDescription.setVisible(true);
            hard.setFitHeight(54);
            hard.setFitWidth(142);
            hard.setX(792);
            hard.setY(524);
        });
        hard.setOnMousePressed(e->{
            hard.setFitHeight(48);
            hard.setFitWidth(136);
            hard.setX(795);
            hard.setY(527);
        });
        hard.setOnMouseExited(e->{
            hardDescription.setVisible(false);
            hard.setFitHeight(48);
            hard.setFitWidth(136);
            hard.setX(795);
            hard.setY(527);
        });
        hard.setOnMouseClicked(e->{
            Level3 hardLevel = new Level3(stage);
            hardLevel.buildScene();
            mediaPlayer.setMute(true);
        });
        hard.setVisible(false);
        hard.setFitHeight(48);
        hard.setFitWidth(136);
        hard.setX(795);
        hard.setY(527);

//        StartSlider.getChildren().addAll();

        ba2 = new Image("back.png");
        back2 = new ImageView(ba2);
        back2.setOnMouseClicked(e->{
            ClickBack();
        });
        back2.setVisible(false);
        back2.setFitHeight(35);
        back2.setFitWidth(35);
        back2.setX(716);
        back2.setY(319);
        back2.setOnMouseEntered(e->{
            back2.setFitWidth(41);
            back2.setFitHeight(41);
            back2.setX(713);
            back2.setY(316);
        });
        back2.setOnMouseExited(e->{
            back2.setFitWidth(35);
            back2.setFitHeight(35);
            back2.setX(716);
            back2.setY(319);
        });

        slide = new Image("Slider.png");
        slider2 = new ImageView(slide);
        slider2.setVisible(false);
        slider2.setFitHeight(320);
        slider2.setFitWidth(540);
        slider2.setX(730);
        slider2.setY(325);


        cred = new Image("no credits yet.png");
        Credits = new ImageView(cred);
        Credits.setVisible(false);
        Credits.setFitHeight(32);
        Credits.setFitWidth(200);
        Credits.setX(898);
        Credits.setY(403);


        Mon = new Image("MusicOn.png");
        MusicOn = new ImageView(Mon);
        MusicOn.setVisible(true);
        MusicOn.setFitHeight(35);
        MusicOn.setFitWidth(35);
        MusicOn.setX(14);
        MusicOn.setY(640);
        MusicOn.setOnMouseClicked(e->{
            turnMusicOff();
        });
        MusicOn.setOnMousePressed(e->{
        	MusicOn.setFitHeight(31);
        	MusicOn.setFitWidth(31);
        	MusicOn.setX(16);
        	MusicOn.setY(642);
        });
        MusicOn.setOnMouseReleased(e->{
        	MusicOn.setFitHeight(35);
        	MusicOn.setFitWidth(35);
        	MusicOn.setX(14);
        	MusicOn.setY(640);
        });



        Moff = new Image("MusicOff.png");
        MusicOff = new ImageView(Moff);
        MusicOff.setVisible(false);
        MusicOff.setFitHeight(35);
        MusicOff.setFitWidth(35);
        MusicOff.setX(14);
        MusicOff.setY(640);
        MusicOff.setOnMouseClicked(e->{
            turnMusicOn();
        });
        MusicOff.setOnMousePressed(e->{
        	MusicOff.setFitHeight(31);
        	MusicOff.setFitWidth(31);
        	MusicOff.setX(16);
        	MusicOff.setY(642);
        });
        MusicOff.setOnMouseReleased(e->{
        	MusicOff.setFitHeight(35);
        	MusicOff.setFitWidth(35);
        	MusicOff.setX(14);
        	MusicOff.setY(640);
        });

        slide = new Image("info.png");
        slider3 = new ImageView(slide);
        slider3.setVisible(false);
        slider3.setFitHeight(529);
        slider3.setFitWidth(899);
        slider3.setX(150);
        slider3.setY(70);

        descripe = new Image("Description.png");
        description = new ImageView(descripe);
        description.setVisible(false);
        description.setFitHeight(484);
        description.setFitWidth(864);
        description.setX(160);
        description.setY(80);

        Ques = new Image("How to play.png");
        Howto = new ImageView(Ques);
        Howto.setFitHeight(35);
        Howto.setFitWidth(35);
        Howto.setX(50);
        Howto.setY(640);
        Howto.setOnMouseEntered(e->{
            slider3.setVisible(true);
            description.setVisible(true);
            Howto.setFitHeight(39);
            Howto.setFitWidth(39);
            Howto.setX(48);
            Howto.setY(638);
        });
        Howto.setOnMouseExited(e->{
            slider3.setVisible(false);
            description.setVisible(false);
            Howto.setFitHeight(35);
            Howto.setFitWidth(35);
            Howto.setX(50);
            Howto.setY(640);

        });



        sound = new Media((new File("src/fruitNinjaMusic.mp3")).toURI().toString());
        mediaPlayer = new MediaPlayer(sound);
        mediaPlayer.setVolume(200.0D);
        mediaPlayer.setStopTime(Duration.minutes(2.36D));
        mediaPlayer.seek(mediaPlayer.getStartTime());
        mediaPlayer.setAutoPlay(true);
        MediaView mediaView = new MediaView(mediaPlayer);



        root.getChildren().addAll(mainMenu,start,credit,exit,MusicOn,MusicOff,mediaView,slider2,Credits,Arcade,StartSlider,slider1,easy,normal,hard,title,back,easyDescription,normalDescription,hardDescription,back2,Howto,slider3,description);
        stage.setTitle("Fruit Ninja");
        stage.setScene(scene);

    }

    public void ClickStart(){
        HideCredit();
        ViewDif();
    }
    public void ClickCredit(){
        HideDif();
        ViewCredit();
    }
    public void ClickExit(){
        stage.close();
    }

    public void ClickBack(){
        HideDif();
        HideCredit();
    }

    public void ClickEasy(){

    }
    public void ClickNormal(){

    }
    public void ClickHard(){

    }


    public void ViewDif(){
        slider1.setVisible(true);
        back.setVisible(true);
        title.setVisible(true);
        easy.setVisible(true);
        normal.setVisible(true);
        hard.setVisible(true);
//        easyDescription.setVisible(true);

    }
    public void HideDif(){
        slider1.setVisible(false);
        back.setVisible(false);
        title.setVisible(false);
        easy.setVisible(false);
        normal.setVisible(false);
        hard.setVisible(false);
//        easyDescription.setVisible(false);
    }

    public void ViewCredit(){
        slider2.setVisible(true);
        back2.setVisible(true);
        Credits.setVisible(true);
    }
    public void HideCredit(){
        slider2.setVisible(false);
        back2.setVisible(false);
        Credits.setVisible(false);

    }

    public void turnMusicOn(){
        MusicOff.setVisible(false);
        MusicOn.setVisible(true);
        mediaPlayer.setMute(false);
    }
    public void turnMusicOff(){
        MusicOff.setVisible(true);
        MusicOn.setVisible(false);
        mediaPlayer.setMute(true);
    }

    public void SliderTrans(Node node){
        TranslateTransition transition = new TranslateTransition();
        transition.setToY(0);
        transition.setToX(-100);
        transition.setDuration(Duration.seconds(0.5));
        transition.setAutoReverse(true);
//        transition.setDelay(Duration.seconds(1));
        transition.setCycleCount(1);
        transition.setNode(node);
        transition.play();
    }
    public void SliderTrans2(Node node){
        TranslateTransition transition = new TranslateTransition();
        transition.setToY(0);
        transition.setToX(100);
        transition.setDuration(Duration.seconds(0.5));
        transition.setAutoReverse(true);
//        transition.setDelay(Duration.seconds(1));
        transition.setCycleCount(1);
        transition.setNode(node);
        transition.play();
    }
    public void SlideIn1(){
        SliderTrans(slider1);
        SliderTrans(back);
        SliderTrans(title);
        SliderTrans(easy);
        SliderTrans(normal);
        SliderTrans(hard);
        SliderTrans(easyDescription);
        SliderTrans(normalDescription);
        SliderTrans(hardDescription);
        SliderTrans(slider1);
    }
    public void SlideIn2(){
        SliderTrans(slider2);
        SliderTrans(back2);
        SliderTrans(Credits);
    }
    public void SlideOut1(){
        SliderTrans2(slider1);
        SliderTrans2(back);
        SliderTrans2(title);
        SliderTrans2(easy);
        SliderTrans2(normal);
        SliderTrans2(hard);
        SliderTrans2(easyDescription);
        SliderTrans2(normalDescription);
        SliderTrans2(hardDescription);
        SliderTrans2(slider1);
    }
    public void SlideOut2(){
        SliderTrans2(slider2);
        SliderTrans2(back2);
        SliderTrans2(Credits);
    }
}