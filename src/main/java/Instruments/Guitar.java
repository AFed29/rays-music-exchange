package Instruments;

public class Guitar extends Instrument {
    private GuitarType guitarType;

    public Guitar(String material, String colour, String make, String model, double buyPrice, double sellPrice, GuitarType guitarType) {
        super(material, colour, InstrumentType.GUITAR, make, model, buyPrice, sellPrice);
        this.guitarType = guitarType;
    }

    public GuitarType getGuitarType() {
        return guitarType;
    }

    public int getNumberOfStrings() {
        return guitarType.getNumberOfStrings();
    }
}
