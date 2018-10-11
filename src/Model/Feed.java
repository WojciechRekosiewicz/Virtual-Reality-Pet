package Model;

import Controller.ModifyStats;

public class Feed {
    public void feedModify() {
        ModifyStats modifyStats = new ModifyStats();
        Statistics statistics = new Statistics();
        statistics.setHungryLvl(modifyStats.modifyStatsPlus(statistics.getHungryLvl(), 10));
        System.out.println(statistics.getHungryLvl());
    }
}
