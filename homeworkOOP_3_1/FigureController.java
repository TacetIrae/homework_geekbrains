import java.util.*;

public class FigureController {
    private List<Figure> figures = new ArrayList<>();


    public void starting() {
        Scanner scanner = new Scanner(System.in);
        boolean quit = false;
        while (!quit) {
            System.out.println("Select an option:");
            System.out.println("1. Add new figure");
            System.out.println("2. Calculate perimeter of a figure");
            System.out.println("3. Calculate area of a figure");
            System.out.println("4. Display all perimeters, areas, and circumferences");
            System.out.println("5. Remove a figure");
            System.out.println("6. Change figure parameters using index");
            System.out.println("7. Sort figures by area");
            System.out.println("8. Display all figures");
            System.out.println("9. Quit");
            int option = scanner.nextInt();
            switch (option) {
                case 1:
                    addFigure(scanner);
                    break;
                case 2:
                    calculatePerimeter(scanner);
                    break;
                case 3:
                    calculateArea(scanner);
                    break;
                case 4:
                    displayAllMeasurements();
                    break;
                case 5:
                    removeFigure(scanner);
                    break;
                case 6:
                    changeFigure(scanner);
                    break;
                case 7:
                    sortFigures();
                    break;
                case 8:
                    displayFigures();
                    break;
                case 9:
                    quit = true;
                    break;
                default:
                    System.out.println("Invalid option");
                    break;
            }
        }
    }

    private void addFigure(Scanner scanner) {
        System.out.println("Select a figure to add:");
        System.out.println("1. Triangle");
        System.out.println("2. Square");
        System.out.println("3. Rectangle");
        System.out.println("4. Circle");
        int option = scanner.nextInt();
        switch (option) {
            case 1:
                System.out.println("Enter side lengths for the triangle:");
                double a = scanner.nextDouble();
                double b = scanner.nextDouble();
                double c = scanner.nextDouble();
                try {
                    figures.add(new Triangle(a, b, c));
                } catch (IllegalArgumentException e) {
                    System.out.println(e.getMessage());
                }
                break;
            case 2:
                System.out.println("Enter side length for the square:");
                double side = scanner.nextDouble();
                try {
                    figures.add(new Square(side));
                } catch (IllegalArgumentException e) {
                    System.out.println(e.getMessage());
                }
                break;
            case 3:
                System.out.println("Enter length and width for the rectangle:");
                double length = scanner.nextDouble();
                double width = scanner.nextDouble();
                try {
                    figures.add(new Rectangle(length, width));
                } catch (IllegalArgumentException e) {
                    System.out.println(e.getMessage());
                }
                break;
            case 4:
                System.out.println("Enter radius for the circle:");
                double radius = scanner.nextDouble();
                try {
                    figures.add(new Circle(radius));
                } catch (IllegalArgumentException e) {
                    System.out.println(e.getMessage());
                }
                break;
            default:
                System.out.println("Invalid option");
                break;
        }
    }

    private void calculateArea(Scanner scanner) {
        System.out.println("Enter the index of the figure to calculate its area:");
        int index = scanner.nextInt();

        if (index >= 0 && index < figures.size()) {
            Figure figure = figures.get(index);
            double area = figure.getArea();
            System.out.println("The area of the figure is: " + area);
        } else {
            System.out.println("Invalid index, please try again.");
        }
    }

    private void calculatePerimeter(Scanner scanner) {
        System.out.println("Enter the index of the figure to calculate its perimeter:");
        int index = scanner.nextInt();

        if (index >= 0 && index < figures.size()) {
            Figure figure = figures.get(index);
            double perimeter = figure.getPerimeter();
            System.out.println("The perimeter of the figure is: " + perimeter);
        } else {
            System.out.println("Invalid index, please try again.");
        }
    }

    private void displayAllMeasurements() {
        System.out.println("All figures' measurements:");
        for (int i = 0; i < figures.size(); i++) {
            Figure figure = figures.get(i);
            System.out.println("Figure " + i + ":");
            System.out.println("Type: " + figure.getClass().getSimpleName());
            System.out.println("Perimeter: " + figure.getPerimeter());
            System.out.println("Area: " + figure.getArea());

            if (figure instanceof Circle) {
                Circle circle = (Circle) figure;
                System.out.println("Circumference: " + circle.calculateCircumference());
            }
            System.out.println();
        }
    }

    private void removeFigure(Scanner scanner) {
        System.out.println("Enter the index of the figure to remove:");
        int index = scanner.nextInt();

        if (index >= 0 && index < figures.size()) {
            Figure figure = figures.get(index);
            figures.remove(index);
            System.out.println("Figure removed successfully!");
        } else {
            System.out.println("Invalid index, please try again.");
        }
    }

    private void changeFigure(Scanner scanner) {
        System.out.println("Enter the index of the figure to change:");
        int index = scanner.nextInt();

        if (index >= 0 && index < figures.size()) {
            Figure figure = figures.get(index);

            if (figure instanceof Triangle) {
                System.out.println("Enter the new lengths of the sides of the triangle:");
                double side1 = scanner.nextDouble();
                double side2 = scanner.nextDouble();
                double side3 = scanner.nextDouble();

                try {
                    Triangle triangle = new Triangle(side1, side2, side3);
                    figures.set(index, triangle);
                    System.out.println("Triangle updated successfully!");
                } catch (IllegalArgumentException e) {
                    System.out.println(e.getMessage());
                }
            } else if (figure instanceof Square) {
                System.out.println("Enter the new length of the side of the square:");
                double side = scanner.nextDouble();

                try {
                    Square square = new Square(side);
                    figures.set(index, square);
                    System.out.println("Square updated successfully!");
                } catch (IllegalArgumentException e) {
                    System.out.println(e.getMessage());
                }
            } else if (figure instanceof Rectangle) {
                System.out.println("Enter the new lengths of the sides of the rectangle:");
                double side1 = scanner.nextDouble();
                double side2 = scanner.nextDouble();

                try {
                    Rectangle rectangle = new Rectangle(side1, side2);
                    figures.set(index, rectangle);
                    System.out.println("Rectangle updated successfully!");
                } catch (IllegalArgumentException e) {
                    System.out.println(e.getMessage());
                }
            }
        }
    }


    public void sortFigures() {
        Collections.sort(figures, new Comparator<Figure>() {
            @Override
            public int compare(Figure f1, Figure f2) {
                if (f1.getArea() > f2.getArea()) {
                    return 1;
                } else if (f1.getArea() < f2.getArea()) {
                    return -1;
                } else {
                    return 0;
                }
            }
        });
    }

    public void displayFigures() {
        System.out.println("List of figures:");
        System.out.println("-------------------------------");
        for (Figure figure : figures) {
            String output = String.format("%s\nArea: %.2f\nPerimeter: %.2f\n",
                    figure.toString(), figure.getArea(), figure.getPerimeter());
            System.out.println(output);
        }
        System.out.println("-------------------------------");
    }
}