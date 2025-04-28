package shapes;

public class Sphere implements ThreeDimensionalShapes{

    private double radius;

    public Sphere(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double area() {
        return 4 * Math.PI * radius * radius;
    }

    @Override
    public double perimeter() {
        return (4.0 / 3) * Math.PI * radius * radius * radius;
    }
}
