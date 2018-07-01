import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FlugelhornTest {
    Flugelhorn flugelhorn;
    
    @Before 
    public void before(){
        flugelhorn = new Flugelhorn("Wind", 300,
                800, "Brass", "Gold","TOOOOOT");
    }

    @Test
    public void canGetPriceBoughtFor(){
        assertEquals(300, flugelhorn.getPriceBoughtFor());
    }

    @Test
    public void canGetPriceSoldFor(){
        assertEquals(800, flugelhorn.getPriceSoldFor());
    }

    @Test
    public void canGetMaterial(){
        assertEquals("Brass", flugelhorn.getMaterial());
    }
    @Test
    public void canGetColour(){
        assertEquals("Gold", flugelhorn.getColour());
    }
    @Test
    public void canGetType(){
        assertEquals("Wind", flugelhorn.getType());

    }

    @Test
    public void canPlay(){
        assertEquals("TOOOOOT", flugelhorn.play());
    }

    @Test
    public void canMakeDifferentSound(){
        assertEquals("HOOOOOOOT", flugelhorn.pushValveDown());
    }
}

