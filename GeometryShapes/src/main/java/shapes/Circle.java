package shapes;

import java.math.BigDecimal;

public class Circle implements Shapes{

    private double radius;


    public Circle(int radius) {
        this.radius = radius;
    }

    @Override
    public double perimeter() {
        return BigDecimal.valueOf(2 * Math.PI * radius).doubleValue();
    }

    @Override
    public double area() {
        return BigDecimal.valueOf(Math.PI * Math.pow(radius, 2)).doubleValue();
    }

    public double getRadius() {
        return BigDecimal.valueOf(radius).doubleValue();
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }
}
