public class JavaApp {

    public static void main(String[] args) {
        Animal pet = new Animal("Chinchilla");
        Human human = new Human(pet);
        human.car = new Car("Corsa", "Opel", "Red");
        System.out.println(human.getPreviousBankStatement());
        human.setSalary(5.0);
        System.out.println(human.getPreviousBankStatement());
        human.setSalary(10.0);
        System.out.println(human.getPreviousBankStatement());
    }
}
