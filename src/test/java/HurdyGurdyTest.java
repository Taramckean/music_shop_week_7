import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class HurdyGurdyTest {
    HurdyGurdy hurdyGurdy;
    
    @Before
    public void before() {
        hurdyGurdy = new HurdyGurdy("String", 200, 300,
                "wood", "brown", "Twaaaang");
    }
    @Test
    public void canGetPriceBoughtFor(){
        assertEquals(200, hurdyGurdy.getPriceBoughtFor());
    }

    @Test
    public void canGetPriceSoldFor(){
        assertEquals(300, hurdyGurdy.getPriceSoldFor());
    }

    @Test
    public void canGetMaterial(){
        assertEquals("wood", hurdyGurdy.getMaterial());
    }
    @Test
    public void canGetColour(){
        assertEquals("brown", hurdyGurdy.getColour());
    }
    @Test
    public void canGetType(){
        assertEquals("String", hurdyGurdy.getType());

    }

    @Test
    public void canPlay(){
        assertEquals("Twaaaang", hurdyGurdy.play());
}

    @Test
    public void canCalculateMarkup(){
        assertEquals(100, hurdyGurdy.calculateMarkup());
    }

    @Test
    public void canChangeKey(){
        hurdyGurdy.changeKey();
        assertEquals(2,hurdyGurdy.checkKey());
    }

    @Test
    public void cantChangeKeyAbove5(){
        hurdyGurdy.changeKey();
        hurdyGurdy.changeKey();
        hurdyGurdy.changeKey();
        hurdyGurdy.changeKey();
        hurdyGurdy.changeKey();
        hurdyGurdy.changeKey();
        hurdyGurdy.changeKey();
        assertEquals(5,hurdyGurdy.checkKey());
    }
}

