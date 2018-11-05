/* Write two overloaded methods that return the average of an array
 * Write a test program that prompts the user to enter ten double values,
 * invokes this method, and displays the average value.
 * @author Gringuitolokito
 */
import java.util.Scanner;

public class AngAnArray {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        double[] vals = new double[10];
        
        System.out.print("Enter ten double values: ");
        
        for (int i = 0; i < 10; i++) 
            vals[i] = input.nextDouble();
        
        System.out.printf("The average is: %.2f\n", average(vals));
    }
                   
    public static int average(int[] array){
        int sum = 0;
        for (int val : array)
            sum += val;
        return sum / array.length;
           
     }
     public static double average(double[] array) {
        double sum = 0.0;
        for (double val : array) 
            sum += val;
        return sum / array.length;
     }
}
