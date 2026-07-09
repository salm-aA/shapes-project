package shapes;

import java.util.ArrayList;

/**
 * Stores and manages a list of Shape objects.
 */
public class ShapeList {
    private ArrayList<Shape> listOfShapes;

    public ShapeList() {
        listOfShapes = new ArrayList<>();
    }

    public void addShape(Shape s) {
        listOfShapes.add(s);
    }

    public Shape getShape(int pos) {
        // TODO: check whether pos is valid before returning a shape.
        // Decide whether your menu uses 0-based or 1-based positions and be consistent.
        return null;
    }

    public Shape removeShape(int pos) {
        // TODO: check whether pos is valid before removing a shape.
        return null;
    }

    public double area(int pos) {
        // TODO: return the selected shape's area, or handle invalid positions gracefully.
        return 0.0;
    }

    public double perimeter(int pos) {
        // TODO: return the selected shape's perimeter, or handle invalid positions gracefully.
        return 0.0;
    }

    public void translateShapes(int dx, int dy) {
        // TODO: translate every shape in the list.
    }

    public void scale(int factor, boolean sign) {
        // TODO: scale every shape in the list.
    }

    public int getNumberOfShapes() {
        return listOfShapes.size();
    }

    public String display() {
        // TODO: build and return information for all shapes.
        return "";
    }
}
