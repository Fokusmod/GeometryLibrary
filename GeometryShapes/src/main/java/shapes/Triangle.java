package shapes;

import java.math.BigDecimal;

public class Triangle implements Shapes {

    private double a;
    private double b;
    private double c;

    public Triangle(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getA() {
        return BigDecimal.valueOf(a).doubleValue();
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return BigDecimal.valueOf(b).doubleValue();
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getC() {
        return BigDecimal.valueOf(c).doubleValue();
    }

    public void setC(double c) {
        this.c = c;
    }

    @Override
    public double perimeter() {
        return BigDecimal.valueOf(a + b + c).doubleValue();
    }

    @Override
    public double area() {
        return BigDecimal.valueOf((a + b + c) / 2).doubleValue();
    }
}
