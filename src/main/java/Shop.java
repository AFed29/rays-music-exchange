import Accessories.Strings;
import Behaviours.ISell;
import Instruments.Guitar;

import java.util.ArrayList;

public class Shop {
    private String name;
    private ArrayList<ISell> stock;

    public Shop(String name) {
        this.name =name;
        stock = new ArrayList<>();
    }

    public int getStockCount() {
        return this.stock.size();
    }

    public void addStock(ISell item) {
        this.stock.add(item);
    }

    public void removeStock(ISell item) {
        this.stock.remove(item);
    }

    public double getPotentialProfit() {
        double total = 0;
        for (ISell item : stock) {
            total += item.calculateMarkup();
        }
        return total;
    }
}
