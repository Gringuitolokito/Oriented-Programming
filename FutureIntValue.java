
import java.util.Scanner;

/*Financial application:
* compute the future investment value
* Write a method that computes future investment value 
* at a given interest rate for a specified number of years. 
* The future investment is determined using the formula in Programming Exercise 2.21.
* Use the following method header:
* futureInvestmentValue(10000, 0.05/12, 5) returns 12833.59. 
* Write a test program that prompts the user to enter the investment amount (e.g., 1000) and 
* the interest rate (e.g., 9%) and prints a table that displays future value for the years from 1 to 30
* futureInvestmentValue = investmentAmount * (1 + monthlyInterestRate)numberOfYears*12
 */
public class FutureIntValue {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("The amount invested: ");
        double invested = input.nextDouble();

        System.out.print("Annual interest rate: ");
        double interest = input.nextDouble();

        interest = interest / 100;

        System.out.println("Years   Future Value");

        for (int i = 1; i < 31; i++) {
            double fv = futureInvestmentValue(invested, interest, i);
            System.out.printf("%-2d %17.2f\n", i, fv);
        }

    }

    public static double futureInvestmentValue(
            double investmentAmount, double InterestRate, int years) {

        double monthlyInterestRate = InterestRate / 12;

        double futureIV = investmentAmount * Math.pow(1 + monthlyInterestRate, years * 12);

        return futureIV;
    }

}
