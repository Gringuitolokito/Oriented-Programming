import java.util.Scanner;

public class HexToBinary {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //Ask user for hex digit
        System.out.print("Enter a hex digit: ");
        //Store input
        String hexString = input.nextLine();

        //Check if the hex string has exactly one character
        //If it doesnt then display error message
        if (hexString.length() != 1) {
            System.out.println("You must enter exactly one character");
            System.exit(1);
        }

        //Display decimal value for the hex digit
        char ch = Character.toUpperCase(hexString.charAt(0));
        int value = 0;
        if (ch <= 'F' && ch >= 'A') {
            value = ch - 'A' + 10;
        } else if (Character.isDigit(ch)) {
            value = ch - '0';
        } else {
            System.out.println(ch + " is an invalid input");
            System.exit(0);
        }

        System.out.println("The decimal value for hex digit " + ch + " is "
                + Integer.toBinaryString(value));

    }
}