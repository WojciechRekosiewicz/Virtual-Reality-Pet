package Model;

import Controller.ModifyStats;
import javafx.animation.Animation;
import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.util.Duration;

public class Notification extends Statistics {

    public int MINIMUMAMOUNT = 0;

    public void notifyAboutFun() {
        if (getFunLvl() < MINIMUMAMOUNT) {
            System.out.println("Low Fun");
        } else {
            // System.out.println();
        }
    }

    public void notifyAboutFeed() {
        if (getHungryLvl() < MINIMUMAMOUNT) {
            System.out.println("Vader is hungry");
        } else {
            //System.out.println();
        }
    }

    public void notifyAboutSleep() {
        if (getSleepLvl() < MINIMUMAMOUNT) {
            System.out.println("Vader is sleepy");
        } else {
            //System.out.println();
        }
    }

    public void notificationTimer() {
        Timeline timeline = new Timeline(new KeyFrame(Duration.seconds(1), e -> {
            notifyAboutFun();
            notifyAboutFeed();
            notifyAboutSleep();
        }));
        timeline.setCycleCount(Animation.INDEFINITE);
        timeline.play();
    }
    }





