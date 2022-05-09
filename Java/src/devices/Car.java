package devices;

import creatures.Human;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public abstract class Car extends Device {
    final String model;
    final String producer;

    public Double value = 0.0;

    String color;

    public List<Human> owners;

    public Car(String model, String producer, String color, Double value, Date productionYear) {
        this.model = model;
        this.producer = producer;
        this.color = color;
        this.value = value;
        this.yearOfProduction = productionYear;
        this.owners = new ArrayList<>();
    }

    @Override
    public void turnOn() {
        System.out.println("Car is on");
    }

    @Override
    public void sell(Human seller, Human buyer, Double price) throws Exception {
        int sellerCarIndex = seller.getAnyCarParkingSpotNumber();
        int buyerEmptySpotIndex = buyer.getEmptyParkingSpotNumber();
        if (sellerCarIndex < 0) {
            throw new Exception("Nothing to sell.");
        }
        if (buyerEmptySpotIndex < 0) {
            throw new Exception("No place for car.");
        }
        if (seller.getCar(sellerCarIndex).owners.get(seller.getCar(sellerCarIndex).owners.size() - 1) != seller) {
            throw new Exception("This is not the real owner.");
        }
        if (buyer.cash < price) {
            System.out.println("Buyer doesn't have enough money.");
            return;
        }
        buyer.cash -= price;
        seller.cash += price;
        buyer.setCar(seller.getCar(sellerCarIndex), buyerEmptySpotIndex);
        seller.removeCar(sellerCarIndex);
        System.out.println("Buyer bought: " + buyer.getCar(buyerEmptySpotIndex));
        System.out.println("For: " + price);
    }

    abstract void refuel();

   public boolean hasOwner() {
        return !owners.isEmpty();
    }

   public boolean hasSoldTo(Human seller, Human buyer) {
        int indexOfSeller = owners.indexOf(seller);
        return owners.get(indexOfSeller + 1) == buyer;
    }

    public int transactionsAmount() {
        return owners.size();
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", producer='" + producer + '\'' +
                ", value=" + value +
                ", color='" + color + '\'' +
                ", producer='" + producer + '\'' +
                ", mode='" + mode + '\'' +
                ", yearOfProduction=" + yearOfProduction +
                ", value=" + value +
                '}';
    }
}
