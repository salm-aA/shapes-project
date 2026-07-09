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
        getCoordinates().scale(factor, sign);

        if (sign) {
            side = side * factor;
        } else {
            side = side / factor;
        }
    }

    @Override
    public double getArea() {
        return side * side;
    }

    @Override
    public double getPerimeter() {
        return 4 * side;
    }

    @Override
    public String display() {
        return "Square: position (" + getCoordinates().display() + "), side = " + side
                + ", area = " + getArea() + ", perimeter = " + getPerimeter();
    }
}
