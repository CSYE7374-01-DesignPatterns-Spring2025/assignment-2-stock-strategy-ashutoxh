package edu.neu.csye7374;

public class MarketDemo {
    public static void demo() {
        System.out.println("============ Trading Simulation Start ============\n");

        Stock googleStock = new GoogleStock(2500.0);
        googleStock.setMarketStrategy(new BullMarketStrategy());
        System.out.println("Google Stock - Bull Market Strategy:");
        System.out.println("Before:");
        System.out.println(googleStock);
        googleStock.applyBid(450);
        System.out.println("After:");
        System.out.println(googleStock);

        Stock netflixStock = new NetflixStock(900.0);
        netflixStock.setMarketStrategy(new BearMarketStrategy());
        System.out.println("\nNetflix Stock - Bear Market Strategy:");
        System.out.println("Before:");
        System.out.println(netflixStock);
        netflixStock.applyBid(69);
        System.out.println("After:");
        System.out.println(netflixStock);

        System.out.println("\n============ Trading Simulation End =============");
    }
}
