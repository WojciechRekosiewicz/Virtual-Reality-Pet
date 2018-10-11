package Model;

import Controller.ModifyStats;

public class Feed {
    public void feedModify(int feed) {
        ModifyStats modifyStatsObject = new ModifyStats();
        modifyStatsObject.modifyStatsPlus(feed);
    }
}
