
package uslusayibulma;

import java.util.Scanner;

public class UsluSayiBulma {

    public static void main(String[] args) {
       Scanner scan = new Scanner(System.in);
        double taban, us, usluSayi, usluSayi_for=1.0;
        System.out.print("Üssü alınacak sayı: ");
        taban = scan.nextDouble();
        System.out.print("Alınacak üs: ");
        us = scan.nextDouble();
        
        usluSayi = Math.pow(taban, us);
        System.out.println("--> "+usluSayi);
        
        //System.out.println("-----------");
        
        //for ile
        for(int i = 1; i<=us; i++){
            usluSayi_for *= taban;
        }
       
    }
    
}
