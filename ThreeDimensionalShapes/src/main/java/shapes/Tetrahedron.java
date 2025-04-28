package shapes;

public class Tetrahedron implements ThreeDimensionalShapes{

    private double length;

    public Tetrahedron(double length) {
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
        return Math.sqrt(3) * length * length;
    }

    @Override
    public double perimeter() {
        return (Math.pow(length, 3) / (6 * Math.sqrt(2)));
    }
}
