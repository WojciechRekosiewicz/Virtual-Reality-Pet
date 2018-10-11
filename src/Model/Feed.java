package Model;

import Controller.ModifyStats;

public class Feed extends Statistics {
    public void feedModify() {
        ModifyStats modifyStats = new ModifyStats();
        setHungryLvl(modifyStats.modifyStatsPlus(getHungryLvl(), 10));
        System.out.println(getHungryLvl());
    }
}
