
package usbulma;

import java.util.Scanner;

public class UsBulma {
     public static void main(String[] args) {
        System.out.println("Sonuç : " + rec()); //recursive method ile rec methodu çağrılıyor
    }
    
       public static int rec(){
        Scanner scan = new Scanner(System.in);
        System.out.print("Taban değerini giriniz : "); 
        int base =scan.nextInt(); //alt taban girilecek
        System.out.print("Üs değerini giriniz : ");
        int exponent =scan.nextInt(); //üst taban girilecek
        int result =1;

        for (int i=1; i<=exponent;i++){ //üst sayısı kadar dönen for döngüsü
            result *= base;
        }
        return result;
    }

   
    
}
