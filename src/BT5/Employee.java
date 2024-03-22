package BT5;

import java.util.Scanner;
import MyUtils.*;

public class Employee implements Measurable {
    private final String name;
    private final String id;
    private final int hoursWorked;
    private final double hourlyRate;

    public Employee(String name, String id, int hoursWorked, double hourlyRate) {
        this.name = name;
        this.id = id;
        this.hoursWorked = hoursWorked;
        this.hourlyRate = hourlyRate;
    }

    public static Employee input() {
        Scanner scanner = new Scanner(System.in);

        String name;
        do {
            System.out.print("Enter the employee's name: ");
            name = scanner.nextLine();
            if (!stringUtils.isValidName(name)) {
                System.out.println("Invalid name. Please enter again.");
            }
        } while (!stringUtils.isValidName(name));

        String id;
        do {
            System.out.print("Enter the employee's ID: ");
            id = scanner.nextLine();
            if (Main.employeeIDs.contains(id)) {
                System.out.println("This ID is already taken by another employee. Please enter a different ID.");
            }
        } while (Main.employeeIDs.contains(id));
        Main.employeeIDs.add(id);

        int hoursWorked;
        do {
            System.out.print("Enter the number of hours worked: ");
            while (!scanner.hasNextInt()) {
                System.out.println("Invalid input. Please enter a number.");
                scanner.next();
            }
            hoursWorked = scanner.nextInt();
            if (hoursWorked <= 0) {
                System.out.println("Invalid input. Worked hours must be greater than 0.");
            }
        } while (hoursWorked <= 0);

        double hourlyRate;
        do {
            System.out.print("Enter the hourly rate: ");
            while (!scanner.hasNextDouble()) {
                System.out.println("Invalid input. Please enter a number.");
                scanner.next();
            }
            hourlyRate = scanner.nextDouble();
            if (hourlyRate <= 0) {
                System.out.println("Invalid input. Hourly rate must be greater than 0.");
            }
        } while (hourlyRate <= 0);

        return new Employee(name, id, hoursWorked, hourlyRate);
    }

    public double valuate() {
        return hoursWorked * hourlyRate;
    }

    public String getName() {
        return name;
    }

    public String getId() {
        return id;
    }
}
