
import java.util.Scanner;

/*(Algebra: add two matrices) Write a method to add two matrices. The header
 * of the method is as follows:
 * public static double[][] addMatrix(double[][] a, double[][] b)
 * @author Gringuitolokito
 */
public class AddTwoMatrices {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double[][] m1 = new double[3][3];
        double[][] m2 = new double[3][3];

        System.out.println("You will enter two 3 * 3 matrices\n ");

        System.out.print("Enter matrix1: ");

        for (int row = 0; row < m1.length; row++) {
            for (int column = 0; column < m1[row].length; column++) {
                m1[row][column] = input.nextDouble();
            }
        }

        System.out.print("Enter matrix2: ");

        for (int row = 0; row < m2.length; row++) {
            for (int column = 0; column < m2[row].length; column++) {
                m2[row][column] = input.nextDouble();
            }
        }
        double[][] sum = addMatrix(m1, m2);
        System.out.println("The matricies added are as follows: ");

        for (int i = 0; i < m1.length; i++) {
            System.out.printf("%.1f %.1f %.1f  %s  %.1f %.1f %.1f  %s  %.1f %.1f %.1f%n",
                    m1[i][0], m1[i][1], m1[i][2],
                    i == 1 ? "+" : " ",
                    m2[i][0], m2[i][1], m2[i][2],
                    i == 1 ? "=" : " ",
                    sum[i][0], sum[i][1], sum[i][2]);
        }

    }

    public static double[][] addMatrix(double[][] a, double[][] b) {
        double[][] c = new double[a.length][a.length];
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                c[i][j] = a[i][j] + b[i][j];
            }
        }
        return c;
    }

}
