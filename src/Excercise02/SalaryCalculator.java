package Excercise02;


import java.util.ArrayList;
import java.util.List;

public class SalaryCalculator {

    public static void main(String[] args) {

        Employee ceo = new CEO();
        Employee manager = new Manager();
        Employee standardEmployee1 = new StandardEmployee();
        Employee standardEmployee2 = new StandardEmployee();


        SalaryCalculator salaryCalculator = new SalaryCalculator();
        List<Employee> employees = new ArrayList<>();
        employees.add(ceo);
        employees.add(manager);
        employees.add(standardEmployee1);
        employees.add(standardEmployee2);

        double totalSalaries;
        totalSalaries = salaryCalculator.TotalSalaries(employees);
        System.out.printf("Total salaries: %f", totalSalaries );

    }

    public double TotalSalaries(List<Employee> employees){
        double totalSalaries = 0.0;

        for (Employee employee : employees) {
            totalSalaries += employee.getSalary() + employee.getBonusSalary();
        }
        
        return totalSalaries;
    }
}
