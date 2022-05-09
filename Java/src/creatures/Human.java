package creatures;

import devices.Car;
import devices.Phone;

import java.util.Date;

public class Human {
    Animal pet;

    public Car getCar() {
        return car;
    }

    private Car car;

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
        this.pet = pet;
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

    public void setCar(Car car) {
        if (salary > car.value) {
            System.out.println("You're rich enough to buy this car. Congrats!");
            this.car = car;
        } else if (salary > (car.value / 12)) {
            System.out.println("You're able to get the car with a bit of a loan. Congrats!");
            this.car = car;
        } else {
            System.out.println("Get a job pal.");
        }
    }

    public void removeCar() {
        this.car = null;
    }

    @Override
    public String toString() {
        return "Human{" +
                "pet=" + pet +
                ", car=" + car +
                ", previousBankStatementDate=" + previousBankStatementDate +
                ", previousBankStatementSalary=" + previousBankStatementSalary +
                ", salary=" + salary +
                '}';
    }
}
