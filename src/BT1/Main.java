package BT1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import MyUtilities.*;

public class Main {
    public static void main(String[] args) {
        System.out.print("BT1 - Person & Employee - To Vinh Tien - 22521474.");
        Scanner scanner = new Scanner(System.in);

        System.out.println("\nEnter number of employees: ");
        int numEmployees = scanner.nextInt();
        scanner.nextLine();

        List<Employee> employees = new ArrayList<>();
        for (int i = 0; i < numEmployees; i++) {
            System.out.println(STR."\nEnter information of \{stringUtilities.getOrdinal(i + 1)} employee:");
            Employee employee = Employee.input(scanner);
            employees.add(employee);
        }

        double totalSalary = calculateTotalSalary(employees);
        Employee highestPaidEmployee = Employee.findHighestPaidEmployee(employees);

        System.out.println(STR."\nCompany's total Salary: $\{totalSalary}.");
        if (highestPaidEmployee != null) {
            System.out.println("\nEmployee with highest salary:");
            highestPaidEmployee.displayInfo();
        } else {
            System.out.println("\nNo employees found.");
        }

        scanner.close();
    }

    private static double calculateTotalSalary(List<Employee> employees) {
        double totalSalary = 0;
        for (Employee employee : employees) {
            totalSalary += employee.calculateSalary();
        }
        return totalSalary;
    }
}
