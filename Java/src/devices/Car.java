package devices;

public class Car {
    final String model;
    final String producer;

    public Double value;

    String color;
    public Car(String model, String producer, String color, Double value) {
        this.model = model;
        this.producer = producer;
        this.color = color;
        this.value = value;
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", producer='" + producer + '\'' +
                ", value=" + value +
                ", color='" + color + '\'' +
                '}';
    }
}