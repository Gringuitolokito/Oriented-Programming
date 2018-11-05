
import java.text.DecimalFormat;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Gringuitolokito
 */
public class C2F {
        private static DecimalFormat df2 = new DecimalFormat(".##");
        
            public static void main(String[] args) {
                
            Scanner input = new Scanner(System.in);
            
            System.out.print("Enter a degree in Celsius: ");
            
            double celsius = input.nextDouble();
            
            // Convert Fahrenheit to Celsius 
            
            double fahrenheit = 1.8 * celsius + 32;
            
            System.out.println(celsius + " Celsius " + "is " +
                    
                     df2.format(fahrenheit) + " in Fahrenheit");

    } 
}
