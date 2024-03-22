package BT2;

import java.text.DecimalFormat;

public class Circle extends Shape {
    private final double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        double area = Math.PI * radius * radius;
        DecimalFormat df = new DecimalFormat("#.####");
        return Double.parseDouble(df.format(area));
    }

    @Override
    public String toString() {
        return STR."Circle with area: \{calculateArea()}.";
    }
}