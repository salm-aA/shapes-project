package shapes;

/**
 * Represents a circle with a radius.
 */
public class Circle extends Shape {
    private int radius;

    public Circle(Coordinates coord, int radius) {
        super(0, coord);
        this.radius = radius;
    }

    @Override
    public void scale(int factor, boolean sign) {
        // TODO: scale the inherited position and radius.
    }

    @Override
    public double getArea() {
        // TODO: return Math.PI * radius * radius.
        return 0.0;
    }

    @Override
    public double getPerimeter() {
        // TODO: return 2 * Math.PI * radius.
        return 0.0;
    }

    @Override
    public String display() {
        // TODO: include shape name, centre position, radius, area, and perimeter.
        return "Circle";
    }
}
