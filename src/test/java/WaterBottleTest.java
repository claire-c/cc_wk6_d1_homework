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

    @Test
    public void canDrink(){
        assertEquals(90, waterbottle.drink());
    }

    @Test
    public void canEmpty(){
        assertEquals(0, waterbottle.empty());
    }

    @Test
    public void canFill(){
        assertEquals(100, waterbottle.fill());
    }
}
