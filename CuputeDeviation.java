/* (Statistics: compute deviation)
 * Programming Exercise 5.45 computes the standard deviation of numbers.
 * This exercise uses a different but equivalent formula to compute the 
 * standard deviation of n numbers.
 */

/**
 * Write a test program that prompts the user to enter ten numbers
 * and displays the mean and standard deviation,
 * as shown in the following sample run:
 * @author Gringuitolokito
 */
import java.util.Scanner;

public class CuputeDeviation {
    
    public static void main(String[] args){
        
        Scanner input = new Scanner(System.in);
        
        double[] numbers = new double[10];
        
        System.out.print("Enter ten numbers: ");
        
        for (int i = 0; i < 10; i++) 
            numbers[i] = input.nextDouble();
        
        System.out.printf("The mean is: %.2f", mean(numbers));
        
        System.out.printf("\nThe standard deviation is: %.5f\n", deviation(numbers));
    }
    
    /** Compute the deviation of double values */
    public static double deviation(double[] d) {
        
        double mean = mean(d);
        
        double squareSum = 0;

        for (int i = 0; i < d.length; i++) {
        
            squareSum += Math.pow(d[i] - mean, 2);
    }

        return Math.sqrt((squareSum) / (d.length - 1));
    }
    
    /** Compute the mean of an array of double values */ 
        public static double mean(double[] m){
        
            double sum = 0;

        for (int i = 0; i < m.length; i++){
        
            sum += m[i];
        }
        
        return sum / m.length;
        }
}
