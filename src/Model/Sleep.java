package Model;

import javafx.animation.Animation;
import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.util.Duration;

public class Sleep extends Statistics {
    public void sleepTimes(int sleepTime){

    }

    public void modifySleepByTime() {
        Timeline timeline = new Timeline(new KeyFrame(Duration.seconds(1), e -> {
            changeSleepLvl();
        }));
        timeline.setCycleCount(Animation.INDEFINITE);
        timeline.play();
    }
}
