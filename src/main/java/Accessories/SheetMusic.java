package Accessories;

import Instruments.InstrumentType;

public class SheetMusic extends Accessory {
    private InstrumentType instrumentType;

    public SheetMusic(String name, double buyPrice, double sellPrice, InstrumentType instrumentType) {
        super(name, buyPrice, sellPrice);
        this.instrumentType = instrumentType;
    }


}
