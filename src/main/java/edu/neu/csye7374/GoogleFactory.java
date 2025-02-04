package edu.neu.csye7374;

public class GoogleFactory implements AbstractFactory{
    public StockAPI createStock(String ID, double price, String description) {
        return new Google(ID, price, description);
    }

    public static AbstractFactory getInstance(){
        return new GoogleFactory();
    }
}
