package creatures;

import devices.Car;
import devices.Phone;

import java.util.*;

public class Human {
    Animal pet;

    public Car getCar(int parkingNumber) {
        return garage[parkingNumber];
    }

    private Car[] garage;

    public Double getPreviousBankStatement() {
        System.out.println("Previous Bank Statement Date: " + previousBankStatementDate);
        System.out.println("Previous Bank Statement Salary: " + previousBankStatementSalary);
        this.previousBankStatementSalary = this.salary;
        this.previousBankStatementDate = new Date();
        return salary;
    }

    private Date previousBankStatementDate;
    private Double previousBankStatementSalary;

    private Double salary = 1000.0;
    public Double cash = 0.0;

    public Phone phone;

    public Human(Animal pet) {
        this(pet, 3);
    }

    public Human(Animal pet, int garageSize) {
        this.pet = pet;
        this.garage = new Car[garageSize];
    }

    public void setSalary(Double salary) {
        if (salary < 0) {
            System.out.println("Wrong salary amount");
            return;
        }
        System.out.println("New data has been sent to the accounting system.");
        System.out.println("Please get your contract annex from Ms. Hania from HR.");
        System.out.println("ZUS and US already know about your new paycheck. There's no point in hiding.");
        this.salary = salary;
    }

    public void setCar(Car car, int parkingNumber) {
        if (salary > car.value) {
            System.out.println("You're rich enough to buy this car. Congrats!");
            car.owners.add(this);
            this.garage[parkingNumber] = car;
        } else if (salary > (car.value / 12)) {
            System.out.println("You're able to get the car with a bit of a loan. Congrats!");
            car.owners.add(this);
            this.garage[parkingNumber] = car;
        } else {
            System.out.println("Get a job pal.");
        }
    }

    public void removeCar(int parkingNumber) {
        this.garage[parkingNumber] = null;
    }

    public int getAnyCarParkingSpotNumber() {
        int index = (int) Arrays.stream(garage).takeWhile(Objects::isNull).count();
        if (index == garage.length) {
            index = -1;
        }
        return index;
    }

    public int getEmptyParkingSpotNumber() {
        int index = (int) Arrays.stream(garage).takeWhile(Objects::nonNull).count();
        if (index == garage.length) {
            index = -1;
        }
        return index;
    }

    public Double getGarageValue() {
        return Arrays.stream(garage).filter(Objects::nonNull).mapToDouble(car -> car.value).sum();
    }

    public void sortGarageByOldest() {
        Arrays.sort(garage, new Comparator<Car>() {
            @Override
            public int compare(Car o1, Car o2) {
                if (o1 == null) {
                    return -1;
                }
                if (o2 == null) {
                    return 1;
                }
                return o1.yearOfProduction.compareTo(o2.yearOfProduction);
            }
        });
    }

    @Override
    public String toString() {
        return "Human{" +
                "pet=" + pet +
                ", garage=" + Arrays.toString(garage) +
                ", previousBankStatementDate=" + previousBankStatementDate +
                ", previousBankStatementSalary=" + previousBankStatementSalary +
                ", salary=" + salary +
                ", cash=" + cash +
                ", phone=" + phone +
                '}';
    }
}
