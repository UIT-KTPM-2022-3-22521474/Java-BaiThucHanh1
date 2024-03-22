package BT1;


import java.text.DecimalFormat;
import java.util.List;
import java.util.Scanner;


public class Employee extends Person {
    private final double basicSalary;
    private final double coefficient;

    public Employee(String fullName, int age, String address, double basicSalary, double coefficient) {
        super(fullName, age, address);
        this.basicSalary = basicSalary;
        this.coefficient = coefficient;
    }

    public double calculateSalary() {
        double salary = basicSalary * coefficient;
        DecimalFormat df = new DecimalFormat("#.####");
        return Double.parseDouble(df.format(salary));
    }

    public static Employee findHighestPaidEmployee(List<Employee> employees) {
        if (employees == null || employees.isEmpty()) {
            return null;
        }

        Employee highestPaidEmployee = employees.getFirst();
        for (int i = 1; i < employees.size(); i++) {
            if (employees.get(i).calculateSalary() > highestPaidEmployee.calculateSalary()) {
                highestPaidEmployee = employees.get(i);
            }
        }
        return highestPaidEmployee;
    }

    public static Employee input(Scanner scanner) {
        String fullName = null;
        int age = 0;
        String address = null;
        double basicSalary = 0;
        double coefficient = 0;

        while (true) {
            try {
                Person person = Person.input(scanner);
                fullName = person.getFullName();
                age = person.getAge();
                address = person.getAddress();

                if (basicSalary == 0) {
                    System.out.print("Basic salary: $");
                    basicSalary = scanner.nextDouble();
                    scanner.nextLine();
                    if (basicSalary < 0) {
                        throw new IllegalArgumentException("Basic salary cannot be negative.");
                    }
                }

                if (coefficient == 0) {
                    System.out.print("Coefficient: ");
                    coefficient = scanner.nextDouble();
                    scanner.nextLine(); // Consume newline
                    if (coefficient < 0) {
                        throw new IllegalArgumentException("Coefficient cannot be negative.");
                    }
                }

                return new Employee(fullName, age, address, basicSalary, coefficient);
            } catch (Exception e) {
                System.out.println(STR."Error: \{e.getMessage()} Please enter valid information.");
                if (e instanceof java.util.InputMismatchException) {
                    scanner.nextLine();
                }

                if (e.getMessage().contains("Basic salary")) {
                    basicSalary = 0;
                } else if (e.getMessage().contains("Coefficient")) {
                    coefficient = 0;
                }
            }
        }
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println(STR."Basic salary: $\{basicSalary}.");
        System.out.println(STR."Coefficient: \{coefficient}.");
        System.out.println(STR."Employee's total salary: $\{calculateSalary()}.");
    }
}
