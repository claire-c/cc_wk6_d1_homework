import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class WaterBottleTest {

    private WaterBottle waterbottle;

    @Before
        public void before(){
        waterbottle = new WaterBottle(100);
    }

    @Test
        public void hasVolume(){
        assertEquals(100, waterbottle.getVolume());
    }
}
