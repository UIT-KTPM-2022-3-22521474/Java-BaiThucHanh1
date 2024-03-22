package BT5;

import java.util.Scanner;
import MyUtils.*;

public class Student implements Measurable {
    private final String name;
    private final String id;
    private final double mathGrade;
    private final double physicsGrade;
    private final double chemistryGrade;

    public Student(String name, String id, double mathGrade, double physicsGrade, double chemistryGrade) {
        this.name = name;
        this.id = id;
        this.mathGrade = mathGrade;
        this.physicsGrade = physicsGrade;
        this.chemistryGrade = chemistryGrade;
    }

    public static Student input() {
        Scanner scanner = new Scanner(System.in);

        String name;
        do {
            System.out.print("Enter the student's name: ");
            name = scanner.nextLine();
            if (!stringUtils.isValidName(name)) {
                System.out.println("Invalid name. Please enter again.");
            }
        } while (!stringUtils.isValidName(name));

        String id;
        do {
            System.out.print("Enter the student's ID: ");
            id = scanner.nextLine();
            if (Main.studentIDs.contains(id)) {
                System.out.println("This ID is already taken by another student. Please enter a different ID.");
            }
        } while (Main.studentIDs.contains(id));
        Main.studentIDs.add(id);

        double mathGrade;
        do {
            System.out.print("Enter the math grade: ");
            while (!scanner.hasNextDouble()) {
                System.out.println("Invalid input. Please enter a number.");
                scanner.next();
            }
            mathGrade = scanner.nextDouble();
            if (mathGrade < 0 || mathGrade > 10) {
                System.out.println("Invalid input. Grade must be between 0 and 10.");
            }
        } while (mathGrade < 0 || mathGrade > 10);

        double physicsGrade;
        do {
            System.out.print("Enter the physics grade: ");
            while (!scanner.hasNextDouble()) {
                System.out.println("Invalid input. Please enter a number.");
                scanner.next();
            }
            physicsGrade = scanner.nextDouble();
            if (physicsGrade < 0 || physicsGrade > 10) {
                System.out.println("Invalid input. Grade must be between 0 and 10.");
            }
        } while (physicsGrade < 0 || physicsGrade > 10);

        double chemistryGrade;
        do {
            System.out.print("Enter the chemistry grade: ");
            while (!scanner.hasNextDouble()) {
                System.out.println("Invalid input. Please enter a number.");
                scanner.next();
            }
            chemistryGrade = scanner.nextDouble();
            if (chemistryGrade < 0 || chemistryGrade > 10) {
                System.out.println("Invalid input. Grade must be between 0 and 10.");
            }
        } while (chemistryGrade < 0 || chemistryGrade > 10);

        return new Student(name, id, mathGrade, physicsGrade, chemistryGrade);
    }

    public double valuate() {
        return (mathGrade + physicsGrade + chemistryGrade) / 3;
    }

    public String getName() {
        return name;
    }

    public String getId() {
        return id;
    }
}
