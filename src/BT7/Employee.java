package BT7;

import MyUtils.stringUtils;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public abstract class Employee {
    protected String name;
    protected String birthDate;
    protected double salaryCoefficient;

    public Employee() {
    }

    public Employee(String name, String birthDate, double salaryCoefficient) {
        this.name = name;
        this.birthDate = birthDate;
        this.salaryCoefficient = salaryCoefficient;
    }

    public void input(Scanner scanner) {
        do {
            System.out.print("\nEnter name: ");
            this.name = scanner.nextLine();
            if (!stringUtils.isValidName(this.name)) {
                System.out.println("Invalid name! Please enter again.");
            }
        } while (!stringUtils.isValidName(this.name));

        System.out.println("Enter birth date: ");
        this.birthDate = stringUtils.validDate(scanner);

        System.out.print("Enter salary coefficient: ");
        this.salaryCoefficient = scanner.nextDouble();
    }

    public void displayEmployee() {
        System.out.println(STR."Name: \{this.name}.");
        System.out.println(STR."Birth Date: \{this.birthDate}.");
        System.out.println(STR."Salary Coefficient: \{this.salaryCoefficient}.");
    }

    public String calculateSalary(){
        NumberFormat formatter = NumberFormat.getNumberInstance(new Locale("vi", "VN"));
        return formatter.format(salaryCoefficient* 1200000);
    }

    public double getRawSalary() {
        return salaryCoefficient * 1200000;
    }

    public String getName() {
        return name;
    }

    public String getBirthDate() {
        return birthDate;
    }
}