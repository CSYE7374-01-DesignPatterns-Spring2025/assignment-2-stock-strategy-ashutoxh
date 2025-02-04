package edu.neu.csye7374;

public class NetflixEagerSingletonFactory  implements AbstractFactory {
    private static final NetflixEagerSingletonFactory instance = new NetflixEagerSingletonFactory();

    private NetflixEagerSingletonFactory() {}

    public static NetflixEagerSingletonFactory getInstance() {
        return instance;
    }

    public Netflix createStock(String ID, double price, String description) {
        return new Netflix(ID, price, description);
    }
}
