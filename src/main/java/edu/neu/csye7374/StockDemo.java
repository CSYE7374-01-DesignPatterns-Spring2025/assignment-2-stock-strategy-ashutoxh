package edu.neu.csye7374;

public class StockDemo {
    public static void demo(){
        AbstractFactory googleFactory = GoogleFactory.getInstance();
        StockAPI google = googleFactory.createStock("Google", 2000, "Google Inc");
        google.setMarketStrategy(new BullMarketStrategy());

        AbstractFactory netflixFactory = NetflixFactory.getInstance();
        StockAPI netflix = netflixFactory.createStock("Netflix", 1000, "Netflix Inc");
        netflix.setMarketStrategy(new BearMarketStrategy());

        // Arrays of bids to simulate market trends
        double[] bidsForStock1 = {20, 40, 60, 80, 100, 120};
        double[] bidsForStock2 = {20, 40, 60, 80, 100, 120};

        System.out.println("\n=== Simple Factory demo for Google ===");

        // Placing bids for Stock1 and showing its behavior
        System.out.println("Bids for Google with Bull Market Strategy:");
        for (double bid : bidsForStock1) {
            google.setBid(bid);
            System.out.println(google + ", Metric: " + google.getMetric());
        }

        System.out.println("\n=== Simple Factory demo for Netflix ===");

        // Placing bids for Netflix and showing its behavior
        System.out.println("Bids for Netflix with Bear Market Strategy:");
        for (double bid : bidsForStock2) {
            netflix.setBid(bid);
            System.out.println(netflix + ", Metric: " + netflix.getMetric());
        }

        // Demonstrating the Singleton factories:
        System.out.println("\n=== Lazy Singleton Factory demo for Google ===");
        AbstractFactory lazySingletonFactory = GoogleLazySingletonFactory.getInstance();
        StockAPI googleFromLazySingleton = lazySingletonFactory.createStock("LazyGoogle", 2000, "Google from Lazy Singleton Factory");
        googleFromLazySingleton.setMarketStrategy(new BullMarketStrategy());
        System.out.println("Bids for Google with Bull Market Strategy:");
        for (double bid : bidsForStock1) {
            googleFromLazySingleton.setBid(bid);
            System.out.println(googleFromLazySingleton + ", Metric: " + googleFromLazySingleton.getMetric());
        }

        System.out.println("\n=== Eager Singleton Factory demo for Netflix ===");
        AbstractFactory eagerSingletonFactory = NetflixEagerSingletonFactory.getInstance();
        StockAPI netflixFromEagerSingleton = eagerSingletonFactory.createStock("EagerNetflix", 1000, "Netflix from Eager Singleton Factory");
        netflixFromEagerSingleton.setMarketStrategy(new BearMarketStrategy());
        System.out.println("Bids for Netflix with Bear Market Strategy:");
        for (double bid : bidsForStock2) {
            netflixFromEagerSingleton.setBid(bid);
            System.out.println(netflixFromEagerSingleton + ", Metric: " + netflixFromEagerSingleton.getMetric());
        }
    }
}
