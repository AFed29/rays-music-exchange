import Instruments.Guitar;
import Instruments.GuitarType;
import Instruments.InstrumentType;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GuitarTest {
    Guitar guitar;

    @Before
    public void before() {
        guitar = new Guitar("vinyl", "black", "Fender", "Strat", 400.00, 1200.00, GuitarType.ELECTRIC);
    }

    @Test
    public void canGetMaterial() {
        assertEquals("vinyl", guitar.getMaterial());
    }

    @Test
    public void canGetColour() {
        assertEquals("black", guitar.getColour());
    }

    @Test
    public void canGetMake() {
        assertEquals("Fender", guitar.getMake());
    }

    @Test
    public void canGetModel() {
        assertEquals("Strat", guitar.getModel());
    }

    @Test
    public void canGetInstrumentType() {
        assertEquals(InstrumentType.GUITAR, guitar.getType());
    }

    @Test
    public void canGetGuitarType() {
        assertEquals(GuitarType.ELECTRIC, guitar.getGuitarType());
    }

    @Test
    public void canGetNumberOfStrings() {
        assertEquals(6, guitar.getNumberOfStrings());
    }

    @Test
    public void canMakeSound() {
        assertEquals("strum thrum", guitar.play());
    }
}
