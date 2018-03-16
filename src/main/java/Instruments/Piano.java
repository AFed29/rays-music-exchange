package Instruments;

public class Piano extends Instrument {
    private int numberOfKeys;

    public Piano(String material, String colour, String make, String model, double buyPrice, double sellPrice, int numberOfKeys) {
        super(material, colour, InstrumentType.KEYBOARD, make, model, buyPrice, sellPrice);
        this.numberOfKeys = numberOfKeys;
    }

    public int getNumberOfKeys() {
        return numberOfKeys;
    }
}
