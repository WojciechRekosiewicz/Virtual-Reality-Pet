package Model;

import Controller.ModifyStats;

public class Notification extends Statistics {

    public int MINIMUMAMOUNT = 20;

    public void notifyAboutStat(int stat) {
        if (stat < MINIMUMAMOUNT) {
            if (stat == getFunLvl()) {
                System.out.println("Low Fun");
            } else if (stat == getHungryLvl()) {
                System.out.println("Vader is hungry");
            } else if (stat == getSleepLvl()) {
                System.out.println("Vader is sleepy");
            }
        }
    }

    public void notificationTimer() {

    }



    }

