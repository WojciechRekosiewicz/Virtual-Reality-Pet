package Model;

import java.util.Random;

public class Statistics {
    private Random generator = new Random();
    private int strength = generator.nextInt(100);
    private int dexterity = generator.nextInt(100);
    private int hungryLvl = 50;
    private int funLvl = 50;
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

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public int getDexterity() {
        return dexterity;
    }

    public void setDexterity(int dexterity) {
        this.dexterity = dexterity;
    }
}
