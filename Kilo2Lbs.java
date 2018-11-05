public class Kilo2Lbs {
    public static void main(String[] args) {
        double kilo = 0;
        double pounds = 0;

        System.out.println("Kilograms   Pounds");

        for (kilo = 1; kilo <= 199; kilo++) {
            // Math for converting kilo's to lbs
            pounds = kilo * 2.20;
            // Display the product and align properly
            System.out.printf("%1.0f   %11.1f\n", kilo, pounds);
        }
    }
}