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
        getCoordinates().translate(dx, dy);
        vertex2.translate(dx, dy);
        vertex3.translate(dx, dy);
    }

    @Override
    public void scale(int factor, boolean sign) {
        getCoordinates().scale(factor, sign);
        vertex2.scale(factor, sign);
        vertex3.scale(factor, sign);
    }

    @Override
    public double getArea() {
        double sideA = getCoordinates().distance(vertex2);
        double sideB = vertex2.distance(vertex3);
        double sideC = vertex3.distance(getCoordinates());
        double semiPerimeter = (sideA + sideB + sideC) / 2;

        return Math.sqrt(semiPerimeter * (semiPerimeter - sideA)
                * (semiPerimeter - sideB) * (semiPerimeter - sideC));
    }

    @Override
    public double getPerimeter() {
        double sideA = getCoordinates().distance(vertex2);
        double sideB = vertex2.distance(vertex3);
        double sideC = vertex3.distance(getCoordinates());

        return sideA + sideB + sideC;
    }

    @Override
    public String display() {
        return "Triangle: vertex 1 (" + getCoordinates().display() + "), vertex 2 ("
                + vertex2.display() + "), vertex 3 (" + vertex3.display()
                + "), area = " + getArea() + ", perimeter = " + getPerimeter();
    }
}
