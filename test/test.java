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
    public void isStrAndDexCreated() {
        Statistics StatisticsObject = new Statistics();
        Random generator = new Random();
        int strength = generator.nextInt(100);
        int dexterity = generator.nextInt(100);
        Assert.assertNotEquals(strength, StatisticsObject.getStrength());
        Assert.assertNotEquals(strength, StatisticsObject.getStrength());

    }

//    @Test
//    public void isHungry(){
//        Statistics statisticsObject = new Statistics();
//        int hungryLvl = 50;
//        int funLvl = 50;
//        Assert.assertEquals(hungryLvl, statisticsObject.getHungryLvl());
//        Assert.assertEquals(funLvl, statisticsObject.getFunLvl());
//    }

    @Test
    public void isImageAdded() {
        View viewObject = new View();
        Image Vader = new Image("vader.jpeg");
        ImageView vaderView = new ImageView(Vader);
        Assert.assertEquals(viewObject.getViewVader(), vaderView);
    }
}
