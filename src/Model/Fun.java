package Model;

import Controller.ModifyStats;

public class Fun extends Statistics {
    //private int theFunLvl = statisticsObject.getFunLvl();

    public void funModify() {
        ModifyStats modifyStats = new ModifyStats();
        setFunLvl(modifyStats.modifyStatsPlus(getFunLvl(), 10));
        System.out.println(getFunLvl());
       // return statistics;
    }
}
