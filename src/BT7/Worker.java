package BT7;

import java.util.Scanner;

public class Worker extends Employee {
    private final String unitName;

    public Worker(Scanner scanner) {
        super.input(scanner);
        System.out.print("Enter unit name: ");
        scanner.nextLine();
        this.unitName = scanner.nextLine();
    }

    public Worker(String name, String birthDate, double salaryCoefficient, String unitName) {
        super(name, birthDate, salaryCoefficient);
        this.unitName = unitName;
    }

    @Override
    public void displayEmployee() {
        super.displayEmployee();
        System.out.println("Position: Worker.");
        System.out.println(STR."Unit Name: \{unitName}.");
        System.out.println(STR."Salary: \{calculateSalary()}VND.");
    }

    public String getUnitName() {
        return unitName;
    }
}