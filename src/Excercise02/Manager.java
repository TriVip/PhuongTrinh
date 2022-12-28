package Excercise02;

public class Manager extends Employee {
    @Override
    public double getSalary() {
        return 50000;
    }

    @Override
    public double getBonusSalary() {
        return 1500;
    }
}
