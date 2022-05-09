import creatures.Pet;
import devices.Car;
import creatures.Animal;
import creatures.Human;

public class JavaApp {

    public static void main(String[] args) {
        Animal pet = new Pet("Chinchilla");
        Human human = new Human(pet);
        human.setSalary(84.0);
        human.setCar(new Car("Corsa", "Opel", "Green", 1000.0));
        System.out.println(human.getCar());
        human.setCar(new Car("Corsa", "Opel", "Green", 1000.0));
        Human buyer = new Human(null);
        buyer.cash = 999.0;
        human.getCar().sell(human, buyer, 10.0);
    }
}
