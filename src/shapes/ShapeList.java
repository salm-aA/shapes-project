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
        if (isValidPosition(pos)) {
            return listOfShapes.get(pos - 1);
        }

        System.out.println("There is no shape at position " + pos + ".");
        return null;
    }

    public Shape removeShape(int pos) {
        if (isValidPosition(pos)) {
            return listOfShapes.remove(pos - 1);
        }

        System.out.println("There is no shape at position " + pos + ".");
        return null;
    }

    public double area(int pos) {
        Shape shape = getShape(pos);

        if (shape != null) {
            return shape.getArea();
        }

        return 0.0;
    }

    public double perimeter(int pos) {
        Shape shape = getShape(pos);

        if (shape != null) {
            return shape.getPerimeter();
        }

        return 0.0;
    }

    public void translateShapes(int dx, int dy) {
        for (Shape shape : listOfShapes) {
            shape.translate(dx, dy);
        }
    }

    public void scale(int factor, boolean sign) {
        for (Shape shape : listOfShapes) {
            shape.scale(factor, sign);
        }
    }

    public int getNumberOfShapes() {
        return listOfShapes.size();
    }

    public String display() {
        if (listOfShapes.isEmpty()) {
            return "There are no shapes in the list.";
        }

        String result = "";

        for (int i = 0; i < listOfShapes.size(); i++) {
            result = result + "Position " + (i + 1) + ": "
                    + listOfShapes.get(i).display() + "\n";
        }

        return result;
    }

    private boolean isValidPosition(int pos) {
        return pos >= 1 && pos <= listOfShapes.size();
    }
}
