package devices;

import creatures.Human;

import java.net.URL;

public class Phone extends Device {

    static final String serverAddress = "0.0.0.0";
    static final String protocol = "2.0";
    static final String versionName = "Cool_Version";

    @Override
    public String toString() {
        return "Phone{}";
    }

    @Override
    public void turnOn() {
        System.out.println("Phone is on");
    }

    @Override
    public void sell(Human seller, Human buyer, Double price) {
        if (seller.phone == null) {
            System.out.println("Nothing to sell.");
            return;
        }
        if (buyer.cash < price) {
            System.out.println("Buyer doesn't have enough money.");
            return;
        }
        buyer.cash -= price;
        seller.cash += price;
        buyer.phone = seller.phone;
        seller.phone = null;
        System.out.println("Buyer bought: " + buyer.phone);
        System.out.println("For: " + price);
    }

    public void installAnApp(String name) {

    }

    public void installAnApp(String name, String version) {

    }

    public void installAnApp(String name, String version, String serverAddress) {

    }

    public void installAnApp(String[] names) {

    }

    public void installAnApp(URL app) {

    }
}
