
package artikyilhesaplama;

import java.util.Scanner;

public class ArtikYilHesaplama {

    public static void main(String[] args) {
       int year;
      Scanner inp = new Scanner(System.in);
      //istenilen yıl girilecektir
      System.out.print("Yılı giriniz: ");
      year = inp.nextInt(); //istenilen yıl tam sayı değerinde girilecektir
      
      if((year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0)){
          System.out.println(year + " yılı artık yıldır.");
      }else{
          System.out.println(year + " yılı artık bir yıl değildir.");
      }
    }
    
}
