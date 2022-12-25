package Excercise02;

import java.util.ArrayList;
import java.util.List;

public class SalaryCalculator {

    public static void main(String[] args) {
        CEO ceo = new CEO(20000);

        Manager manager = new Manager();
        manager.setSalary(10000);

        NormalEmployee employee1 = new NormalEmployee();
        employee1.setSalary(2000);

        NormalEmployee employee2 = new NormalEmployee();
        employee2.setSalary(1500);

        List<NormalEmployee> normalEmployees = new ArrayList<>();
        normalEmployees.add(employee1);
        normalEmployees.add(employee2);

        double totalSalary = ceo.getSalary() + manager.getSalary();

        for (NormalEmployee emp : normalEmployees) {
            totalSalary += emp.getSalary();
        }

        System.out.printf("Total Salaries: %f", totalSalary);
    }
}
