package Accessories;

import Instruments.GuitarType;
import Instruments.InstrumentType;

public class Strings extends Accessory {
    InstrumentType instrumentType;
    GuitarType guitarType;

    public Strings(String name, double buyPrice, double sellPrice, InstrumentType instrumentType, GuitarType guitarType) {
        super(name, buyPrice, sellPrice);
        this.instrumentType = instrumentType;
        this.guitarType = guitarType;
    }

    public Strings(String name, double buyPrice, double sellPrice, InstrumentType instrumentType) {
        super(name, buyPrice, sellPrice);
        this.instrumentType = instrumentType;
    }


}
