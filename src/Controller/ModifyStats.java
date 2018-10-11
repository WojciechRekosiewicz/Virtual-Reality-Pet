package Controller;

import Model.Statistics;

public class ModifyStats {
    public Integer modifyStatsPlus(int statToModify, int modifier){
        statToModify += modifier;
        return statToModify;


    }
    public void modifyStatsByTime(int stat){}

}
