/*(Use the Date class)
 * Write a program that creates a Date object, sets its elapsed time to
 * 10000, 100000, 1000000, 10000000, 100000000, 1000000000, 10000000000, 
 * and 100000000000, and displays the date and time using the toString()
 * method, respectively.
 */

/**
 *
 * @author Gringuitolokito
 */
public class TheDate {

    public static void main(String[] args) {
        long num = 10000;
        for (int i = 0; i < 8; i++) {
            
            java.util.Date date = new java.util.Date(num);
            
            num *= 10;
            
            System.out.println(date.toString() + "\n");
     
        }
    }
}
