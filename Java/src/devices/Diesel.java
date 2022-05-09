package devices;

import java.util.Date;

public class Diesel extends Car {


    public Diesel(String model, String producer, String color, Double value, Date productionYear) {
        super(model, producer, color, value, productionYear);
    }

    @Override
    void refuel() {

    }
}
