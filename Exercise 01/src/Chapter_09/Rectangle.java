package Chapter_09;

/**
 * Chapter 9 Exercise 01:
 *
 *      (The Rectangle class) Following the example of the Circle class in Section 9.2,
 *      design a class named Rectangle to represent a rectangle. The class contains:
 *
 *               Two double data fields named width and height that specify the width
 *                 and height of the rectangle. The default values are 1 for both width and height.
 *               A no-arg constructor that creates a default rectangle.
 *               A constructor that creates a rectangle with the specified width and height.
 *               A method named getArea() that returns the area of this rectangle.
 *               A method named getPerimeter() that returns the perimeter.
 *
 * Niels Bo Dissing, 26.09.2017.
 */
    public class Rectangle {
    // Declare the variables
    double width;
    double height;
    // Initializes the variables
    public Rectangle() {
        width = 1;
        height = 1;
            }

    // A constructor makes it possible to define width and height.
    Rectangle(double newWidth, double newHeight) {
        width = newWidth;
        height = newHeight;
    }

    //Calculate area
    double getArea() {
        return width * height;
    }
    // Calculate perimeter
    double getPerimeter() {
        return 2 * (width + height);
    }

    public static void main(String[] args) {
    //Rectangle width with 4 and height 40.
        Rectangle rectangle1 = new Rectangle(4, 40);
    //Rectangle width with 3.5 and height 35.9.
        Rectangle rectangle2 = new Rectangle(3.5, 35.9);

    // Displays width, height, area and perimeter of rectangle1:
        System.out.println("\nRectangle 1");
        System.out.print("-----------");
        System.out.println("\nWidth:      " + rectangle1.width);
        System.out.println("Height:    " + rectangle1.height);
        System.out.println("Area:     " + rectangle1.getArea());
        System.out.println("Perimeter: " + rectangle1.getPerimeter());

        // Displays width, height, area and perimeter of rectangle2:
        System.out.println("\nRectangle 2");
        System.out.print("-----------");
        System.out.println("\nWidth:      " + rectangle2.width);
        System.out.println("Height:    " + rectangle2.height);
        System.out.println("Area:     " + rectangle2.getArea());
        System.out.println("Perimeter: " + rectangle2.getPerimeter());

        }
    }