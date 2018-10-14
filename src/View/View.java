package View;

import Model.Statistics;
import Model.Timers;
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
    public void createBoard(VBox board, Stage primaryStage) {
        Label labelEnergy = new Label();
        Label labelFeed = new Label();
        Label labelFun = new Label();
        Label notificationEnergy = new Label();
        Label notificationFeed = new Label();
        Label notificationFun = new Label();
        Timers timers = new Timers();
        Buttons buttons = new Buttons();
        primaryStage.setTitle("Tamagothi");


        timers.viewStats(labelEnergy, notificationEnergy);

        buttons.addButtons(board, labelFun, labelFeed, notificationFeed, notificationFun);

        board.getChildren().addAll(labelEnergy, labelFeed, labelFun, getViewVader(), notificationEnergy,
                notificationFeed, notificationFun);

        board.setPadding(new Insets(10, 10, 10, 10));
    }
}



