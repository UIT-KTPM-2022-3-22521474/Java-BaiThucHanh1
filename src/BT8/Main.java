package BT8;

import java.util.Arrays;
import java.util.Scanner;
import MyUtils.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("BT8 - Student Comparable interface - To Vinh Tien - 22521474.");
        Scanner scanner = new Scanner(System.in);
        System.out.print("\nEnter the number of students: ");
        int n = scanner.nextInt();
        scanner.nextLine();

        Student[] students = new Student[n];
        for (int i = 0; i < n; i++) {
            String fullName;
            do {
                System.out.print(STR."\nEnter the name of \{stringUtils.getOrdinal(i + 1)} student: ");
                fullName = scanner.nextLine();
                if (!stringUtils.isValidName(fullName)) {
                    System.out.println("Invalid name! Please enter again.");
                }
            } while (!stringUtils.isValidName(fullName));
            System.out.print(STR."Enter the average score of \{stringUtils.getOrdinal(i + 1)} student : ");
            double averageScore = scanner.nextDouble();
            scanner.nextLine();

            students[i] = new Student(fullName, averageScore);
        }

        Arrays.sort(students);
        System.out.println(STR."\nList of students in ascending order of average score: \{Arrays.toString(students)}");
    }
}