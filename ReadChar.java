import java.util.Scanner;
public class ReadChar {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a character: ");
        String s = input.nextLine();
        //Whatever number is placed in the paratnthesis
        //will be the charecter that appers.
        //char ch = s.charAt(0);
        System.out.println("The character entered is " + s);
    }
}