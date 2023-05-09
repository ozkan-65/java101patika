
package basamaksayitoplama;

import java.util.Scanner;

public class BasamakSayiToplama {

    public static void main(String[] args) {
         Scanner input = new Scanner(System.in);
        int number, basValue, result =0;
        System.out.print("Sayıyı Giriniz: ");
        number = input.nextInt();
        while (number!=0){
            basValue=number%10;
            result+=basValue;
            number /=10;
         }
        System.out.print(result);
    }
    
}
