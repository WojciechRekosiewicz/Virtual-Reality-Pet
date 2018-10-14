package Model;

import Controller.ModifyStats;
import javafx.animation.Animation;
import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.util.Duration;

public class Timers extends Statistics {
    private int MINIMUMAMOUNT = 40;
    private int sleepValue = 0;

    public void viewStats(Label label, Label notificationEnergy) {

        Timeline timeline = new Timeline(
                new KeyFrame(Duration.seconds(0),
                        new EventHandler<ActionEvent>() {
                            @Override
                            public void handle(ActionEvent actionEvent) {
                                // int sleepValue = 40;
                                ModifyStats modifyStats = new ModifyStats();
                                changeSleepLvlMinus();
                                modifyStats.modifyLabels(label, "Energy: " + Integer.toString(getSleepLvl()));
                                modifyStats.modifyLabels(notificationEnergy, "Awake");

                                if (getSleepLvl() < sleepValue) {
                                    sleepValue = 100;
                                    modifyStats.modifyLabels(notificationEnergy, "Sleeping");
                                    changeSleepLvl();
                                } else {
                                    sleepValue = 0;
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
        ModifyStats modifyStats = new ModifyStats();
        modifyStats.modifyLabels(label, "Fun: " + Integer.toString(getFunLvl()));
        //   label.setText("Fun: " + Integer.toString(getFunLvl()));
        funButton.setOnAction(new EventHandler<javafx.event.ActionEvent>() {

            @Override
            public void handle(javafx.event.ActionEvent event) {
                changeFunLvl();
                modifyStats.modifyLabels(label, "Fun: " + Integer.toString(getFunLvl()));
                //  label.setText("Fun: " + Integer.toString(getFunLvl()));

            }
        });

        Timeline timeline = new Timeline(
                new KeyFrame(Duration.seconds(0),
                        new EventHandler<ActionEvent>() {
                            @Override
                            public void handle(ActionEvent actionEvent) {
                                changeFunLvlMinus();
                                modifyStats.modifyLabels(label, "Fun: " + Integer.toString(getFunLvl()));
                                //  label.setText("Fun: " + Integer.toString(getFunLvl()));

                                if (getFunLvl() < MINIMUMAMOUNT) {
                                    modifyStats.modifyLabels(notificationFeed, "Low Fun lvl");
                                    // notificationFeed.setText("Low Fun lvl");
                                    if (getFunLvl() <= 0) {
                                        System.out.println("Vader commited Sudoku");
                                        Platform.exit();
                                        System.exit(0);
                                    }
                                } else {
                                    modifyStats.modifyLabels(notificationFeed, "Good Fun lvl");
                                    //  notificationFeed.setText("Good Fun lvl");
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
        ModifyStats modifyStats = new ModifyStats();
        modifyStats.modifyLabels(label, "Hungry: " + Integer.toString(getHungryLvl()));
        //  label.setText("Hungry: " + Integer.toString(getHungryLvl()));
        feedButton.setOnAction(new EventHandler<javafx.event.ActionEvent>() {

            @Override
            public void handle(javafx.event.ActionEvent event) {
                changeHungryLvl();
                modifyStats.modifyLabels(label, "Hungry: " + Integer.toString(getHungryLvl()));
                //   label.setText("Hungry: " + Integer.toString(getHungryLvl()));

            }
        });

        Timeline timeline = new Timeline(
                new KeyFrame(Duration.seconds(0),
                        new EventHandler<ActionEvent>() {
                            @Override
                            public void handle(ActionEvent actionEvent) {
                                changeHungryLvlMinus();
                                modifyStats.modifyLabels(label, "Hungry: " + Integer.toString(getHungryLvl()));
                                //label.setText("Hungry: " + Integer.toString(getHungryLvl()));

                                if (getHungryLvl() < MINIMUMAMOUNT) {
                                    modifyStats.modifyLabels(notificationFun, "Low Feed lvl");
                                    //      notificationFun.setText("Low Feed lvl");
                                    if (getHungryLvl() <= 0) {
                                        System.out.println("Vader starved to dead");
                                        Platform.exit();
                                        System.exit(0);
                                    }
                                } else {
                                    modifyStats.modifyLabels(notificationFun, "Good Feed lvl");
                                    //notificationFun.setText("Good Feed lvl");
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


