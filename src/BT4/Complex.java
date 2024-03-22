package BT4;

import java.util.Scanner;

public class Complex {
    private final double real;
    private final double imaginary;

    public Complex(double real, double imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    public static Complex input() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the real part: ");
        double real = scanner.nextDouble();
        System.out.print("Enter the imaginary part: ");
        double imaginary = scanner.nextDouble();
        return new Complex(real, imaginary);
    }

    public Complex add(Complex other) {
        double real = this.real + other.real;
        double imaginary = this.imaginary + other.imaginary;
        return new Complex(real, imaginary);
    }

    public Complex subtract(Complex other) {
        double real = this.real - other.real;
        double imaginary = this.imaginary - other.imaginary;
        return new Complex(real, imaginary);
    }

    public Complex multiply(Complex other) {
        double real = this.real * other.real - this.imaginary * other.imaginary;
        double imaginary = this.real * other.imaginary + this.imaginary * other.real;
        return new Complex(real, imaginary);
    }

    public Complex divide(Complex other) {
        double denominator = other.real * other.real + other.imaginary * other.imaginary;
        double real = (this.real * other.real + this.imaginary * other.imaginary) / denominator;
        double imaginary = (this.imaginary * other.real - this.real * other.imaginary) / denominator;
        return new Complex(real, imaginary);
    }

    @Override
    public String toString() {
        String realPart = (real == (int) real) ? String.valueOf((int) real) : String.valueOf(real);
        String imaginaryPart = (imaginary == (int) imaginary) ? String.valueOf((int) Math.abs(imaginary)) : String.valueOf(Math.abs(imaginary));

        if (imaginary < 0) {
            return STR."\{realPart} - \{imaginaryPart}i";
        } else {
            return STR."\{realPart} + \{imaginaryPart}i";
        }
    }
}