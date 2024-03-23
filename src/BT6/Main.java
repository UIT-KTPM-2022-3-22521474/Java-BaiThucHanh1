package BT6;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("BT6 - MyMath - To Vinh Tien - 22521474.\n");
        DecimalFormat df = new DecimalFormat("#.####");
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("1. GCD of two numbers");
            System.out.println("2. Max of three numbers");
            System.out.println("3. Min of three numbers");
            System.out.println("4. Check if a number is prime");
            System.out.println("5. Sum from 1 to N");
            System.out.println("6. Absolute value of a number");
            System.out.println("7. Round a number");
            System.out.println("8. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    int a;
                    do {
                        System.out.print("\nEnter the first number (an integer): ");
                        while (!scanner.hasNextInt()) {
                            System.out.println("That's not a valid integer.");
                            System.out.println("Please enter an integer greater than 0.");
                            scanner.next();
                        }
                        a = scanner.nextInt();
                        if (a <= 0) {
                            System.out.println("The number must be greater than 0. Please try again.");
                        }
                    } while (a <= 0);

                    int b;
                    do {
                        System.out.print("Enter the second number (an integer): ");
                        while (!scanner.hasNextInt()) {
                            System.out.println("That's not a valid integer.");
                            System.out.println("Please enter an integer greater than 0.");
                            scanner.next();
                        }
                        b = scanner.nextInt();
                        if (b <= 0) {
                            System.out.println("The number must be greater than 0. Please try again.");
                        }
                    } while (b <= 0);

                    System.out.println(STR."\nGCD of \{a} and \{b} is \{MyMath.gcd(a, b)}.");
                    System.out.println("\nPress Enter to continue...");
                    scanner.nextLine();
                    scanner.nextLine();
                    break;
                case 2:
                    System.out.print("\nEnter first number: ");
                    double c = scanner.nextDouble();
                    System.out.print("Enter second number: ");
                    double d = scanner.nextDouble();
                    System.out.print("Enter third number: ");
                    double e = scanner.nextDouble();
                    double max = MyMath.max(c, d, e);
                    System.out.println(STR."\nMax number of \{df.format(c)}, \{df.format(d)}, and \{df.format(e)} is \{df.format(max)}.");
                    System.out.println("\nPress Enter to continue...");
                    scanner.nextLine();
                    scanner.nextLine();
                    break;
                case 3:
                    System.out.print("\nEnter first number: ");
                    double f = scanner.nextDouble();
                    System.out.print("Enter second number: ");
                    double g = scanner.nextDouble();
                    System.out.print("Enter third number: ");
                    double h = scanner.nextDouble();
                    double min = MyMath.min(f, g, h);
                    System.out.println(STR."\nMin number of \{df.format(f)}, \{df.format(g)}, and \{df.format(h)} is \{df.format(min)}.");
                    System.out.println("\nPress Enter to continue...");
                    scanner.nextLine();
                    scanner.nextLine();
                    break;
                case 4:
                    int i;
                    do {
                        System.out.print("\nEnter a number (greater than 0): ");
                        while (!scanner.hasNextInt()) {
                            System.out.println("That's not a valid integer. Try again.");
                            scanner.next();
                        }
                        i = scanner.nextInt();
                    } while (i <= 0);

                    if (MyMath.isPrime(i)) {
                        System.out.println(STR."\nNumber \{i} is prime.");
                    } else {
                        System.out.println(STR."\nNumber \{i} is not prime.");
                    }
                    System.out.println("\nPress Enter to continue...");
                    scanner.nextLine();
                    scanner.nextLine();
                    break;
                case 5:
                    int j;
                    do {
                        System.out.print("\nEnter a number (greater than 1): ");
                        while (!scanner.hasNextInt()) {
                            System.out.println("That's not a valid integer. Try again.");
                            scanner.next();
                        }
                        j = scanner.nextInt();
                        if (j <= 1) {
                            System.out.print("The number must be greater than 1. Please try again.");
                        }
                    } while (j <= 1);

                    System.out.println(STR."\nSum from 1 to \{j} is \{MyMath.sum(j)}.");
                    System.out.println("\nPress Enter to continue...");
                    scanner.nextLine();
                    scanner.nextLine();
                    break;
                case 6:
                    System.out.print("\nEnter a number: ");
                    int k = scanner.nextInt();
                    System.out.println(STR."\nAbsolute value of \{k} is \{MyMath.abs(k)}.");
                    System.out.println("\nPress Enter to continue...");
                    scanner.nextLine();
                    scanner.nextLine();
                    break;
                case 7:
                    System.out.print("\nEnter a number: ");
                    double l = scanner.nextDouble();
                    System.out.println(STR."\nRound of \{l} is \{MyMath.round(l)}.");
                    System.out.println("\nPress Enter to continue...");
                    scanner.nextLine();
                    scanner.nextLine();
                    break;
                case 8:
                    System.out.println("\nExiting the program...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid choice. Please enter a number between 1 and 8.");
            }
        }
    }
}