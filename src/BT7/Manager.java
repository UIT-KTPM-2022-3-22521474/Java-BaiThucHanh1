package BT7;

import java.util.Scanner;

public class Manager extends Employee {
    private final int numberOfEmployees;

    public Manager(Scanner scanner) {
        super.input(scanner);
        System.out.print("Enter number of employees: ");
        this.numberOfEmployees = scanner.nextInt();
    }

    public Manager(String name, String birthDate, double salaryCoefficient, int numberOfEmployees) {
        super(name, birthDate, salaryCoefficient);
        this.numberOfEmployees = numberOfEmployees;
    }

    @Override
    public void displayEmployee() {
        super.displayEmployee();
        System.out.println("Position: Manager.");
        System.out.println(STR."Number of Employees: \{numberOfEmployees}.");
        System.out.println(STR."Salary: \{calculateSalary()}VND.");
    }
}
