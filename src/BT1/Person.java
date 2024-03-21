package BT1;

public class Person {
    private final String fullName;
    private final int age;
    private final String address;

    public Person(String fullName, int age, String address) {
        this.fullName = fullName;
        this.age = age;
        this.address = address;
    }

    public void displayInfo() {
        System.out.println(STR."Full name: \{fullName}.");
        System.out.println(STR."Age: \{age}.");
        System.out.println(STR."Address: \{address}.");
    }
}
