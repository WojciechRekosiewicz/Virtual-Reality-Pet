package Model;

import java.util.Random;

public class Statistics {
    private Random generator = new Random();
    private int hungryLvl = 50;
    private int funLvl = 50;

    @Override
    public String toString() {
        return "Statistics " + "\n" +
                "Feed " + hungryLvl + "\n" +
                "Fun " + funLvl + "\n" +
                "Energy " + sleepLvl + "\n";
    }

    private int sleepLvl = 50;


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

}
