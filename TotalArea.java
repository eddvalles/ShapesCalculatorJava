import java.util.Scanner;
import java.util.InputMismatchException;

public class TotalArea {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] validShapes = {"Triangle", "Circle", "Rectangle"};

        System.out.print("How many shapes will you enter ? ");
        int numShapes = input.nextInt();
        System.out.println();

        input.nextLine();

        Shape[] myShapes = new Shape[numShapes];

        for (int i = 0; i < myShapes.length; i++) {
            while (true) {
                System.out.print("What shape is this? (Triangle, Circle, Rectangle): ");
                String shapeType = input.nextLine();

                // Iterates through known valid shapes to confirm that it exists
                boolean validShape = false;
                for (int j = 0; j < validShapes.length; j++) {
                    if (shapeType.equals(validShapes[j])) {
                        validShape = true;
                    }
                }

                if (validShape) { // If the user provided a valid shape, collect the shape
                    if (shapeType.equals("Triangle")) { // Creates a valid object of type Triangle
                        Triangle myTriangle;
                        while (true) {
                            try {
                                System.out.print("Please enter length of side one: ");
                                double a = input.nextDouble();

                                System.out.print("Please enter length of side two: ");
                                double b = input.nextDouble();

                                System.out.print("Please enter length of side three: ");
                                double c = input.nextDouble();

                                if ((a + b > c) && (b + c > a) && (a + c > a)) { // validates triangle sides
                                    // object creation happens here
                                    myTriangle = new Triangle(a, b, c);
                                    break; // breaks out of while True loop after receiving valid triangle sides
                                }
                                else { // If invalid triangle sides given
                                    System.out.println("The three sides do not create a triangle!\nPlease try again.");
                                }
                            }
                            catch (InputMismatchException inputMismatchException) {
                                input.nextLine(); // discard input so user can try again
                                System.out.printf("You must enter numbers. Please try again.%n%n");
                            }
                        }
                        // Validated object is then placed into the Shapes array
                        myShapes[i] = myTriangle;
                    }
                    if (shapeType.equals("Rectangle")) { // Creates a valid object of type Rectangle
                        Rectangle myRectangle;
                        while (true) {
                            try {
                                System.out.print("Please enter the length: ");
                                double length = input.nextDouble();

                                System.out.print("Please enter the width: ");
                                double width = input.nextDouble();

                                myRectangle = new Rectangle(length, width);

                                break;
                            }
                            catch (InputMismatchException inputMismatchException) {
                                input.nextLine();
                                System.out.printf("You must enter numbers. Please try again.%n%n");
                            }
                        }
                        // Validated object is then placed into the Shapes array
                        myShapes[i] = myRectangle;
                    }
                    if (shapeType.equals("Circle")) { // Creates a valid object of type Circle
                        Circle myCircle;
                        while (true) {
                            try {
                                System.out.print("Please enter the radius: ");
                                double radius = input.nextDouble();

                                myCircle = new Circle(radius);

                                break;
                            }
                            catch (InputMismatchException inputMismatchException) {
                                input.nextLine(); // discard input so user can try again
                                System.out.printf("You must enter numbers. Please try again.%n%n");
                            }
                        }
                        // Validated object is then placed into the Shapes array
                        myShapes[i] = myCircle;
                    }
                    input.nextLine(); // Will eat any left over new line at the end of each object creation
                    break; // Will allow continuation into the next iteration after valid shape is input into myShapes
                }
                else { // If the user put in an invalid shape
                    System.out.println("Sorry, please enter a valid shape.");
                }
            }
        }

        // Outputs the perimeter and area of each shape in the myShapes array
        System.out.println("________________________________________________________________________________________");
        for (int i = 0; i < myShapes.length; i++) {
            // Calculate the shape perimeter and area so that it gets stored in the Shape perimeter and area attributes
            myShapes[i].calculatePerimeter();
            myShapes[i].calculateArea();

            // Will determine the proper shape name using the ternary operator
            String shape = myShapes[i] instanceof Triangle ? "Triangle" :
                    myShapes[i] instanceof Rectangle ? "Rectangle" :
                            myShapes[i] instanceof Circle ? "Circle": null;

            System.out.printf("The perimeter of %s is: %.2f%n", shape, myShapes[i].getShapePerimeter());
            System.out.printf("The area of %s is: %.2f%n%n", shape, myShapes[i].getShapeArea());
        }
    }
}
