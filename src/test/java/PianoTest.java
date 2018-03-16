import Instruments.InstrumentType;
import Instruments.Piano;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PianoTest {
    Piano piano;

    @Before
    public void before() {
        piano = new Piano("wood", "woody", "Steinway", "Upright", 200.00, 630.00, 88);
    }

    @Test
    public void canGetMaterial() {
        assertEquals("wood", piano.getMaterial());
    }

    @Test
    public void canGetColour() {
        assertEquals("woody", piano.getColour());
    }

    @Test
    public void canGetMake() {
        assertEquals("Steinway", piano.getMake());
    }

    @Test
    public void canGetModel() {
        assertEquals("Upright", piano.getModel());
    }

    @Test
    public void canGetType() {
        assertEquals(InstrumentType.KEYBOARD, piano.getType());
    }

    @Test
    public void canMakeSound() {
        assertEquals("plink-plonk", piano.play());
    }

    @Test
    public void canGetNumberOfKeys() {
        assertEquals(88, piano.getNumberOfKeys());
    }
}
