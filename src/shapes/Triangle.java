package shapes;

/**
 * Represents a triangle using three vertices.
 */
public class Triangle extends Shape {
    private Coordinates vertex2;
    private Coordinates vertex3;

    public Triangle(Coordinates vertex1, Coordinates vertex2, Coordinates vertex3) {
        super(3, vertex1);
        this.vertex2 = vertex2;
        this.vertex3 = vertex3;
    }

    @Override
    public void translate(int dx, int dy) {
        // TODO: move all three vertices.
    }

    @Override
    public void scale(int factor, boolean sign) {
        // TODO: scale all three vertices.
    }

    @Override
    public double getArea() {
        // TODO: use Heron's Formula with the three side distances.
        return 0.0;
    }

    @Override
    public double getPerimeter() {
        // TODO: add the three distances between vertices.
        return 0.0;
    }

    @Override
    public String display() {
        // TODO: include all vertices, area, and perimeter.
        return "Triangle";
    }
}
