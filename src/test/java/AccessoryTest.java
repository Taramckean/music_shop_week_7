import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AccessoryTest {
    Accessory accessory;

   @Before
   public void before(){
        accessory = new Accessory("Musical sheet", 12, 15);
    }

    @Test
    public void canGetType(){
       assertEquals("Musical sheet", accessory.getType());
    }

    @Test
    public void canGetPriceBoughtFor(){
       assertEquals(12, accessory.getPriceBoughtFor());
    }

    @Test
    public void canGetPriceSoldFor() {
       assertEquals(15, accessory.getPriceSoldFor());
    }
}
