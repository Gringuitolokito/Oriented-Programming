
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
public class C2FAndF2C {
    public static void main(String[] args){
//    Scanner input = new Scanner(System.in);
//    
//    System.out.print("Enter a degree in Celsius: ");
//    double cel = input.nextDouble();
//    
//    System.out.print("Enter a degree in Fahrenheit: ");
//    double fah = input.nextDouble();
        System.out.print("Celsius       Fahrenheit  |   Fahrenheit      Celsius");
        System.out.print("\n¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯");
        
       for (double c = 40.0, f = 120.0; 
			  c >= 31.0; c--, f -= 10) {
           double c2f = celsiusToFahrenheit(c);
           double f2c = fahrenheitToCelsius(f);
           System.out.printf("\n%-2.0f %9.1f       |  %7.1f %13.2f ", c, c2f, f, f2c);
            
        }
    
    
    }
    /** Convert from Celsius to Fahrenheit */
    public static double celsiusToFahrenheit(double celsius){
        double fahrenheit = 1.8 * celsius + 32;
        return fahrenheit;
    }
    
    /** Convert from Fahrenheit to Celsius */ 
    public static double fahrenheitToCelsius(double fahrenheit){
        double celsius = (5.0 / 9) * (fahrenheit - 32);
        return celsius;
    }

}
