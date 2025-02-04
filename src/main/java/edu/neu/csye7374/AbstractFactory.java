package edu.neu.csye7374;

public interface AbstractFactory {
    public StockAPI createStock(String ID, double price, String description);
}
