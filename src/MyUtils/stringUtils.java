package MyUtils;

import java.util.Scanner;

public class stringUtils {
    public static String getOrdinal(int number) {
        int remainder10 = number % 10;
        int remainder100 = number % 100;
        if (remainder10 == 1 && remainder100 != 11) {
            return STR."\{number}st";
        } else if (remainder10 == 2 && remainder100 != 12) {
            return STR."\{number}nd";
        } else if (remainder10 == 3 && remainder100 != 13) {
            return STR."\{number}rd";
        } else {
            return STR."\{number}th";
        }
    }

    public static String validDate(Scanner scanner) {
        String date = "";
        boolean isValidDate = false;
        while (!isValidDate) {
            int day = -1;
            while (day < 1 || day > 31) {
                System.out.print("Day (1-31): ");
                day = scanner.nextInt();
                if (day < 1 || day > 31) {
                    System.out.println("Invalid day! Please enter again.");
                }
            }

            int month = -1;
            while (month < 1 || month > 12) {
                System.out.print("Month (1-12): ");
                month = scanner.nextInt();
                if (month < 1 || month > 12) {
                    System.out.println("Invalid month! Please enter again.");
                }
            }

            int year = -1;
            while (year < 1900 || year > 2099) {
                System.out.print("Year (1900-2099): ");
                year = scanner.nextInt();
                if (year < 1900 || year > 2099) {
                    System.out.println("Invalid year! Please enter again.");
                }
            }

            date = String.format("%02d/%02d/%04d", day, month, year);
            isValidDate = true;
        }
        scanner.nextLine();
        return date;
    }

    public static boolean isValidName(String name) {
        return name.matches("[a-zA-Z\\s]+");
    }
}
