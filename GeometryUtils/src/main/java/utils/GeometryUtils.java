package utils;


import shapes.Shapes;
import shapes.ThreeDimensionalShapes;

public class GeometryUtils {

    public static Shapes compareAreaShapes(Shapes one, Shapes two) {
        if (one.area() > two.area()) {
            return one;
        }
        return two;
    }

    public static Shapes comparePerimeterShapes(Shapes one, Shapes two) {
        if (one.perimeter() > two.perimeter()) {
            return one;
        }
        return two;
    }

    public static ThreeDimensionalShapes compareArea3dShapes(ThreeDimensionalShapes one, ThreeDimensionalShapes two) {
        if (one.area() > two.area()) {
            return one;
        }
        return two;
    }

    public static ThreeDimensionalShapes comparePerimeter3dShapes(ThreeDimensionalShapes one, ThreeDimensionalShapes two) {
        if (one.perimeter() > two.perimeter()) {
            return one;
        }
        return two;
    }
}
