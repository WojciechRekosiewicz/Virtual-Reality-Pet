import Controller.ModifyStats;
import Model.Statistics;
import View.View;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import org.junit.Assert;
import org.junit.Test;

import java.util.Random;

public class test {
    @Test
    public void isStatsHaveBeenCreated() {
        Statistics statisticsObject = new Statistics();
        int feedLvl = 50;
        int funLvl = 50;
        int sleepLvl = 50;
        Assert.assertEquals(feedLvl, statisticsObject.getHungryLvl());
        Assert.assertEquals(funLvl, statisticsObject.getFunLvl());
        Assert.assertEquals(sleepLvl, statisticsObject.getSleepLvl());
    }

    @Test
    public void ModifyStatsChecker() {
        ModifyStats modifyStats = new ModifyStats();
        int valueToCheck = 10;
        int valueAdded = 5;
        int resultExpected = 15;
        int resultFromFunction = modifyStats.modifyStats(valueToCheck, valueAdded);
        Assert.assertEquals(resultExpected, resultFromFunction);
    }


//    @Test
//    public void isImageAdded() {
//        Statistics statistics = new Statistics();
//        Image Vader = new Image("vader.jpeg");
//        ImageView vaderView = new ImageView(Vader);
//        Assert.assertEquals(vaderView, statistics.getViewVader());
//    }
}
