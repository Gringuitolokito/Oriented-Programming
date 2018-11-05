
import java.util.Scanner;
import java.lang.Math.*;
//import java.text.DecimalFormat;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Gringuitolokito
 */
public class Gratuity {
         //private static DecimalFormat df4 = new DecimalFormat(".####");
         //private static DecimalFormat df1 = new DecimalFormat(".#");
        public static void main(String[] args) {
            
        // Create a Scanner object 
        Scanner input = new Scanner(System.in);
        
        // Prompt the user to enter the subtotal and gratuity
        System.out.print("Enter the subtotal and a gratuity rate: ");
        double subtotal = input.nextDouble();
        double gratuity = input.nextDouble()  / 100;
        
        //
        double gratuityRate = gratuity * subtotal;
        double total = gratuityRate + subtotal;
        
        // Display results
        System.out.println("The gratuity is $" + gratuityRate + 
                " and the total is $" + total );
        }
    }
