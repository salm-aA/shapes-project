package shapes;

/**
 * Represents a square with one side length.
 */
public class Square extends Shape {
    private int side;

    public Square(Coordinates coord, int side) {
        super(4, coord);
        this.side = side;
    }

    @Override
    public void scale(int factor, boolean sign) {
        // TODO: scale the inherited position and side.
    }

    @Override
    public double getArea() {
        // TODO: return side * side.
        return 0.0;
    }

    @Override
    public double getPerimeter() {
        // TODO: return 4 * side.
        return 0.0;
    }

    @Override
    public String display() {
        // TODO: include shape name, position, side, area, and perimeter.
        return "Square";
    }
}
