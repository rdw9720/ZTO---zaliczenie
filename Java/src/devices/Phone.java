package devices;

import creatures.Human;
import software.Application;

import java.net.URL;
import java.util.*;

public class Phone extends Device {

    static final String serverAddress = "0.0.0.0";
    static final String protocol = "2.0";
    static final String versionName = "Cool_Version";

    List<Application> applications = new ArrayList<>();

    @Override
    public String toString() {
        return "Phone{}";
    }

    @Override
    public void turnOn() {
        System.out.println("Phone is on");
    }

    @Override
    public void sell(Human seller, Human buyer, Double price) {
        if (seller.phone == null) {
            System.out.println("Nothing to sell.");
            return;
        }
        if (buyer.cash < price) {
            System.out.println("Buyer doesn't have enough money.");
            return;
        }
        buyer.cash -= price;
        seller.cash += price;
        buyer.phone = seller.phone;
        seller.phone = null;
        System.out.println("Buyer bought: " + buyer.phone);
        System.out.println("For: " + price);
    }

    public void buyAnApp(Human buyer, Application app) {
        if(buyer.cash >= app.price) {
            applications.add(app);
            buyer.cash -= app.price;
        }
    }

    public boolean hasAnApp(Application app) {
        return applications.contains(app);
    }

    public boolean hasAnApp(String name) {
        return applications.stream().anyMatch(app -> Objects.equals(app.name, name));
    }

    public void listFreeApps() {
        System.out.println(Arrays.toString(applications.stream().filter(app -> app.price == 0).toArray()));
    }

    public Double getAppsValue() {
        return applications.stream().filter(Objects::nonNull).mapToDouble(car -> car.price).sum();
    }

    public void printSortedAlphabetically() {
         Collections.sort(applications, new Comparator<Application>() {
            @Override
            public int compare(Application o1, Application o2) {
                return o1.name.compareTo(o2.name);
            }
        });
        System.out.println(Arrays.toString(applications.stream().map(app -> app.name).toArray()));
    }

    public void printSortedByPrice() {
        Collections.sort(applications, new Comparator<Application>() {
            @Override
            public int compare(Application o1, Application o2) {
                return (int) (o1.price - o2.price);
            }
        });
        System.out.println(Arrays.toString(applications.stream().map(app -> app.name).toArray()));
    }

    public void installAnApp(String name) {

    }

    public void installAnApp(String name, String version) {

    }

    public void installAnApp(String name, String version, String serverAddress) {

    }

    public void installAnApp(String[] names) {

    }

    public void installAnApp(URL app) {

    }
}
