import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ShopTest {
    Shop shop;
    Flugelhorn flugelhorn;

    @Before
    public void before(){
        shop = new Shop("Tara's Land of Weird Instruments");
        flugelhorn = new Flugelhorn("Wind", 300,
                800, "Brass", "Gold","TOOOOOT");
    }

    @Test
    public void canGetName(){
        assertEquals("Tara's Land of Weird Instruments", shop.getName());
    }

    @Test
    public void countStock(){
        assertEquals(0, shop.countStock());
    }

    @Test
    public void canAddInstrumentToShop(){
        shop.addInstrument(flugelhorn);
        assertEquals(1,shop.countStock());
    }


    @Test
    public void canRemoveInstrument(){
        shop.addInstrument(flugelhorn);
        shop.removeInstrument(flugelhorn);
        assertEquals(0, shop.countStock());
    }
}
