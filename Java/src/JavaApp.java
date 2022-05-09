public class JavaApp {

    public static void main(String[] args) {
        Animal pet = new Animal("Chinchilla");
        Human human = new Human(pet);
        human.car = new Car("Corsa", "Opel", "Red");
    }
}
