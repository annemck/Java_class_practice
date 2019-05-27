import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class WaterBottleTest {

    WaterBottle bottle;

    @Before
    public void setup(){
        bottle = new WaterBottle();
    }

    @Test
    public void hasVolume(){
        assertEquals(100, bottle.getVolume());
    }

    @Test
    public void canTakeDrink(){
        bottle.drink();
        assertEquals(90, bottle.getVolume());
    }

    @Test
    public void canEmptyBottle(){
        bottle.empty();
        assertEquals(0, bottle.getVolume());
    }

    @Test
    public void canRefillBottle(){
        bottle.refill();
        assertEquals(100, bottle.getVolume());
    }

}
