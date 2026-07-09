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
        getCoordinates().scale(factor, sign);

        if (sign) {
            width = width * factor;
            length = length * factor;
        } else {
            width = width / factor;
            length = length / factor;
        }
    }

    @Override
    public double getArea() {
        return width * length;
    }

    @Override
    public double getPerimeter() {
        return (2 * width) + (2 * length);
    }

    @Override
    public String display() {
        return "Rectangle: position (" + getCoordinates().display() + "), width = " + width
                + ", length = " + length + ", area = " + getArea()
                + ", perimeter = " + getPerimeter();
    }
}
