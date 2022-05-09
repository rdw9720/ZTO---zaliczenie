package devices;

import java.util.Date;

public class LPG extends Car {

    public LPG(String model, String producer, String color, Double value, Date productionYear) {
        super(model, producer, color, value, productionYear);
    }

    @Override
    void refuel() {

    }
}
