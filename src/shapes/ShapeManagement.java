package shapes;

import java.util.Scanner;

/**
 * Console menu for managing shapes.
 */
public class ShapeManagement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ShapeList shapes = new ShapeList();
        boolean running = true;

        while (running) {
            printMenu();
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    addShape(scanner, shapes);
                    break;
                case 2:
                    removeShape(scanner, shapes);
                    break;
                case 3:
                    displayOneShape(scanner, shapes);
                    break;
                case 4:
                    displayAreaAndPerimeter(scanner, shapes);
                    break;
                case 5:
                    System.out.println(shapes.display());
                    break;
                case 6:
                    translateShapes(scanner, shapes);
                    break;
                case 7:
                    scaleShapes(scanner, shapes);
                    break;
                case 0:
                    running = false;
                    break;
                default:
                    System.out.println("Invalid option. Please try again.");
                    break;
            }
        }

        scanner.close();
    }

    private static void printMenu() {
        System.out.println("1: add a shape");
        System.out.println("2: remove a shape by position");
        System.out.println("3: get information about a shape by position");
        System.out.println("4: area and perimeter of a shape by position");
        System.out.println("5: display information of all the shapes");
        System.out.println("6: translate all the shapes");
        System.out.println("7: scale all the shapes");
        System.out.println("0: quit program");
        System.out.print("Choose an option: ");
    }

    private static void addShape(Scanner scanner, ShapeList shapes) {
        System.out.println("Choose the shape to add:");
        System.out.println("1: triangle");
        System.out.println("2: rectangle");
        System.out.println("3: circle");
        System.out.println("4: square");
        System.out.print("Shape option: ");
        int shapeChoice = scanner.nextInt();

        switch (shapeChoice) {
            case 1:
                shapes.addShape(createTriangle(scanner));
                System.out.println("Triangle added.");
                break;
            case 2:
                shapes.addShape(createRectangle(scanner));
                System.out.println("Rectangle added.");
                break;
            case 3:
                shapes.addShape(createCircle(scanner));
                System.out.println("Circle added.");
                break;
            case 4:
                shapes.addShape(createSquare(scanner));
                System.out.println("Square added.");
                break;
            default:
                System.out.println("Invalid shape option.");
                break;
        }
    }

    private static Triangle createTriangle(Scanner scanner) {
        System.out.println("Enter vertex 1:");
        Coordinates vertex1 = readCoordinates(scanner);
        System.out.println("Enter vertex 2:");
        Coordinates vertex2 = readCoordinates(scanner);
        System.out.println("Enter vertex 3:");
        Coordinates vertex3 = readCoordinates(scanner);

        return new Triangle(vertex1, vertex2, vertex3);
    }

    private static Rectangle createRectangle(Scanner scanner) {
        Coordinates position = readCoordinates(scanner);
        System.out.print("Enter width: ");
        int width = scanner.nextInt();
        System.out.print("Enter length: ");
        int length = scanner.nextInt();

        return new Rectangle(position, width, length);
    }

    private static Circle createCircle(Scanner scanner) {
        Coordinates position = readCoordinates(scanner);
        System.out.print("Enter radius: ");
        int radius = scanner.nextInt();

        return new Circle(position, radius);
    }

    private static Square createSquare(Scanner scanner) {
        Coordinates position = readCoordinates(scanner);
        System.out.print("Enter side: ");
        int side = scanner.nextInt();

        return new Square(position, side);
    }

    private static Coordinates readCoordinates(Scanner scanner) {
        System.out.print("Enter x: ");
        int x = scanner.nextInt();
        System.out.print("Enter y: ");
        int y = scanner.nextInt();

        return new Coordinates(x, y);
    }

    private static void removeShape(Scanner scanner, ShapeList shapes) {
        System.out.print("Enter the position to remove: ");
        int position = scanner.nextInt();
        Shape removedShape = shapes.removeShape(position);

        if (removedShape != null) {
            System.out.println("Removed: " + removedShape.display());
        }
    }

    private static void displayOneShape(Scanner scanner, ShapeList shapes) {
        System.out.print("Enter the position to display: ");
        int position = scanner.nextInt();
        Shape shape = shapes.getShape(position);

        if (shape != null) {
            System.out.println(shape.display());
        }
    }

    private static void displayAreaAndPerimeter(Scanner scanner, ShapeList shapes) {
        System.out.print("Enter the position: ");
        int position = scanner.nextInt();
        Shape shape = shapes.getShape(position);

        if (shape != null) {
            System.out.println("Area: " + shape.getArea());
            System.out.println("Perimeter: " + shape.getPerimeter());
        }
    }

    private static void translateShapes(Scanner scanner, ShapeList shapes) {
        System.out.print("Enter x distance: ");
        int dx = scanner.nextInt();
        System.out.print("Enter y distance: ");
        int dy = scanner.nextInt();

        shapes.translateShapes(dx, dy);
        System.out.println("All shapes translated.");
    }

    private static void scaleShapes(Scanner scanner, ShapeList shapes) {
        System.out.print("Enter scale factor: ");
        int factor = scanner.nextInt();

        if (factor == 0) {
            System.out.println("Scale factor cannot be 0.");
            return;
        }

        System.out.print("Enter 1 to multiply or 0 to divide: ");
        int option = scanner.nextInt();
        boolean sign = option == 1;

        shapes.scale(factor, sign);
        System.out.println("All shapes scaled.");
    }
}
