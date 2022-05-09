public class JavaApp {

    public static void main(String[] args) {
        Animal pet = new Animal("Chinchilla");
        Human human = new Human(pet);
        human.setSalary(80.0);
        human.setCar(new Car("Corsa", "Opel", "Green", 1000.0));
    }
}
