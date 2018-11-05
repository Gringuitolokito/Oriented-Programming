
import java.util.Scanner;
import java.lang.Math.*;
import java.text.DecimalFormat;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Gringuitolokito
 */
public class ComputeVolOfCylinder {
         private static DecimalFormat df4 = new DecimalFormat(".####");
         private static DecimalFormat df1 = new DecimalFormat(".#");
        public static void main(String[] args) {
            
        // Create a Scanner object 
        Scanner input = new Scanner(System.in);
        
        // Prompt the user to enter a radius
        System.out.print("Enter the radius and length of a cylinder: ");
        double radius = input.nextDouble();
        double length = input.nextDouble();
        
        // Compute area 
        double area = radius * radius * Math.PI;
        double volume = area * length;
        
        // Display results
        System.out.println("The area is " + df4.format(area));
        System.out.println("The volume is " + df1.format(volume));
        }
    }

