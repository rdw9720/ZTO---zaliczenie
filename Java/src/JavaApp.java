import creatures.Pet;
import creatures.Animal;
import creatures.Human;
import devices.Diesel;

import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;

public class JavaApp {

    public static void main(String[] args) throws Exception {
        Animal pet = new Pet("Chinchilla");
        Human human = new Human(pet);
        human.setSalary(84.0);
        human.setCar(new Diesel("Corsa", "Opel", "Green", 1000.0, new Date()), 0);
        human.setCar(new Diesel("Corsa", "Opel", "Green", 1000.0, Date.from(LocalDate.of(1985, 1, 1).atStartOfDay().atZone(ZoneId.systemDefault()).toInstant())), 1);
        Human buyer = new Human(null);
        human.sortGarageByOldest();
        buyer.cash = 1999.0;
        human.getCar(1).sell(human, buyer, 1000.0);
        System.out.println(human);
        System.out.println(buyer);
        System.out.println(buyer.cash);
        System.out.println(buyer.getCar(0).hasOwner());
        System.out.println(buyer.getCar(0).hasSoldTo(human, buyer));
        System.out.println(buyer.getCar(0).transactionsAmount());
    }
}
