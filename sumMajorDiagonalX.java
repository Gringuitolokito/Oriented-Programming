
/**
 * (Sum the major diagonal in a matrix) Write a method that sums all the numbers
 * in the major diagonal in an n * n matrix of double values using the following
 * header: public static double sumMajorDiagonal(double[][] m) Write a test
 * program that reads a 4-by-4 matrix and displays the sum of all its elements
 * on the major diagonal.
 *
 * Enter a 4-by-4 matrix row by row:
 * 1 2 3 4.0
 * 5 6.5 7 8
 * 9 10 11 12
 * 13 14 15 16
 * Sum of the elements in the major diagonal is 34.5
 *
 * @author Gringuitolokito
 */
import java.util.Scanner;

public class sumMajorDiagonalX {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double[][] forbyfor = new double[4][4];

        System.out.println("Enter a " + forbyfor.length + "-by-"
                + forbyfor[0].length + " matrix row by row:\n");

        for (int row = 0; row < forbyfor.length; row++) {
            for (int column = 0; column < forbyfor[row].length; column++) {
                forbyfor[row][column] = input.nextDouble();
            }
        }

//        double numberOfPoints = input.nextDouble();
        System.out.println("Sum of the elements in the major diagonal is " + sumMajorDiagonal(forbyfor));

    }

    public static double sumMajorDiagonal(double[][] m) {
        double sum = 0;

        for (int i = 0; i < 4; i++) {
            sum += m[i][i];

        }
        return sum;
    }

}
