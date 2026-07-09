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
        getCoordinates().scale(factor, sign);

        if (sign) {
            radius = radius * factor;
        } else {
            radius = radius / factor;
        }
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    @Override
    public String display() {
        return "Circle: centre (" + getCoordinates().display() + "), radius = " + radius
                + ", area = " + getArea() + ", perimeter = " + getPerimeter();
    }
}
