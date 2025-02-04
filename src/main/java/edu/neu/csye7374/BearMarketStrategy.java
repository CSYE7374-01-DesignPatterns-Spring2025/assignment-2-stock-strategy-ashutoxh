package edu.neu.csye7374;

public class BearMarketStrategy implements MarketStrategy {
    @Override
    public double calculatePrice(double currentPrice, double bid) {
        return currentPrice - (bid * 0.8); // 80% of the bid deducted from the price
    }
}