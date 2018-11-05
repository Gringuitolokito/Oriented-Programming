/*(Find numbers divisible by 5 and 6)
 Write a program that displays all the numbers from 100 to 1,000, ten per line,
 that are divisible by 5 and 6.
 Numbers are separated by exactly one space.
*/
public class  FiveAndSixDivList {
    public static void main(String[] args) {
        int dn = 100;
        int numCount = 0;
        while (dn <= 1000 && dn >= 100) {
             if (dn % 5 == 0 && dn % 6 == 0){
                System.out.printf("%1d ", dn);
                numCount++;
                if(numCount % 10 == 0)
                System.out.print("\n");
            }
            dn++;
        }
    }
}