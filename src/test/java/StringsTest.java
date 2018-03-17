import Accessories.Strings;
import Instruments.GuitarType;
import Instruments.InstrumentType;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class StringsTest {
    Strings pianoString;
    Strings bassGuitarString;

    @Before
    public void before() {
        pianoString = new Strings("Strings for piano", 4.00, 10.00, InstrumentType.KEYBOARD);
        bassGuitarString = new Strings("Strings for a bass guitar", 2.00, 6.00, InstrumentType.GUITAR, GuitarType.BASS);
    }

    @Test
    public void canGetMarkupPianoStrings() {
        assertEquals(6.00, pianoString.calculateMarkup(), 0.01);
    }

    @Test
    public void canGetMarkupBassGuitarStrings() {
        assertEquals(4.00, bassGuitarString.calculateMarkup(), 0.01);
    }
}
