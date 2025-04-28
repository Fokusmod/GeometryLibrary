package shapes;

import java.math.BigDecimal;

public class Rectangle implements Shapes {

    private double length;

    private double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    public double perimeter() {
        return BigDecimal.valueOf(2 * (length + width)).doubleValue();
    }

    @Override
    public double area() {
        return BigDecimal.valueOf(length * width).doubleValue();
    }

    public double getLength() {
        return BigDecimal.valueOf(length).doubleValue();
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return BigDecimal.valueOf(width).doubleValue();
    }

    public void setWidth(double width) {
        this.width = width;
    }
}
