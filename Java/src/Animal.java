public class Animal {
    final String species;
    private Double weight;

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

    void feed() {
        if(this.weight <= 0) {
            System.out.println("Unfortunately your pet is not able to eat no more.");
            return;
        }
        this.weight++;
    }

    void takeForAWalk() {
        if(this.weight <=0) {
            System.out.println("Unfortunately your pet is not able to walk no more.");
            return;
        }
        this.weight--;
    }
}
