package devices;

import interfaces.Sellable;

import java.util.Date;

public abstract class Device implements Sellable {
    String producer;
    String mode;
    public Date yearOfProduction;

    Double value;
    @Override
    public String toString() {
        return "Device{" +
                "producer='" + producer + '\'' +
                ", mode='" + mode + '\'' +
                ", yearOfProduction=" + yearOfProduction +
                '}';
    }

    public abstract void turnOn();
}
