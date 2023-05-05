
package hobionerisi;

import java.util.Scanner;

public class HobiOnerisi {

    public static void main(String[] args) {
          int sicaklik;

        Scanner input = new Scanner(System.in);
        System.out.print("Sicaklik Değerini Giriniz : ");
        sicaklik = input.nextInt();

        if (sicaklik< 5){
            System.out.println("Kardan Adam Yapabilirsiniz.");
        }else if ( sicaklik<= 25){
        if (sicaklik<= 15){
            System.out.println("Tiyatroya Gidebilirsin.");
        }
        if (sicaklik >= 10) {
            System.out.println("Futbol Macina Gidebilirsiniz.");
        }
        }else{
            System.out.println("Pikniğe Gidebilirsiniz.");
        }
    }
    
}
