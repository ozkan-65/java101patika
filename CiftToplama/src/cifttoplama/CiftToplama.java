
package cifttoplama;

import java.util.Scanner;

public class CiftToplama {

    public static void main(String[] args) {
          int number,total=0;
        Scanner input=new Scanner(System.in);
        do {
            System.out.println("Sayı giriniz:");
            number=input.nextInt();
            if (number%4==0){
                total=total+number;
            }
        }while (number%2==0);
        System.out.println("Çift ve dördün katı sayıların toplamı:"+total);
    }
    
}
