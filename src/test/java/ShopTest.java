import Accessories.Strings;
import Instruments.Guitar;
import Instruments.GuitarType;
import Instruments.InstrumentType;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ShopTest {
    Shop shop;
    Guitar guitar;
    Strings acousticGuitarStrings;

    @Before
    public void before() {
        shop = new Shop("Ray's Music Exchange");
        guitar = new Guitar("wood", "tan", "Yamaha", "GL-1", 44.00, 62.00, GuitarType.ACOUSTIC);
        acousticGuitarStrings = new Strings("Guitar Strings", 3.00, 6.00, InstrumentType.GUITAR, GuitarType.ACOUSTIC);
    }

    @Test
    public void stockStartsEmpty() {
        assertEquals(0, shop.getStockCount());
    }

    @Test
    public void canAddInstrumentToStock() {
        shop.addStock(guitar);
        assertEquals(1, shop.getStockCount());
    }

    @Test
    public void canAddAccessoryToStock() {
        shop.addStock(acousticGuitarStrings);
        assertEquals(1, shop.getStockCount());
    }

    @Test
    public void canRemoveStock() {
        shop.addStock(acousticGuitarStrings);
        assertEquals(1, shop.getStockCount());
        shop.addStock(guitar);
        assertEquals(2, shop.getStockCount());
        shop.removeStock(acousticGuitarStrings);
        assertEquals(1, shop.getStockCount());
    }

    @Test
    public void canGetTotalPotentialProfit() {
        shop.addStock(acousticGuitarStrings);
        shop.addStock(guitar);
        assertEquals(21.00, shop.getPotentialProfit(), 0.01);
    }
}
