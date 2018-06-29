import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class InstrumentTest {
    Instrument instrument;

    @Before
    public void before(){
        instrument = new Instrument("Flugelhorn", "Wind", 300, 800, "Brass", "Gold");
    }

    @Test
    public void canGetName(){
    assertEquals("Flugelhorn", instrument.getName());}

    @Test
    public void canGetPriceBoughtFor(){
        assertEquals(300, instrument.getPriceBoughtFor());
    }

    @Test
    public void canGetPriceSoldFor(){
        assertEquals(800, instrument.getPriceSoldFor());
    }

    @Test
    public void canGetMaterial(){
        assertEquals("Brass", instrument.getMaterial());
    }
    @Test
    public void canGetColour(){
        assertEquals("Gold", instrument.getColour());
    }
    @Test
    public void canGetType(){
        assertEquals("Wind", instrument.getType());

    }


}
