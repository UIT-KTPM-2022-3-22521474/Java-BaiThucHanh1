package BT2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.atomic.AtomicReference;
import MyUtils.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("BT2 - Shape - To Vinh Tien - 22521474.");
        Scanner scanner = new Scanner(System.in);
        int rectangleCount = 0;
        int circleCount = 0;
        Shape largestShape = null;

        AtomicReference<List<Shape>> shapes = new AtomicReference<>(new ArrayList<>());
        while (true) {
            System.out.print("\nEnter shape type (1 for Rectangle, 2 for Circle, 0 to exit the program): ");
            int shapeType = scanner.nextInt();
            if (shapeType == 0) {
                break;
            }
            switch (shapeType) {
                case 1:
                    System.out.println("\nEnter width and height:");
                    double width = numUtils.inputNonNegativeDouble(scanner, "Enter width: ");
                    double height = numUtils.inputNonNegativeDouble(scanner, "Enter height: ");
                    Rectangle rectangle = new Rectangle(width, height);
                    shapes.get().add(rectangle);
                    rectangleCount++;
                    if (largestShape == null || rectangle.calculateArea() > largestShape.calculateArea()) {
                        largestShape = rectangle;
                    }
                    break;
                case 2:
                    double radius = numUtils.inputNonNegativeDouble(scanner, "Enter radius: ");
                    Circle circle = new Circle(radius);
                    shapes.get().add(circle);
                    circleCount++;
                    if (largestShape == null || circle.calculateArea() > largestShape.calculateArea()) {
                        largestShape = circle;
                    }
                    break;
                default:
                    System.out.println("Invalid shape type. Please enter 0, 1, or 2.");
                    break;
            }
        }
        System.out.println(STR."\nNumber of rectangles: \{rectangleCount}.");
        System.out.println(STR."Number of circles: \{circleCount}.");
        System.out.println(STR."Shape with largest area: \{largestShape}");

        scanner.close();
    }

}