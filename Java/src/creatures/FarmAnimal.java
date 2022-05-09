package creatures;

import interfaces.Edible;

public class FarmAnimal extends Animal implements Edible {
    public FarmAnimal(String species) {
        super(species);
    }

    @Override
    public void beEaten() {

    }

    @Override
    public void feed() {

    }

    @Override
    public void feed(Double foodWeight) {

    }
}
