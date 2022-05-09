package creatures;

import interfaces.Sellable;

public abstract class Animal implements Sellable, Feedable {
    final String species;
    Double weight;

    public Animal(String species) {
        this.species = species;
        switch (species) {
            case "Chinchilla" -> this.weight = 1.0;
            case "Cat" -> this.weight = 4.0;
            case "Dog" -> this.weight = 11.0;
            default -> {
                System.out.println("Default weight is 999.");
                this.weight = 999.0;
            }
        }
    }

    void takeForAWalk() {
        if(this.weight <=0) {
            System.out.println("Unfortunately your pet is not able to walk no more.");
            return;
        }
        this.weight--;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "species='" + species + '\'' +
                ", weight=" + weight +
                '}';
    }

    @Override
    public void sell(Human seller, Human buyer, Double price) {
        if (seller.pet == null) {
            System.out.println("Nothing to sell.");
            return;
        }
        if (buyer.cash < price) {
            System.out.println("Buyer doesn't have enough money.");
            return;
        }
        buyer.cash -= price;
        seller.cash += price;
        buyer.pet = seller.pet;
        seller.pet = null;
        System.out.println("Buyer bought: " + buyer.pet);
        System.out.println("For: " + price);
    }
}
