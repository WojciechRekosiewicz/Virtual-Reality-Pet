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
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import javafx.scene.control.Label;
import javafx.util.Duration;

import java.awt.*;


public class View extends Statistics {
    Image Vader = new Image("vader.jpeg");
    ImageView viewVader = new ImageView(Vader);


    public ImageView getViewVader() {
        return viewVader;
    }

    public void createBoard(VBox board, Stage primaryStage) {
        Sleep sleep = new Sleep();
        Notification notification = new Notification();
        Statistics statistics = new Statistics();
        Label label = new Label();
        Buttons buttonsObject = new Buttons();
        primaryStage.setTitle("Tamagothi");

        viewStats(label);
        notification.notificationTimer();
        // sleep.modifySleepByTime();

        buttonsObject.addButtons(board);
        //  gridPane.add(digitalClock.(), 10, 10, 10, 10);
        // gridPane.add(getViewVader(), 400, 400, 100, 100);
        board.getChildren().addAll(label, getViewVader());
        board.setPadding(new Insets(10, 10, 10, 10));
    }

    public void viewStats(Label label) {
        Timeline timeline = new Timeline(
                new KeyFrame(Duration.seconds(0),
                        new EventHandler<ActionEvent>() {
                            @Override
                            public void handle(ActionEvent actionEvent) {
                                changeSleepLvl();
                                label.setText("Energy: " + Integer.toString(getSleepLvl()) + "\nFun: " + Integer.toString(getFunLvl()) +
                                        "\nFeed: " + Integer.toString(getHungryLvl()));

                            }
                        }
                ),
                new KeyFrame(Duration.seconds(1))
        );
        timeline.setCycleCount(Animation.INDEFINITE);
        timeline.play();
    }


}



