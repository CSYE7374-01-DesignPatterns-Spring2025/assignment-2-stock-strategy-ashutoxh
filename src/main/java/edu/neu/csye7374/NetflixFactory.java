package edu.neu.csye7374;

public class NetflixFactory  implements AbstractFactory {
    public Netflix createStock(String ID, double price, String description) {
        return new Netflix(ID, price, description);
    }

    public static NetflixFactory getInstance(){
        return new NetflixFactory();
    }
}
