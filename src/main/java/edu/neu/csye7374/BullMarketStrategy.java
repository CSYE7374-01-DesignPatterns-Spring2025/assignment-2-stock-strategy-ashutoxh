package edu.neu.csye7374;

public class BullMarketStrategy implements MarketStrategy {
    @Override
    public double calculatePrice(double currentPrice, double bid) {
        return currentPrice + (bid * 1.2); // 120% of the bid added to the price
    }
}