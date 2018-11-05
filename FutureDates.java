import java.util.Scanner;

public class FutureDates {

    public static void main(String[] args) {
        //Create new Scanner
        Scanner input = new Scanner(System.in);

        //Ask user for day in numeric form
        System.out.print("Enter today's day: ");

        int day = input.nextInt();

        //Ask user for the days elapsed
        System.out.print("Enter the number of days elapsed since today: ");

        int elapsed = input.nextInt();

        //Add day and elapsed then find the remainder
        //this will give us the future day
        int future_date = (day + elapsed) % 7;

        //This variable will be assigned a day of the week
        //for now it will be assigned an empty string
        String day_of_week = "";

        //This If statement takes the user input and
        //matches it with the proper day.
        if (day == 0) {
            day_of_week = "Sunday";
        }
        else if (day == 1) {
            day_of_week = "Monday";
        }
        else if (day == 2) {
            day_of_week = "Tuesday";
        }
        else if (day == 3) {
            day_of_week = "Wednesday";
        }
        else if (day == 4) {
            day_of_week = "Thursday";
        }
        else if (day == 5) {
            day_of_week = "Friday";
        }
        else if (day == 6) {
            day_of_week = "Saturday";
        }
        //If the day is not one of the above then
        //an error message will be dispalyed and the program will quit.
        else if ( day >= 7 ) {
            System.out.println("Invalid day.\nTry again.");
            System.exit(0);
        }

        //If day is valid then the following If statement will run.
        //The remainder will be matched with an if If statement and display such message
        if (future_date == 0){
            System.out.println("Today is " + day_of_week +
                    " and the future day is Sunday.");
        }
        else if(future_date == 1){
            System.out.println("Today is " + day_of_week +
                    " and the future day is Monday.");
        }
        else if(future_date == 2){
            System.out.println("Today is " + day_of_week +
                    " and the future day is Tuesday.");
        }
        else if(future_date == 3){
            System.out.println("Today is " + day_of_week +
                    " and the future day is Wednesday.");
        }
        else if(future_date == 4){
            System.out.println("Today is " + day_of_week +
                    " and the future day is Thursday.");
        }
        else if(future_date == 5){
            System.out.print("Today is " + day_of_week +
                    " and the future day is Friday");
        }
        else if(future_date == 6) {
            System.out.print("Today is " + day_of_week +
                    " and the future day is Saturday");
        }
    }
}