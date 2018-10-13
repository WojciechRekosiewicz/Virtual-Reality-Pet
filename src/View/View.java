package View;

import Model.Notification;
import Model.Sleep;
import Model.Statistics;
import javafx.animation.Animation;
import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
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

    public ImageView getViewVader() {
        return viewVader;
    }


    public void createBoard(VBox board, Stage primaryStage) {
        Notification notification = new Notification();
        Label labelEnergy = new Label();
        Label labelFeed = new Label();
        Label labelFun = new Label();

        Buttons buttons = new Buttons();
        primaryStage.setTitle("Tamagothi");


        // notification.viewNot();
        // notification.notificationTimer();
        viewStats(labelEnergy);
        buttons.addButtons(board, labelFun, labelFeed);
        board.getChildren().addAll(labelEnergy, labelFeed, labelFun, getViewVader());
        board.setPadding(new Insets(10, 10, 10, 10));
    }

    public void viewStats(Label label) {
        Timeline timeline = new Timeline(
                new KeyFrame(Duration.seconds(0),
                        new EventHandler<ActionEvent>() {
                            @Override
                            public void handle(ActionEvent actionEvent) {
                                changeSleepLvl();
                                label.setText("Energy: " + Integer.toString(getSleepLvl()));
                                if (getSleepLvl() < MINIMUMAMOUNT) {
                                    System.out.println("low Sleep lvl");
                                } else {
                                    System.out.println("good Sleep lvl");
                                }
                            }
                        }
                ),
                new KeyFrame(Duration.seconds(1))
        );
        timeline.setCycleCount(Animation.INDEFINITE);
        timeline.play();
    }


    public void useChangeFunLvl(Label label, Button funButton) {
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
                                    System.out.println("low Fun");
                                } else {
                                    System.out.println("good Fun lvl");
                                }
                            }
                        }
                ),
                new KeyFrame(Duration.seconds(1))
        );
        timeline.setCycleCount(Animation.INDEFINITE);
        timeline.play();

    }

    public void useChangeFeedLvl(Label label, Button feedButton) {
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
                                    System.out.println("low Feed lvl");
                                } else {
                                    System.out.println("good Feed lvl");
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



