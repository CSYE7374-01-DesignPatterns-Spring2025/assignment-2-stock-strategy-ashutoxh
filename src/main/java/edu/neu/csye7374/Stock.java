package edu.neu.csye7374;
abstract class Stock {
    protected String name;
    protected double price;
    private MarketStrategy marketStrategy;

    public Stock(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public void setMarketStrategy(MarketStrategy marketStrategy) {
        this.marketStrategy = marketStrategy;
    }

    public void applyBid(double bid) {
        if (marketStrategy == null) {
            throw new IllegalStateException("Market strategy not set!");
        }
        price = marketStrategy.calculatePrice(price, bid);
    }

    @Override
    public String toString() {
        return "Stock: " + name + ", Current Price: $" + price;
    }
}
