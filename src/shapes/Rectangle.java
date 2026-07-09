package shapes;

/**
 * Represents a rectangle with a width and length.
 */
public class Rectangle extends Shape {
    private int width;
    private int length;

    public Rectangle(Coordinates coord, int width, int length) {
        super(4, coord);
        this.width = width;
        this.length = length;
    }

    @Override
    public void scale(int factor, boolean sign) {
        // TODO: scale the inherited position, width, and length.
    }

    @Override
    public double getArea() {
        // TODO: return width * length.
        return 0.0;
    }

    @Override
    public double getPerimeter() {
        // TODO: return 2 * width + 2 * length.
        return 0.0;
    }

    @Override
    public String display() {
        // TODO: include shape name, position, width, length, area, and perimeter.
        return "Rectangle";
    }
}
