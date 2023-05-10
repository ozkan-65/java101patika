
package fibonacci;

import java.util.Scanner;

public class Fibonacci {

    public static void main(String[] args) {
         Scanner x=new Scanner(System.in);
        while (true) {
            System.out.print("Fibonacci serisi kaç sayı olsun? = ");
            int sayiAdedi = x.nextInt();
            k(sayiAdedi);
        }
        
    }
     static int k(int sayiAdedi) {
        int ilkSayi = 0, ikinciSayi = 1, sonrakiSayi=0;
        for (int i = 2; i < sayiAdedi; i++) {
             sonrakiSayi = ilkSayi + ikinciSayi;
            System.out.println(" " + sonrakiSayi);
            ilkSayi = ikinciSayi;
            ikinciSayi = sonrakiSayi;
        }
        return sonrakiSayi;
     }
}
