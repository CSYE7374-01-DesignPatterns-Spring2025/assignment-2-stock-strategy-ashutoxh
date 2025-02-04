package edu.neu.csye7374;

public class Google extends StockAPI implements Tradable {
    private double bidSum = 0;
    private int bidCount = 0;

    public Google(String ID, double price, String description) {
        super(ID, price, description);
    }

    @Override
    public int getMetric() {
        //logic: if average bid is positive, then metric is positive else negative
        return (int) (bidSum / bidCount);
    }
}

