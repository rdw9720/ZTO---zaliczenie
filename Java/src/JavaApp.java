import devices.Car;
import devices.Phone;

public class JavaApp {

    public static void main(String[] args) {
        Animal pet = new Animal("Chinchilla");
        Human human = new Human(pet);
        human.setSalary(84.0);
        human.setCar(new Car("Corsa", "Opel", "Green", 1000.0));
        System.out.println(human.getCar());
        human.setCar(new Car("Corsa", "Opel", "Green", 1000.0));
        System.out.println(human.getCar());
        System.out.println(pet.toString());
        System.out.println(human.toString());
        System.out.println(human.getCar().toString());
        System.out.println(new Phone().toString());
        human.getCar().turnOn();
    }
}
