/* (The ComparableCircle class) 
 * Define a class named ComparableCircle 
 * that extends Circle and implements Comparable. 
 ************************************************
 * Draw the UML diagram and implement the compareTo
 * method to compare the circles on the basis of area.
 * Write a test class to find the larger of two instances
 * of ComparableCircle objects.
 */

/**
 *
 * @author gringuitolokito
 */

 /*--------------------------------UML Diagram---------------------------------*/
 /*----------------------------------------------------------------------------*/
 /*----------------------------TestComparableCircle----------------------------*/
 /*-----------------------------ComparableCircle c1----------------------------*/
 /*-----------------------------ComparableCircle c2----------------------------*/
 /*----------------------------------setRadius---------------------------------*/
 /*-------------------------------ComparableCircle-----------------------------*/
 /*-----------------------compareTo(ComparableCircle o)------------------------*/
 /*-----------------------------------getArea----------------------------------*/
 /*------------------------------------Circle----------------------------------*/
 /*----------------------------------------------------------------------------*/

public class TestCompareableCircle {

    public static void main(String[] args) {
        // Create First 
        ComparableCircle c1 = new ComparableCircle();
        c1.setRadius(12);
        ComparableCircle c2 = new ComparableCircle(); // creating second
        // instance
        c2.setRadius(20);

        // result
        System.out.print("The larger of two circles is: ");
        if (c1.compareTo(c2) == 1) {
            System.out.println("Circle 1");
        } else if (c1.compareTo(c2) == -1) {
            System.out.println("Circle 2");
        } else if (c1.compareTo(c2) == 0) {
            System.out.println("They are equal!");
        }

    }

}

class ComparableCircle 
        extends Circle implements Comparable<ComparableCircle> {
    // default constructor that sets radius to 1

    public ComparableCircle() {
        super(1);
    }

    // constructor that creates object with set radius
    public ComparableCircle(double radius) {
        super(radius);
    }

    // overriden compareTO method
    @Override
    public int compareTo(ComparableCircle o) {
        if (this.getArea() > o.getArea()) {
            return 1;
        } else if (this.getArea() < o.getArea()) {
            return -1;
        } else {
            return 0;
        }
    }
}

/**
 * Class circle that contains radius data field and methods related to circle
 */
class Circle {

    double radius;

    /**
     * Construct a circle with radius 1
     */
    Circle() {
        radius = 1;
    }

    /**
     * Construct a circle with a specified radius
     */
    Circle(double newRadius) {
        radius = newRadius;
    }

    /**
     * Return the area of this circle
     */
    double getArea() {
        return radius * radius * Math.PI;
    }

    /**
     * Return the perimeter of this circle
     */
    double getPerimeter() {
        return 2 * radius * Math.PI;
    }

    /**
     * Set a new radius for this circle
     */
    void setRadius(double newRadius) {
        radius = newRadius;
    }
}
