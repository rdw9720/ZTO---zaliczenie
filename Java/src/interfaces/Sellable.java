package interfaces;

import creatures.Human;

public interface Sellable {
    void sell(Human seller, Human buyer, Double price);
}
