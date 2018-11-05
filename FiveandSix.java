/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Gringuitolokito
 */
public class  FiveandSix{
    public static void main(String[] args) {
        int dn = 100;
        int numCount = 0;
        do {
            if (dn % 5 == 0 && dn % 6 == 0) {
                System.out.printf("%1d ", dn);
                numCount++;
                if(numCount % 10 == 0)
                System.out.print("\n");
            }
            dn++;  
        }
        while (dn <= 1000 && dn >= 100);
    }
}
