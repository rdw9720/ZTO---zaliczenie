package devices;

import creatures.Human;

import java.util.Date;

public abstract class Car extends Device {
    final String model;
    final String producer;

    public Double value = 0.0;

    String color;

    public Car(String model, String producer, String color, Double value, Date productionYear) {
        this.model = model;
        this.producer = producer;
        this.color = color;
        this.value = value;
        this.yearOfProduction = productionYear;
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
