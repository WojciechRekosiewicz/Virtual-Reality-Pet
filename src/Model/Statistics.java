package Model;

import java.util.Random;

public class Statistics {
    Random generator = new Random();
    int strength = generator.nextInt(100);
    int dexterity = generator.nextInt(100);

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
