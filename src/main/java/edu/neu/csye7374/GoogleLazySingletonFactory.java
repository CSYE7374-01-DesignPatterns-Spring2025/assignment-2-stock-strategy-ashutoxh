package edu.neu.csye7374;

public class GoogleLazySingletonFactory  implements AbstractFactory {
    private static GoogleLazySingletonFactory instance;

    private GoogleLazySingletonFactory() {}

    public static synchronized GoogleLazySingletonFactory getInstance() {
        if (instance == null) {
            instance = new GoogleLazySingletonFactory();
        }
        return instance;
    }

    public Google createStock(String ID, double price, String description) {
        return new Google(ID, price, description);
    }
}
