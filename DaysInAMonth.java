

        //(Find the number of days in a month) Write a program that prompts
        //the user to enter the month and year and displays the
        //number of days in the month. For example, if the user
        //entered month 2 and year 2012, the program should display
        //that February 2012 had 29 days. If the user entered month
        //3 and year 2015, the program should display that March 2015 had 31 days.

        //Sections 3.8–3.16

        import java.util.Scanner;

        public class DaysInAMonth {

            public static void main(String[] args) {

            Scanner input = new Scanner(System.in);

            //Prompt the user for Day and Month

            System.out.print("Please enter the Day and Year in numeric form: ");

            int day = input.nextInt();

            int year = input.nextInt();

            // Check if the year is a leap year
                boolean isLeapYear =
                        (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);

            if (isLeapYear == true && day == 2)
                System.out.print("Febuary " + year + " has 29 days.");
            else if (isLeapYear == false && year == 2)
                System.out.print("Febuary " + year + " has 28 days.");
            else if (day == 1)
                System.out.print("January " + year + " has 31 days.");
            else if (day == 3)
                System.out.print("March " + year + " has 31 days.");
            else if (day == 4)
                System.out.print("April " + year + " has 30 days.");
            else if (day == 5)
                System.out.print("May " + year + " has 31 days.");
            else if (day == 6)
                System.out.print("June " + year + " has 30 days.");
            else if (day == 7)
                System.out.print("July " + year + " has 31 days.");
            else if (day == 8)
                System.out.print("August " + year + " has 31 days.");
            else if (day == 9)
                System.out.print("September " + year + " has 30 days.");
            else if (day == 10)
                System.out.print("October " + year + " has 31 days.");
            else if (day == 11)
                System.out.print("November " + year + " has 30 days.");
            else if (day == 12)
                System.out.print("December " + year + " has 31 days.");
            else
                System.out.print("Error! Invalid day or year. Try again.");
            }
        }