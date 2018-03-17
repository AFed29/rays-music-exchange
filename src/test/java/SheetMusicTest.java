import Accessories.SheetMusic;
import Instruments.InstrumentType;
import Instruments.Piano;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SheetMusicTest {
    SheetMusic sheetMusic;

    @Before
    public void before() {
        sheetMusic = new SheetMusic("Beethovan's Piano Sonatas", 8.00, 22.00, InstrumentType.KEYBOARD);
    }

    @Test
    public void canGetMarkup() {
        assertEquals(14.00, sheetMusic.calculateMarkup(), 0.01);
    }

}
