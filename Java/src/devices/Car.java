package devices;

import creatures.Human;

public class Car extends Device {
    final String model;
    final String producer;

    public Double value = 0.0;

    String color;

    public Car(String model, String producer, String color, Double value) {
        this.model = model;
        this.producer = producer;
        this.color = color;
        this.value = value;
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", producer='" + producer + '\'' +
                ", value=" + value +
                ", color='" + color + '\'' +
                '}';
    }

    @Override
    public void turnOn() {
        System.out.println("Car is on");
    }

    @Override
    public void sell(Human seller, Human buyer, Double price) {
            if (seller.getCar() == null) {
                System.out.println("Nothing to sell.");
                return;
            }
            if (buyer.cash < price) {
                System.out.println("Buyer doesn't have enough money.");
                return;
            }
            buyer.cash -= price;
            seller.cash += price;
            buyer.setCar(seller.getCar());
            seller.removeCar();
            System.out.println("Buyer bought: " + buyer.getCar());
            System.out.println("For: " + price);
    }
}
