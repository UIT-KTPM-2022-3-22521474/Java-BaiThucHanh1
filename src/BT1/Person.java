package BT1;

import java.util.Scanner;
import MyUtils.*;

public class Person {
    private final String fullName;
    private final int age;
    private final String address;

    public Person(String fullName, int age, String address) {
        this.fullName = fullName;
        this.age = age;
        this.address = address;
    }

    public static Person input(Scanner scanner) {
        String fullName = null;
        int age = 0;
        String address = null;

        while (true) {
            try {
                if (fullName == null) {
                    System.out.print("Full name: ");
                    fullName = scanner.nextLine();
                    if (fullName == null || fullName.isEmpty()) {
                        throw new IllegalArgumentException("Full name cannot be empty.");
                    }
                    if (stringUtils.isValidName(fullName)) {
                        throw new IllegalArgumentException("Full name can only contain alphabetical characters.");
                    }
                }

                if (age == 0) {
                    System.out.print("Age: ");
                    age = scanner.nextInt();
                    scanner.nextLine();
                    if (age < 0) {
                        throw new IllegalArgumentException("Age cannot be negative.");
                    }
                }

                if (address == null) {
                    System.out.print("Address: ");
                    address = scanner.nextLine();
                    if (address == null || address.isEmpty()) {
                        throw new IllegalArgumentException("Address cannot be empty.");
                    }
                }

                return new Person(fullName, age, address);
            } catch (Exception e) {
                System.out.println(STR."Error: \{e.getMessage()} Please enter valid information.");
                if (e instanceof java.util.InputMismatchException) {
                    scanner.nextLine();
                }

                if (e.getMessage().contains("Full name")) {
                    fullName = null;
                } else if (e.getMessage().contains("Age")) {
                    age = 0;
                } else if (e.getMessage().contains("Address")) {
                    address = null;
                }
            }
        }
    }

    public String getFullName() {
        return fullName;
    }

    public int getAge() {
        return age;
    }

    public String getAddress() {
        return address;
    }

    public void displayInfo() {
        System.out.println(STR."Full name: \{fullName}.");
        System.out.println(STR."Age: \{age}.");
        System.out.println(STR."Address: \{address}.");
    }
}
