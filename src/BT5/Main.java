package BT5;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import MyUtils.*;

public class Main {
    public static HashSet<String> studentIDs = new HashSet<>();
    public static HashSet<String> employeeIDs = new HashSet<>();
    public static void main(String[] args) {
        System.out.println("BT5 - Employee and student management - To Vinh Tien - 22521474");
        Scanner scanner = new Scanner(System.in);

        System.out.print("\nEnter the number of employees: ");
        int numEmployees = scanner.nextInt();
        List<Measurable> measurables = new ArrayList<>();
        for (int i = 0; i < numEmployees; i++) {
            System.out.println(STR."\nEnter details for \{stringUtils.getOrdinal(i + 1)} employee:");
            measurables.add(Employee.input());
        }

        System.out.print("\nEnter the number of students: ");
        int numStudents = scanner.nextInt();
        for (int i = 0; i < numStudents; i++) {
            System.out.println(STR."\nEnter details for \{stringUtils.getOrdinal(i + 1)} student:");
            measurables.add(Student.input());
        }

        double totalSalary = 0;
        int employeeCount = 0;
        double totalGrade = 0;
        int studentCount = 0;

        for (Measurable measurable : measurables) {
            if (measurable instanceof Employee) {
                totalSalary += measurable.valuate();
                employeeCount++;
            } else if (measurable instanceof Student) {
                totalGrade += measurable.valuate();
                studentCount++;
            }
        }

        DecimalFormat df = new DecimalFormat("#.####");

        double averageSalary = totalSalary / employeeCount;
        double averageGrade = totalGrade / studentCount;

        System.out.println(STR."\nAverage employees' salary: $\{df.format(averageSalary)}.");
        System.out.println(STR."Average students' grade: \{df.format(averageGrade)}.");
    }
}