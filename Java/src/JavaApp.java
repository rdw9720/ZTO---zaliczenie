import creatures.Pet;
import creatures.Animal;
import creatures.Human;
import devices.Phone;
import software.Application;

public class JavaApp {

    public static void main(String[] args) throws Exception {
        Animal pet = new Pet("Chinchilla");
        Human human = new Human(pet);
        human.setSalary(84.0);
        human.phone = new Phone();
        human.cash = 1000.0;
        Application firstApp = new Application("App", 456.0);
        human.phone.buyAnApp(human, firstApp);
        human.phone.buyAnApp(human, new Application("Zapp", 1.0));
        human.phone.buyAnApp(human, new Application("Rapp", 0.0));
        System.out.println(human.cash);
        System.out.println(human.phone.hasAnApp(firstApp.name));
        System.out.println(human.phone.hasAnApp(firstApp));
        human.phone.listFreeApps();
        System.out.println(human.phone.getAppsValue());
        human.phone.printSortedAlphabetically();
        human.phone.printSortedByPrice();
    }
}
