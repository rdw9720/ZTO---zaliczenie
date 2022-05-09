package software;

public class Application {
    public String name;
    public Double price;
    String version;

    public Application(String name, Double price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Application{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", version='" + version + '\'' +
                '}';
    }
}
