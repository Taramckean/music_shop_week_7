import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ShopTest {
    Shop shop;
    Flugelhorn flugelhorn;
    Accessory accessory;

    @Before
    public void before(){
        shop = new Shop("Tara's Land of Weird Instruments");
        flugelhorn = new Flugelhorn("Wind", 300,
                800, "Brass", "Gold","TOOOOOT");
        accessory = new Accessory("Drumsticks", 12, 15);
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
        shop.addItem(flugelhorn);
        assertEquals(1,shop.countStock());
    }


    @Test
    public void canRemoveInstrument(){
        shop.addItem(flugelhorn);
        shop.removeItem(flugelhorn);
        assertEquals(0, shop.countStock());
    }

    @Test
    public void canAddAccessoryToShop(){
        shop.addItem(accessory);
        assertEquals(1,shop.countStock());
    }


    @Test
    public void canRemoveAccessory(){
        shop.addItem(accessory);
        shop.removeItem(accessory);
        assertEquals(0, shop.countStock());
    }

    @Test
    public void canCalculateTotalMarkup(){
        shop.addItem(accessory);
        shop.addItem(flugelhorn);
        assertEquals(503, shop.calculateTotalMarkup());

    }
}
