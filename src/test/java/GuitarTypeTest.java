import Instruments.GuitarType;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GuitarTypeTest {

    @Test
    public void canGetNumberOfStrings() {
        assertEquals(4, GuitarType.BASS.getNumberOfStrings());
    }

}
