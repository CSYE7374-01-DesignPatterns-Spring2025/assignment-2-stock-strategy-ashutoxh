package edu.neu.csye7374;

public interface MarketStrategy {
    double calculatePrice(double currentPrice, double bid);
}