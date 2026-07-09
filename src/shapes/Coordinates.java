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
        int differenceX = x - p.getX();
        int differenceY = y - p.getY();
        return Math.sqrt((differenceX * differenceX) + (differenceY * differenceY));
    }

    /**
     * Moves the coordinate by the given x and y distances.
     */
    public void translate(int dx, int dy) {
        x = x + dx;
        y = y + dy;
    }

    /**
     * Scales the coordinate by multiplying or dividing by the factor.
     */
    public void scale(int factor, boolean sign) {
        if (sign) {
            x = x * factor;
            y = y * factor;
        } else {
            x = x / factor;
            y = y / factor;
        }
    }

    /**
     * Returns the coordinate as a display string.
     */
    public String display() {
        return "X = " + x + ", Y = " + y;
    }
}
