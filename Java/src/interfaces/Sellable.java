package interfaces;

import mammals.Human;

public interface Sellable {
    void sell(Human seller, Human buyer, Double price);
}
