
package sayitahmin;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class SayiTahmin {

    public static void main(String[] args) {
        Random rand = new Random();
        int number = rand.nextInt(100);
        //System.out.println(number);

        Scanner input = new Scanner(System.in);
        int right = 0;

        int[] selectArray = new int[5];

        boolean isWin = false;
        boolean isWrong = false;

        while(right < 5){
            System.out.print("0-100 arası bir sayı giriniz : ");
            int selected = input.nextInt();

            if(selected < 0 || selected > 99){
                System.out.println("Lütfen 0 ile 100 arasında bir sayı giriniz.");

                if(isWrong){
                    right++;
                    System.out.println("Hatalı giriş yaptınız, kalan hakkınız : " + (5-right));
                }else{
                    isWrong = true;
                    System.out.println("Bir daha hatalı girişinizde hakkınızdan düşülecektir.");
                }

                continue;
            }
            if(number == selected){
                System.out.println("Tebrikler! " + selected + " sayısı doğru tahmin.");
                if(!isWin){
                    selectArray[right] = selected;
                }
                break;
            }else{
                if(number < selected){
                    System.out.println("Tahmininiz gizli sayıdan büyüktür.");
                }else{
                    System.out.println("Tahmininz gizli sayıdan küçüktür.");
                }
                selectArray[right] = selected;
            }
            right++;
            System.out.println("Kalan hakkınız : " + (5 - right));
        }

        System.out.println(Arrays.toString(selectArray));
    }
    
}
