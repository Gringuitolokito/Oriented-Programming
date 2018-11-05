/* (The Rectangle class) Following the example of the Circle class in Section 9.2,
 * design a class named Rectangle to represent a rectangle. The class contains:
 * ■ Two double data fields named width and height that specify the width and height 
 * of the rectangle. The default values are 1 for both width and height. 
 * ■ A no-arg constructor that creates a default rectangle. 
 * ■ A constructor that creates a rectangle with the specified width and height.
 * ■ A method named getArea() that returns the area of this rectangle. 
 * ■ A method named getPerimeter() that returns the perimeter. 
 *
 * Draw the UML diagram for the class and then implement the class. 
 * Write a test program that creates two Rectangle objects—
 * one with width 4 and height 40 and the other with width 3.5 and height 35.9. 
 * Display the width, height, area, and perimeter of each rectangle in this order.
 *
 * @author Gringuitolokito
 */


/*--------------------------------UML Diagram---------------------------------*/
/*----------------------------------------------------------------------------*/
/*---------------------------------Rectangle----------------------------------*/
/*--------------------------------width:double--------------------------------*/
/*-------------------------------height:double--------------------------------*/
/*--------------------------------Rectangle()---------------------------------*/
/*-----------------Rectangle(double newWidth, double newHeight)---------------*/
/*------------------------------getArea():double------------------------------*/
/*---------------------------getPerimeter():double----------------------------*/
/*----------------------------------------------------------------------------*/
/*----------------------r1:Rectangle-width=4-hieght=40------------------------*/
/*--------------------r2:Rectangle-width=3.5-hieght=35.9----------------------*/

public class RectangleClass {
    
    /* Main method*/
    public static void main(String[] args) {
        // Create a Rectangle with a width and a hieght  of 1
        Rectangle dr = new Rectangle();
        System.out.println("The default width of the Rectangle is "
                + dr.width + " with the default hieght of " + dr.height);
       
        // Create a Rectangle with a width of 4 and a hieght of 40
        // Also get area and parimeter of the rectangle
        Rectangle r1 = new Rectangle(4, 40);
        System.out.println("\nA Rectangle with a width of "
                + r1.width + " and a hieght of " 
                + r1.height + " has an area of " + r1.getArea() 
                + " and has a perimeter of " + r1.getPerimeter());
        
        // Create a Rectangle with a width of 3.5 and a hieght of 35.9
        // Also get area and parimeter of the rectangle
        Rectangle r2 = new Rectangle(3.5, 35.9);
        System.out.printf("\nA Rectangle with a width of "
                + r2.width + " and a hieght of " 
                + r2.height + " has an area of %.1f" 
                + " and has a perimeter of " + r2.getPerimeter() 
                + "\n", r2.getArea());
        // Test to see if it is working properly
        Rectangle test = new Rectangle();
        System.out.printf("\nA Rectangle with a width of "
                + test.width + " and a hieght of " 
                + test.height + " has an area of %.1f" 
                + " and has a perimeter of " + test.getPerimeter() 
                + "\n", test.getArea());
    }
}
// Define the circle class with two constructors

class Rectangle {

    double width;
    double height;

    /**
     * Construct a rectangle with the default width and height of 1
     */
    Rectangle() {
        width = 1;
        height = 1;
    }

    /**
     * Construct a circle with a specified radius
     */
    Rectangle(double newWidth, double newHeight) {
        width = newWidth;
        height = newHeight;
    }

    /**
     * Return the area of this circle
     */
    double getArea() {
        return height * width;
    }

    /**
     * Return the perimeter of this circle
     */
    double getPerimeter() {
        return 2 *(height + width);
    }
}
