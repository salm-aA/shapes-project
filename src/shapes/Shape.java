package shapes;

/**
 * Abstract superclass for all shapes in the program.
 */
public abstract class Shape {
    private Coordinates position;
    private int sides;

    public Shape(int noOfSides, Coordinates coord) {
        this.sides = noOfSides;
        this.position = coord;
    }

    public Coordinates getCoordinates() {
        return position;
    }

    public int getSides() {
        return sides;
    }

    public void setCoordinates(Coordinates newCoord) {
        this.position = newCoord;
    }

    /**
     * Moves the shape's main position.
     */
    public void translate(int dx, int dy) {
        position.translate(dx, dy);
    }

    public abstract void scale(int factor, boolean sign);

    public abstract double getArea();

    public abstract double getPerimeter();

    public abstract String display();
}
