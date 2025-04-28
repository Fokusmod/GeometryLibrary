package shapes;

public class Cube implements ThreeDimensionalShapes {

    private double length;

    public Cube(double length) {
        this.length = length;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    @Override
    public double area() {
        return 6 * length * length;
    }

    @Override
    public double perimeter() {
        return length * length * length;
    }
}
