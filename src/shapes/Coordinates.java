package shapes;

/**
 * Represents a two-dimensional point on the canvas.
 */
public class Coordinates {
    private int x;
    private int y;

    public Coordinates(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    /**
     * Calculates the distance between this point and another point.
     */
    public double distance(Coordinates p) {
        // TODO: use Math.sqrt and Math.pow to calculate the distance formula.
        return 0.0;
    }

    /**
     * Moves the coordinate by the given x and y distances.
     */
    public void translate(int dx, int dy) {
        // TODO: add dx to x and dy to y.
    }

    /**
     * Scales the coordinate by multiplying or dividing by the factor.
     */
    public void scale(int factor, boolean sign) {
        // TODO: if sign is true multiply both values; otherwise divide both values.
    }

    /**
     * Returns the coordinate as a display string.
     */
    public String display() {
        return "X = " + x + ", Y = " + y;
    }
}
