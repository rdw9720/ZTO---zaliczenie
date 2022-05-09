package devices;

public class Phone extends Device {
    @Override
    public String toString() {
        return "Phone{}";
    }

    @Override
    public void turnOn() {
        System.out.println("Phone is on");
    }
}
