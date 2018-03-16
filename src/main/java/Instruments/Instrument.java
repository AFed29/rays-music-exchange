package Instruments;

import Behaviours.IPlay;
import Behaviours.ISell;

public abstract class Instrument implements IPlay, ISell {
    private String material;
    private String colour;
    private InstrumentType type;
    private String make;
    private String model;
    private double buyPrice;
    private double sellPrice;

    protected Instrument(String material, String colour, InstrumentType type, String make, String model, double buyPrice, double sellPrice) {
        this.material = material;
        this.colour = colour;
        this.type = type;
        this.make = make;
        this.model = model;
        this.buyPrice = buyPrice;
        this.sellPrice = sellPrice;
    }

    @Override
    public double calculateMarkup() {
        return sellPrice - buyPrice;
    }

    @Override
    public String play() {
        return type.getSound();
    }

    public String getMaterial() {
        return material;
    }

    public String getColour() {
        return colour;
    }

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public InstrumentType getType() {
        return type;
    }
}
