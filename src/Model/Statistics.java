package Model;

import Controller.ModifyStats;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

import java.util.Random;

public class Statistics extends ModifyStats {
    private Random generator = new Random();
    private int hungryLvl = 50;
    private int funLvl = 50;
    private int sleepLvl = 42;
    private Image Vader = new Image("vader.jpeg");
    private ImageView viewVader = new ImageView(Vader);

    public ImageView getViewVader() {
        return viewVader;
    }

    public int getSleepLvl() {
        return sleepLvl;
    }

    public void setSleepLvl(int sleepLvl) {
        this.sleepLvl = sleepLvl;
    }

    public int getHungryLvl() {
        return hungryLvl;
    }

    public void setHungryLvl(int hungryLvl) {
        this.hungryLvl = hungryLvl;
    }

    public int getFunLvl() {
        return funLvl;
    }

    public void setFunLvl(int funLvl) {
        this.funLvl = funLvl;
    }

    public void changeFunLvl() {
        setFunLvl(modifyStats(getFunLvl(), 10));
    }

    public void changeFunLvlMinus() {
        setFunLvl(modifyStats(getFunLvl(), -1));
    }

    public void changeHungryLvl() {
        setHungryLvl(modifyStats(getHungryLvl(), 10));
    }

    public void changeHungryLvlMinus() {
        setHungryLvl(modifyStats(getHungryLvl(), -1));
    }

    public void changeSleepLvl() {
        setSleepLvl(modifyStats(getSleepLvl(), 3));
    }

    public void changeSleepLvlMinus() {
        setSleepLvl(modifyStats(getSleepLvl(), -1));
    }


}
