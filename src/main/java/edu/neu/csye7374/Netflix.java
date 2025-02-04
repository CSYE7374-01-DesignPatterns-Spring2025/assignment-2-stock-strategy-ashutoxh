package edu.neu.csye7374;

public class Netflix extends StockAPI implements Tradable {
    private double lastBid = 0;

    public Netflix(String ID, double price, String description) {
        super(ID, price, description);
    }

    @Override
    public int getMetric() {
        // logic: if last bid was positive, metric is positive, otherwise negative
        return lastBid > 0 ? 1 : -1;
    }
}

