/*(ArrayIndexOutOfBoundsException) 
 * Write a program that meets the following requirements: 
 * Creates an array with 100 randomly chosen integers. 
 * Prompts the user to enter the index of the array, 
 * then displays the corresponding element value. 
 * If the specified index is out of bounds, display the message Out of Bounds.
 */

/**
 *
 * @author Gringuitolokito
 */
import java.util.Scanner;

public class ArrayInOutOfBoundsEx {

//    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//
//        int[] ranArray = new int[100];
//
//        System.out.print("Enter desired index number: ");
//
//        int indexNum = input.nextInt();
//        try {
//            if (indexNum < 100 || 0 < indexNum) {
//
//                for (int i = 0; i < ranArray.length; i++) {
//                    ranArray[i] = (int) (Math.random() * 100);
//
//                }
//                System.out.print(ranArray[indexNum] + "\n");
//            }
//        } catch (ArrayIndexOutOfBoundsException ex) {
//            System.out.println("Try again. (Out of Bounds)");
//            input.nextLine(); // Discard input 
//        }
//    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean continueInput = true;
        int[] ranArray = new int[100];
       
        do {
            try {
                // Prompt the user for desired index
                System.out.print("Enter desired index number: ");
                
                // Record such desire
                int indexNum = input.nextInt();
                
               // If statement to check user input
                if (indexNum < 100 || 0 < indexNum) {
                    for (int i = 0; i < ranArray.length; i++) {
                        ranArray[i] = (int) (Math.random() * 100);
                    }
                    System.out.print(ranArray[indexNum] + "\n");   
                }
                 continueInput = false;
            } catch (ArrayIndexOutOfBoundsException ex) {
                
               System.out.println("Out of Bounds!");
               // Discard input 
               input.nextLine(); 
            }
        } while(continueInput);
    }
}
