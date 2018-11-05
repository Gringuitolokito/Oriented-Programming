/*
 * -Draw the UML diagrams for the classes Triangle and GeometricObject
 * -and implement the classes. 
 * -Write a test program that prompts the user to enter three sides of the triangle,
 * -a color, and a Boolean value to indicate whether the triangle is filled.
 * -The program should create a Triangle object with these sides and 
 * -set the color and filled properties using the input. 
 * -The program should display the area, perimeter, color,
 * -and true or false to indicate whether it is filled or not.
 */

/**
 *
 * @author Gringuitolokito
 */

import java.util.Scanner;

public class TestTriangle {

    public static void main(String[] args) {
        // Default
        Triangle df = new Triangle();

        System.out.printf("The default sides of the %s.\n", df.toString());
        
        Scanner input = new Scanner(System.in);
        
        // Get new sides of triangle from user input
        System.out.print("Please enter 3 sides for the triangle: ");
        // Store those inputs 
        double nSide1 = input.nextDouble();
        double nSide2 = input.nextDouble();
        double nSide3 = input.nextDouble();
        
        // Get color of the triangle from user
        System.out.print("Please enter triangle color: ");
        String color = input.next();
        // Get if triangle is filled or not from user
        System.out.print("Is the triangle filled? (1 = Yes, 0 = No) ");
        int filled = input.nextInt();
        
        // Convert string into boolean
        // First declare a boolean
        Boolean isFilled;
        
        // The if statement will set the boolean value
        if (filled == 1)
            isFilled = true;
        else 
            isFilled = false;
        
        // Declare a new object and pass all values to it.
         Triangle triangle = new Triangle(nSide1, nSide2, nSide3, color, isFilled); 
         
         // Display the new sides of the triangle
         System.out.printf("The new sides of the %s \n", 
                 triangle.toString());
         // Display the area of the triangle
         System.out.printf("The area of the triangle is %.1f sq units.\n", 
                 triangle.getArea());
         // Display the perimeter of the triangle 
         System.out.printf("The perimeter of the triangle is %.1f.\n", 
                 triangle.getPerimeter());
         System.out.printf("The color of the triangle is %s and its filled status"
                 + " is %s.\n",triangle.getColor(), isFilled);
    }
}
