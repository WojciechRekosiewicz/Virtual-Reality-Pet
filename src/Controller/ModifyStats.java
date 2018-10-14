package Controller;

import Model.Statistics;

public class ModifyStats {
    public Integer modifyStats(int statToModify, int modifier) {
        statToModify += modifier;
        return statToModify;


    }
}
