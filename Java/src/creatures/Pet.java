package creatures;

public class Pet extends Animal{
    public Pet(String species) {
        super(species);
    }

    @Override
    public void feed() {
        if(this.weight <= 0) {
            System.out.println("Unfortunately your pet is not able to eat no more.");
            return;
        }
        this.weight++;
    }

    @Override
    public void feed(Double foodWeight) {

    }
}
