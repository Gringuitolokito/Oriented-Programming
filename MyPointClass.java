/*(The MyPoint class)
 * Design a class named MyPoint to represent a point with x- and y-coordinates.
 * The class contains: 
 * -The data fields x and y that represent the coordinates with getter methods.
 * -A no-arg constructor that creates a point (0, 0). 
 * -A constructor that constructs a point with specified coordinates.
 * -A method named distance that returns the distance from this point 
 * to a specified point of the MyPoint type.
 * -A method named distance that returns the distance from this point 
 * to another point with specified x- and y-coordinates. 
 * -----------------------------------------------------------------------------
 * Draw the UML diagram for the class and then implement the class.
 * Write a test program that creates the two points (0, 0) and (10, 30.5)
 * and displays the distance between them.
 */

 /*-------------------------------UML Diagram---------------------------------*/
 /*---------------------------------------------------------------------------*/
 /*-------------------------------MyPointClass--------------------------------*/
 /*-----------------------------UserPoint1:double-----------------------------*/
 /*-----------------------------UserPoint2:double-----------------------------*/
 /*---------------------------------UserInput---------------------------------*/
 /*---------------------------------MyPoint1()---------------------------------*/
 /*---------------------------------dX:double---------------------------------*/
 /*---------------------------------dY:double---------------------------------*/
 /*----------------------MyPoint(double newX, double newY)--------------------*/
 /*-------------------------------getdX:double--------------------------------*/
 /*--------------------------------setdX:void---------------------------------*/
 /*-------------------------------getdY:double--------------------------------*/
 /*--------------------------------setdY:void---------------------------------*/
 /*---------distance(double dX, double dY, double newX, double newY)----------*/
 /*--------------distence(double dX, double dY, MyPoint1 x)-------------------*/
 /*---------------------------------------------------------------------------*/
 /*-----------------------------mp1:MyPoint-x=0-y=0---------------------------*/
 /*---------------------------mp2:MyPoint-x=10-y=30.5-------------------------*/

import java.util.Scanner;

public class MyPointClass {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Default Points
        MyPoint1 dp = new MyPoint1();

        System.out.printf("The default points are %.1f and %.1f.\n", dp.dX, dp.dY);

        // Specified Points
        MyPoint1 p1 = new MyPoint1(10, 30.5);

        System.out.printf("A point with the specified coordinates are %.1f and %.1f.\n",
                p1.dX, p1.dY);

        // Get Two Points From User
        System.out.print("Enter two points: ");

        // Store Those POints
        double UserPoint1 = input.nextDouble();
        double UserPoint2 = input.nextDouble();

        // Create New Object And Pass UserInput
        MyPoint1 UserInput = new MyPoint1(UserPoint1, UserPoint2);

        // Display 
        System.out.printf("Distance from the default Point to the specified point is: %.2f\n",
                MyPoint1.distance(dp.getdX(), dp.getdY(), UserInput.getdX(), UserInput.getdY()));

        // Display 
        System.out.printf("Distance from the default Point to the specified point is: %.2f\n",
                MyPoint1.distance(dp.getdX(), dp.getdY(), UserInput));
    }

}

class MyPoint1 {

    double dX;
    double dY;

    // -A no-arg constructor that creates a point (0, 0). 
    MyPoint1() {
        dX = 0;
        dY = 0;
    }
    
    // -A constructor that constructs a point with specified coordinates.
    MyPoint1(double newX, double newY) {
        dX = newX;
        dY = newY;
    }

    public double getdX() {
        return dX;
    }

    public void setdX(double dX) {
        this.dX = dX;
    }

    public double getdY() {
        return dY;
    }

    public void setdY(double dY) {
        this.dY = dY;
    }

    public static double distance(double dX, double dY, double newX, double newY) {
        return Math.sqrt((newX - dX) * (newX - dX) + (newY - dY) * (newY - dY));
    }

    public static double distance(double dX, double dY, MyPoint1 x) {
        return Math.sqrt((x.getdX() - dX) * (x.getdX() - dX) + (x.getdY() - dY) * (x.getdY() - dY));
    }
}
