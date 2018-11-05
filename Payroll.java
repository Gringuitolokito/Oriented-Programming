import java.io.InputStream;
import java.util.Scanner;


public class Payroll {

    //This is to output 2 decimal places on selected outputs
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //Ask for employee name
        System.out.print("Enter employee\'s name: ");
        String name = input.nextLine();

        //Ask for number of hours worked
        System.out.print("Enter number of hours worked in a week: ");
        double hoursWorked = input.nextDouble();

        //Ask for hourly pay
        System.out.print("Enter hourly pay rate: ");
        double hourlyPay = input.nextDouble();

        //Ask for Fed tx withholding
        System.out.print("Enter federal tax withholding rate: ");
        double fedTax = input.nextDouble();

        //Ask for State tsx withholding
        System.out.print("Enter state tax withholding rate: ");
        double stateTax = input.nextDouble();

        //This will create space between the information that was entered
        //and the information that will be displayed
        System.out.println("\n");

        //Display employee name, hours worked, and pay rate
        System.out.println("Employee Name: " + name);
        System.out.println("Hours Worked: " + hoursWorked);
        System.out.println("Pay rate: $" + hourlyPay);

        //Calculate Gross pay
        double hoursPay = hoursWorked * hourlyPay;
        System.out.printf("Gross pay: $ %.2f", hoursPay);

        //This is for the percentages to be displayed
        double fedWH = fedTax * 100;
        double stateWH = stateTax * 100;

        //Calculate Fed and State w.h amount
        double fedwhamount = hoursPay * fedTax;
        double statewhamount = hoursPay * stateTax;

        //Calculate take home income
        double totalD = fedwhamount + statewhamount;

        System.out.printf("\nDeductions:");

        System.out.printf("\n\tFederal Withholding (%.1f%%): $%.2f", fedWH, fedwhamount);

        System.out.printf("\n\tState Withholding: (%.1f%%): $%.2f", stateWH, statewhamount);

        System.out.printf("\n\tTotal Deduction: $%.2f", totalD);

        double netPay = hoursPay - (fedwhamount + statewhamount);
        System.out.printf("\n\tNet Pay: $%.2f", netPay);
    }
}
