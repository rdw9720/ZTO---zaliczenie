package devices;

import mammals.Human;

public class Phone extends Device {
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
}
