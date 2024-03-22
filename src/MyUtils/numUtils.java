package MyUtils;

import java.util.Scanner;

public class numUtils {
    public static double inputNonNegativeDouble(Scanner scanner, String message) {
        double number;
        do {
            System.out.print(message);
            while (!scanner.hasNextDouble()) {
                System.out.println("Invalid input. Please enter a number.");
                scanner.next();
            }
            number = scanner.nextDouble();
            if (number < 0) {
                System.out.println("Invalid input. Number must be non-negative.");
            }
        } while (number < 0);
        return number;
    }
}
