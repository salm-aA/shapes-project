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
                    // TODO: ask which shape to add and collect the required values.
                    break;
                case 2:
                    // TODO: ask for position and remove a shape.
                    break;
                case 3:
                    // TODO: ask for position and display one shape.
                    break;
                case 4:
                    // TODO: ask for position and display area and perimeter.
                    break;
                case 5:
                    // TODO: display all shapes.
                    break;
                case 6:
                    // TODO: ask for dx and dy, then translate all shapes.
                    break;
                case 7:
                    // TODO: ask for factor and sign, then scale all shapes.
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
}
