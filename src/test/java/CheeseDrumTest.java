
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CheeseDrumTest {
    Cheesedrum cheesedrum;
    
    @Before 
    public void before(){
        cheesedrum = new Cheesedrum("Percussion", 150,
                500, "Cheese", "Yellow", "Boing");
        }


    @Test
    public void canGetPriceBoughtFor(){
        assertEquals(150, cheesedrum.getPriceBoughtFor());
    }

    @Test
    public void canGetPriceSoldFor(){
        assertEquals(500, cheesedrum.getPriceSoldFor());
    }

    @Test
    public void canGetMaterial(){
        assertEquals("Cheese", cheesedrum.getMaterial());
    }
    @Test
    public void canGetColour(){
        assertEquals("Yellow", cheesedrum.getColour());
    }
    @Test
    public void canGetType(){
        assertEquals("Percussion", cheesedrum.getType());

    }

    @Test
    public void canPlay(){
        assertEquals("Boing", cheesedrum.play());
    }

    @Test
    public void canCalculateMarkup(){
        assertEquals(350, cheesedrum.calculateMarkup());
    }

    @Test
    public void canGetSolidity(){
        assertEquals(8, cheesedrum.getSolidity());
    }

    @Test
    public void canMeltCheesedrums(){
        cheesedrum.bashHard();
        cheesedrum.bashHard();
        cheesedrum.bashHard();
        cheesedrum.bashHard();
        cheesedrum.bashHard();
        cheesedrum.bashHard();
        cheesedrum.bashHard();
        cheesedrum.bashHard();
        cheesedrum.bashHard();
        cheesedrum.bashHard();
        assertEquals(0, cheesedrum.getSolidity());

    }
    }
