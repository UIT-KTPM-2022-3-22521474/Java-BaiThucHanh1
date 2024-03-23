package BT7;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("BT7 - Employee management - To Vinh Tien - 22521474.");
        List<Employee> employees = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\n1. Add employee");
            System.out.println("2. Display employees");
            System.out.println("3. Display highest salary employee");
            System.out.println("4. Display employees born in February");
            System.out.println("5. Display employees in Accounting department");
            System.out.println("6. Count employees named An");
            System.out.println("7. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    addEmployee(employees, scanner);
                    break;
                case 2:
                    System.out.println("\nEmployees:");
                    displayEmployees(employees);
                    break;
                case 3:
                    System.out.println("\nHighest salary employee:");
                    displayHighestSalaryEmployee(employees);
                    break;
                case 4:
                    displayEmployeesBornInFebruary(employees);
                    break;
                case 5:
                    displayEmployeesInAccountingDepartment(employees);
                    break;
                case 6:
                    countEmployeesNamedAn(employees);
                    break;
                case 7:
                    System.out.println("\nExiting the program...");
                    return;
                default:
                    System.out.println("Invalid choice. Please enter a number between 1 and 7.");
            }
        }
    }

    public static void addEmployee(List<Employee> employees, Scanner scanner) {
        System.out.print("\nEnter the type of employee to add (1 - Director, 2 - Manager, 3 - Worker): ");
        int type = scanner.nextInt();
        scanner.nextLine();

        switch (type) {
            case 1:
                employees.add(new Director(scanner));
                break;
            case 2:
                employees.add(new Manager(scanner));
                break;
            case 3:
                employees.add(new Worker(scanner));
                break;
            default:
                System.out.println("\nInvalid type. Please enter a number between 1 and 3.");
        }
        System.out.println("\nEmployee added successfully!\n");
    }

    private static void displayEmployees(List<Employee> employees) {
        for (Employee employee : employees) {
            employee.displayEmployee();
            System.out.println();
        }
    }

    private static void displayHighestSalaryEmployee(List<Employee> employees) {
        Employee highestSalaryEmployee = employees.getFirst();
        for (Employee employee : employees) {
            if (employee.getRawSalary() > highestSalaryEmployee.getRawSalary()) {
                highestSalaryEmployee = employee;
            }
        }
        highestSalaryEmployee.displayEmployee();
    }

    private static void displayEmployeesBornInFebruary(List<Employee> employees) {
        for (Employee employee : employees) {
            if (employee.getBirthDate().contains("/02/")) {
                System.out.println("\nEmployees born in February:");
                employee.displayEmployee();
            }else {
                System.out.println("\nNo employee born in February.");
            }
        }
    }

    private static void displayEmployeesInAccountingDepartment(List<Employee> employees) {
        for (Employee employee : employees) {
            if (employee instanceof Worker && ((Worker) employee).getUnitName().equals("Accounting")) {
                System.out.println("\nEmployees in Accounting department:");
                employee.displayEmployee();
            }else {
                System.out.println("\nNo employee in Accounting department.");
            }
        }
    }

    private static void countEmployeesNamedAn(List<Employee> employees) {
        int count = 0;
        for (Employee employee : employees) {
            if (employee.getName().equals("An")) {
                count++;
            }
        }
        System.out.println(STR."\nNumber of employees named An: \{count}.");
    }
}