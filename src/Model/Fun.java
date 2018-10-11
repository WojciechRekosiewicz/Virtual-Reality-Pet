package Model;

import Controller.ModifyStats;

public class Fun {

    Statistics statisticsObject = new Statistics();
    private int theFunLvl = statisticsObject.getFunLvl();

    public void funModify() {
        ModifyStats modifyStats = new ModifyStats();
        Statistics statistics = new Statistics();
        System.out.println(statistics.getFunLvl());
       // statistics.setFunLvl(theFunLvl + 10);
//        int x = statistics.getFunLvl();
//        statistics.setFunLvl(x + 10);
        statistics.setFunLvl(modifyStats.modifyStatsPlus(statistics.getFunLvl(), 10));
        System.out.println(statistics.getFunLvl());
    }
}
