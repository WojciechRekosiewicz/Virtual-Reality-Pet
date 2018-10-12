package Model;

import Controller.ModifyStats;

import java.util.Random;

public class Statistics extends ModifyStats {
    private Random generator = new Random();
    private int hungryLvl = 50;
    private int funLvl = 10;
    private int sleepLvl = 50;


    @Override
    public String toString() {
        return "Statistics " + "\n" +
                "Feed " + hungryLvl + "\n" +
                "Fun " + funLvl + "\n" +
                "Energy " + sleepLvl + "\n";
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
        setFunLvl(modifyStatsPlus(getFunLvl(), 10));
    }

    public void changeHungryLvl() {
        setHungryLvl(modifyStatsPlus(getHungryLvl(), 10));
    }

    public void changeSleepLvl() {
        setSleepLvl(modifyStatsPlus(getSleepLvl(), -1));
        System.out.println(getSleepLvl());
    }


}
