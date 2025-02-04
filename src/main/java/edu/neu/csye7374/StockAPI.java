package edu.neu.csye7374;

public class StockAPI {
    protected String ID;
    protected double price;
    protected String description;
    protected MarketStrategy marketStrategy;

    public StockAPI(String ID, double price, String description) {
        this.ID = ID;
        this.price = price;
        this.description = description;
    }

    @Override
    public String toString() {
        return "Stock: " + this.ID + ", Price: $" + this.price + ", Description: " + this.description;
    }


    public void setBid(double bid) {
        if (marketStrategy == null) {
            throw new IllegalStateException("Market strategy not set!");
        }
        price = marketStrategy.calculatePrice(price, bid);
    }

    public int getMetric() {
        return 0;
    }

    public void setMarketStrategy(MarketStrategy marketStrategy) {
        this.marketStrategy = marketStrategy;
    }

    // Getter methods for attributes (if needed later)
    public String getID() {
        return ID;
    }

    public double getPrice() {
        return price;
    }

    public String getDescription() {
        return description;
    }
}
