
package nothesaplama;
import java.util.Scanner;
public class NotHesaplama {
   
    public static void main(String[] args) {
        int mat,turkce,tarih,biyoloji,fizik;
        Scanner okur=new Scanner(System.in);
        System.out.print("Matematik notunuzu girin");
        mat=okur.nextInt();

        System.out.print("Türkçe notunuzu girin");
        turkce=okur.nextInt();

        System.out.print("Tarih notunuzu girin");
        tarih=okur.nextInt();

        System.out.print("Biyoloji notunuzu girin");
        biyoloji=okur.nextInt();

        System.out.print("Fizik notunuzu girin");
        fizik=okur.nextInt();

        

        double ortalama = (mat+turkce+tarih+biyoloji+fizik)/5;
        System.out.println(ortalama);
        System.out.println(ortalama>=60? "gectiniz":"kaldınız");
    }
    
}
