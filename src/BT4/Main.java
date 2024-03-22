package BT4;

public class Main {
    public static void main(String[] args) {
        System.out.println("BT4 - Complex number - To Vinh Tien - 22521474.");
        System.out.println("\nEnter the first complex number:");
        Complex c1 = Complex.input();
        System.out.println("\nEnter the second complex number:");
        Complex c2 = Complex.input();

        System.out.println("\nThe results are:");

        Complex sum = c1.add(c2);
        System.out.println(STR."Sum: \{sum}.");

        Complex difference = c1.subtract(c2);
        System.out.println(STR."Difference: \{difference}.");

        Complex product = c1.multiply(c2);
        System.out.println(STR."Product: \{product}.");

        Complex quotient = c1.divide(c2);
        System.out.println(STR."Quotient: \{quotient}.");
    }
}
