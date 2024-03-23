package BT7;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class Director extends Employee {
    private final double positionCoefficient;
    public Director(Scanner scanner) {
        super.input(scanner);
        System.out.print("Enter position coefficient: ");
        this.positionCoefficient = scanner.nextDouble();
    }

    public Director(String name, String birthDate, double salaryCoefficient, double positionCoefficient) {
        super(name, birthDate, salaryCoefficient);
        this.positionCoefficient = positionCoefficient;
    }

    @Override
    public void displayEmployee() {
        super.displayEmployee();
        System.out.println("Position: Director.");
        System.out.println(STR."Position Coefficient: \{positionCoefficient}.");
        System.out.println(STR."Salary: \{calculateSalary()}VND.");
    }

    @Override
    public String calculateSalary() {
        NumberFormat formatter = NumberFormat.getNumberInstance(new Locale("vi", "VN"));
        return formatter.format((salaryCoefficient + positionCoefficient) * 1200000);
    }

    @Override
    public double getRawSalary() {
        return (salaryCoefficient + positionCoefficient) * 1200000;
    }
}
