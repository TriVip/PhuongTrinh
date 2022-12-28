package Excercise02;

public class CEO extends Employee{
    @Override
    public double getSalary() {
        return 100000;
    }

    @Override
    public double getBonusSalary() {
        return 0;
    }
}
