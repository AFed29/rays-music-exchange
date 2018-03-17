package Accessories;

import Behaviours.ISell;

public abstract class Accessory implements ISell {
    private String name;
    private double buyPrice;
    private double sellPrice;

    protected Accessory(String name, double buyPrice, double sellPrice) {
        this.name = name;
        this.buyPrice = buyPrice;
        this.sellPrice = sellPrice;
    }

    @Override
    public double calculateMarkup() {
        return sellPrice - buyPrice;
    }

    public String getName() {
        return name;
    }
}
