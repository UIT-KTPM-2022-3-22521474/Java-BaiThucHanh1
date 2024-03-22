package BT3;

import java.util.Scanner;
import MyUtils.*;
public class Main {
    public static void main(String[] args) {
        System.out.println("BT3 - Student Management - To Vinh Tien - 22521474.");
        StudentManager studentManager = new StudentManager();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\n1. Add student.");
            System.out.println("2. Display students.");
            System.out.println("3. Sort and display students.");
            System.out.println("4. Search student by name.");
            System.out.println("5. Display students with last name 'Le'.");
            System.out.println("0. Exit.");
            System.out.print("Enter your choice: ");
            int choice;
            if (scanner.hasNextInt()) {
                choice = scanner.nextInt();
                scanner.nextLine();
            } else {
                System.out.println("Invalid input. Please enter a number.");
                scanner.nextLine();
                continue;
            }

            switch (choice) {
                case 1:
                    System.out.print("\nAdd student");
                    System.out.print("\nEnter name: ");
                    String name = scanner.nextLine();
                    if (stringUtils.isValidName(name)) {
                        System.out.println("Invalid name. Please enter a valid name.");
                    } else {
                        double averageScore;
                        do {
                            System.out.print("Enter average score (0-10): ");
                            averageScore = scanner.nextDouble();
                            if (averageScore < 0 || averageScore > 10) {
                                System.out.println("Invalid average score. Please enter a value between 0 and 10.");
                            }
                            scanner.nextLine();
                        } while (averageScore < 0 || averageScore > 10);
                        studentManager.addStudent(new Student(name, averageScore));
                        System.out.println("\nStudent added successfully!");
                    }
                    break;
                case 2:
                    System.out.println("\nList of students:");
                    studentManager.displayStudents();
                    break;
                case 3:
                    System.out.println("\nList of students sorted by average score:");
                    studentManager.sortAndDisplayStudents();
                    break;
                case 4:
                    System.out.println("\nSearch student by name:");
                    System.out.print("Enter name to search: ");
                    String searchName = scanner.nextLine();
                    studentManager.searchStudentByName(searchName);
                    break;
                case 5:
                    System.out.println("\nList of students with last name 'Le':");
                    studentManager.displayStudentsWithLastNameLe();
                    break;
                case 0:
                    System.out.println("\nExiting program...");
                    return;
                default:
                    System.out.println("\nInvalid choice. Please enter 0-5.");
            }
            System.out.print("\nPress Enter to continue...");
            scanner.nextLine();
        }
    }
}
