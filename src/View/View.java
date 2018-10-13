package View;

import Model.Statistics;
import javafx.animation.Animation;
import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import javafx.scene.control.Label;
import javafx.util.Duration;

public class View extends Statistics {
    Image Vader = new Image("vader.jpeg");
    ImageView viewVader = new ImageView(Vader);
    public int MINIMUMAMOUNT = 40;
    public int sleepValue = 40;

    public ImageView getViewVader() {
        return viewVader;
    }

    public void createBoard(VBox board, Stage primaryStage) {
        Label labelEnergy = new Label();
        Label labelFeed = new Label();
        Label labelFun = new Label();
        Label notificationEnergy = new Label();
        Label notificationFeed = new Label();
        Label notificationFun = new Label();

        Buttons buttons = new Buttons();
        primaryStage.setTitle("Tamagothi");


        viewStats(labelEnergy, notificationEnergy);

        buttons.addButtons(board, labelFun, labelFeed, notificationFeed, notificationFun);

        board.getChildren().addAll(labelEnergy, labelFeed, labelFun, getViewVader(), notificationEnergy,
                notificationFeed, notificationFun);

        board.setPadding(new Insets(10, 10, 10, 10));
    }

    public void viewStats(Label label, Label notificationEnergy) {
        Timeline timeline = new Timeline(
                new KeyFrame(Duration.seconds(0),
                        new EventHandler<ActionEvent>() {
                            @Override
                            public void handle(ActionEvent actionEvent) {
                                changeSleepLvlMinus();
                                label.setText("Energy: " + Integer.toString(getSleepLvl()));
                                notificationEnergy.setText("Awake");
                                if (getSleepLvl() < sleepValue) {
                                    notificationEnergy.setText("Low Sleep lvl");
                                    if (getFunLvl() <= 38) {
                                        notificationEnergy.setText("Sleeping");
                                        changeSleepLvl();
                                        sleepValue = 55;
                                    }

                                } else {
                                    sleepValue = 40;
                                }
                            }
                        }
                ),
                new KeyFrame(Duration.seconds(1))
        );
        timeline.setCycleCount(Animation.INDEFINITE);
        timeline.play();
    }


    public void useChangeFunLvl(Label label, Button funButton, Label notificationFeed) {
        label.setText("\nFun: " + Integer.toString(getFunLvl()));
        funButton.setOnAction(new EventHandler<javafx.event.ActionEvent>() {

            @Override
            public void handle(javafx.event.ActionEvent event) {
                changeFunLvl();
                label.setText("\nFun: " + Integer.toString(getFunLvl()));

            }
        });

        Timeline timeline = new Timeline(
                new KeyFrame(Duration.seconds(0),
                        new EventHandler<ActionEvent>() {
                            @Override
                            public void handle(ActionEvent actionEvent) {
                                changeFunLvlMinus();
                                label.setText("\nFun: " + Integer.toString(getFunLvl()));

                                if (getFunLvl() < MINIMUMAMOUNT) {
                                    notificationFeed.setText("Low Fun lvl");
                                    if (getFunLvl() <= 0) {
                                        System.out.println("Vader commited Sudoku");
                                        Platform.exit();
                                        System.exit(0);
                                    }
                                } else {
                                    notificationFeed.setText("Good Fun lvl");
                                }
                            }
                        }
                ),
                new KeyFrame(Duration.seconds(1))
        );
        timeline.setCycleCount(Animation.INDEFINITE);
        timeline.play();

    }

    public void useChangeFeedLvl(Label label, Button feedButton, Label notificationFun) {
        label.setText("\nHungry: " + Integer.toString(getHungryLvl()));
        feedButton.setOnAction(new EventHandler<javafx.event.ActionEvent>() {

            @Override
            public void handle(javafx.event.ActionEvent event) {
                changeHungryLvl();
                label.setText("\nHungry: " + Integer.toString(getHungryLvl()));

            }
        });

        Timeline timeline = new Timeline(
                new KeyFrame(Duration.seconds(0),
                        new EventHandler<ActionEvent>() {
                            @Override
                            public void handle(ActionEvent actionEvent) {
                                changeHungryLvlMinus();
                                label.setText("\nHungry: " + Integer.toString(getHungryLvl()));

                                if (getHungryLvl() < MINIMUMAMOUNT) {
                                    notificationFun.setText("Low Feed lvl");
                                    if (getHungryLvl() <= 0) {
                                        System.out.println("Vader starved to dead");
                                        Platform.exit();
                                        System.exit(0);
                                    }
                                } else {
                                    notificationFun.setText("Good Feed lvl");
                                }
                            }
                        }
                ),
                new KeyFrame(Duration.seconds(1))
        );
        timeline.setCycleCount(Animation.INDEFINITE);
        timeline.play();
    }
}



