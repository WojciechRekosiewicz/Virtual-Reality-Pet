import Controller.ModifyStats;
import Model.Statistics;
import View.View;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import org.junit.Assert;
import org.junit.Test;

import javafx.scene.control.Label;

import java.beans.Expression;
import java.util.Random;

import static junit.framework.TestCase.assertNotNull;
import static junit.framework.TestCase.fail;

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
//    public void ModifyLabelChecker() {
//        ModifyStats modifyStats = new ModifyStats();
//        Label ExpectedLabel = new Label();
//        String ExpectedText = "I'm a potato";
//        Label TestLabel = new Label();
////        modifyStats.modifyLabels(TestLabel, ExpectedText);
//        //  ExpectedLabel.setText(ExpectedText);
////        Assert.assertSame(ExpectedLabel, TestLabel);
//        //   Assert.assertR(modifyStats.modifyLabels(ExpectedLabel, ExpectedText));
//        Assert.assertNotNull(modifyStats.modifyLabels(ExpectedLabel, ExpectedText));
//
//    }
}
