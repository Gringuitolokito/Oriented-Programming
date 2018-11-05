/* (The Triangle class)
 * -Design a class named Triangle that extends GeometricObject. 
 * The class contains: 
 * -Three double data fields named side1, side2, and side3 
 * -with default values 1.0 to denote three sides of the triangle. 
 * -A no-arg constructor that creates a default triangle. 
 * -A constructor that creates a triangle with the specified 
 * -side1, side2, and side3. 
 * The accessor methods for all three data fields. 
 * -A method named getArea() that returns the area of this triangle.
 * -A method named getPerimeter() that returns the perimeter of this triangle. 
 * -A method named toString() that returns a string description for the triangle.
 *******************************************************************************
 * For the formula to compute the area of a triangle, 
 * see Programming Exercise 2.19. 
 * The toString() method is implemented as follows: 
 * return "Triangle: side1 = " + side1 + " side2 = " + side2 +
 * " side3 = " + side3; 
 *******************************************************************************
 */

/**
 *
 * @author Gringuitolokito
 */

 /*---------------------------------Triangle-----------------------------------*/
 /*-------------------------------side1:double---------------------------------*/
 /*-------------------------------side2:double---------------------------------*/
 /*-------------------------------side3:double---------------------------------*/
 /*--------Triangle(double newSide1, double newSide2, double newSide3)---------*/
 /*Triangle(double side1,double side2,double side3,String color,boolean filled)*/
 /*------------------------------getArea():double------------------------------*/
 /*---------------------------getPerimeter(): double---------------------------*/
 /*-----------------------------toString():string------------------------------*/
 /*----------------------------------------------------------------------------*/

public class Triangle
        extends GeometricObject {

    public double side1;
    public double side2;
    public double side3;
    
    // -A no-arg constructor that creates 3 sides, all defaulted to 1. 
    public Triangle() {
        side1 = 1;
        side2 = 1;
        side3 = 1;
    }
    
    // -A constructor that constructs a point with specified sides.
    public Triangle(double side1, double side2, double side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side1 = side3;
    }

    public Triangle(double side1, double side2, double side3, String color, boolean filled) {
        
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
        
        setColor(color);
        setFilled(filled);
    }

     // A method named getArea() that returns the area of this triangle.
    public double getArea() {
        double allSides  = (side1 + side2 + side3 )/ 2 ;
        double area = Math.sqrt(allSides * (allSides - side1) * 
                (allSides - side2) * (allSides - side3));
        return area;
    }
    
    // A method named getPerimeter() that returns the perimeter of this triangle. 
    public double getPerimeter() {
        return (side1 + side2 + side3);
    }
    
    // A method named toString() that returns a string description for the triangle.
    public String toString() {
        
    return "Triangle are: side1 = " + side1 + " side2 = " + side2 +
    " side3 = " + side3; 
    
    }
    
}

