
package harmonikhesaplama;

import java.util.Scanner;

public class HarmonikHesaplama {

    public static void main(String[] args) {
        double number,total=0;
        Scanner reader = new Scanner(System.in);
        System.out.println("Bir sayı giriniz");
        number=reader.nextDouble();
        for(double i=1;i<=number;i++){
            total=total+(1/i);
        }
        System.out.println(total);
    }
    
}
