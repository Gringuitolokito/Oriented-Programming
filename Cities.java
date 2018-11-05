import java.util.Scanner;
public class Cities {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //Ask user for the three cities
        System.out.print("Enter first city: ");
        String firstC = input.nextLine();

        System.out.print("Enter second city: ");
        String secC = input.nextLine();

        System.out.print("Enter third city: ");
        String thirdC = input.nextLine();

        if (firstC.compareTo(secC) > 0) {
            String swap = secC;
            secC = firstC;
            firstC = swap;
        }

        if (secC.compareTo(thirdC) > 0) {
            String swap = thirdC;
            thirdC = secC;
            secC = swap;

        }

        if (firstC.compareTo(secC) > 0) {
            String swap = secC;
            secC = firstC;
            firstC = swap;
        }
        System.out.println("Alpha order is " + firstC +
                " " + secC + " " + thirdC);
    }
}