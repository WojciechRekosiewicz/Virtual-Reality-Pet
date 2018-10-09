import Model.ActivityLvl;
import Model.Statistics;
import org.junit.Assert;
import org.junit.Test;

import java.util.Random;

public class test {
    @Test
    public void isStatsHaveBeenCreated() {
        ActivityLvl AL = new ActivityLvl();
        int feedLvl = 50;
        int funLvl = 50;
        Assert.assertEquals(feedLvl, AL.getFeedLvl());
        Assert.assertEquals(funLvl, AL.getFunLvl());
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
}
