package BT2;

import java.text.DecimalFormat;

public class Rectangle extends Shape {
    private final double width;
    private final double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public double calculateArea() {
        double area = width * height;
        DecimalFormat df = new DecimalFormat("#.####");
        return Double.parseDouble(df.format(area));
    }

    @Override
    public String toString() {
        return STR."Rectangle with area: \{calculateArea()}.";
    }
}