import Model.ActivityLvl;
import org.junit.Assert;
import org.junit.Test;

import java.util.Random;

public class test {
    @Test
    public void ifStatsHaveBeenCreated() {
        ActivityLvl AL = new ActivityLvl();
        Random generator = new Random();
        int strength = generator.nextInt(100);
        int dexterity = generator.nextInt(100);
        int feedLvl = 50;
        int funLvl = 50;
        Assert.assertEquals(feedLvl, AL.getFeedLvl());
        Assert.assertEquals(funLvl, AL.getFunLvl());
    }
}
