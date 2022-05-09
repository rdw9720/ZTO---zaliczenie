import java.util.Date;

public class Human {
    Animal pet;
    Car car;
    private Date previousBankStatementDate;
    private Double previousBankStatementSalary;
    private Double salary;

    public Human(Animal pet) {
        this.pet = pet;
    }

    public void setSalary(Double salary) {
        if(salary < 0) {
            System.out.println("Wrong salary amount");
            return;
        }
        System.out.println("New data has been sent to the accounting system.");
        System.out.println("Please get your contract annex from Ms. Hania from HR.");
        System.out.println("ZUS and US already know about your new paycheck. There's no point in hiding.");
        this.salary = salary;
    }

    public Double getPreviousBankStatement() {
        System.out.println("Previous Bank Statement Date: " + previousBankStatementDate);
        System.out.println("Previous Bank Statement Salary: " + previousBankStatementSalary);
        this.previousBankStatementSalary = this.salary;
        this.previousBankStatementDate = new Date();
        return salary;
    }
}
