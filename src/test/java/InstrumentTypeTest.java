import Instruments.InstrumentType;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class InstrumentTypeTest {
    @Test
    public void canGetSound() {
        assertEquals("badum tssss", InstrumentType.DRUMS.getSound());
    }
}
