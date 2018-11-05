
/*(InputMismatchException)
 * Write a program that prompts the user to read two integers and displays their sum. 
 * Your program should prompt the user to read the number again if the input is incorrect.
 */

/**
 *
 * @author Gringuitolokito
 */
import java.util.Scanner;
import java.util.InputMismatchException;

public class InputMismatch {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean continueInput = true;

        do {
            try {
                // Prompt the user for two integers
                System.out.print("Enter two integers: ");
                int number1 = input.nextInt();
                int number2 = input.nextInt();
                continueInput = false;
                // Display the result
                System.out.println("The sum of the two integers are "
                 + (number1 + number2));
                
            } catch (InputMismatchException ex) {
                System.out.println("Try again. ("
                        + "Incorrect input: an integer is required)");
                input.nextLine(); // Discard input 
            }
        } while (continueInput);
    }
}
