package Excercise02;

public class Employee {
    private double salary;
    private double bonusSalary;

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public Employee() {

    }

    public Employee(double salary, double bonusSalary) {
        this.salary = salary;
        this.bonusSalary = bonusSalary;
    }

    public double getBonusSalary() {
        return bonusSalary;
    }

    public void setBonusSalary(double bonusSalary) {
        this.bonusSalary = bonusSalary;
    }
}
