
package asalsayibul;

import java.util.Scanner;

public class AsalSayiBul {

    public static void main(String[] args) {
         Scanner inp = new Scanner(System.in);
        System.out.print("Bir sayi girinizi :");
        int number = inp.nextInt();

        if (asalMi(number,2)){
            System.out.println(number + " asal bir sayıdır.");
        } else {
            System.out.println(number + " asal bir sayı değildir.");
        }
        
    }
     public static boolean asalMi(int number, int divide){
        if (number < 2) { // 2'den kücük sayılar asal değil.
            return false;
        }
        if (number == 2){ // 2 asal bir sayıdır.
            return true;
        }
        if (number% divide == 0) { // Eğer sayı bölündüyse asal değildir.
            return false;
        }
        if (divide * divide > number){ // Sayının karekokunden büyük sayılara bölünmezse asaldır.
            return true;
        }
        return asalMi(number, divide +1); //Boleni arttırarak fonksiyonu tekrar çağırır.
    }
    
}
