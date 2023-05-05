
package sınıfgecmekalma;

import java.util.Scanner;

public class SınıfGecmeKalma {

    public static void main(String[] args) {
           int matematik, fizik, turkce, kimya, muzik;
        Scanner inp = new Scanner(System.in);

        System.out.print("Matematik Ders Notunuz : ");
        matematik = inp.nextInt();
        int mat = (matematik > 100 || matematik < 0) ? 0 : matematik;

        System.out.print("Fizik Ders Notunuz : ");
        fizik = inp.nextInt();
        int fiz = (fizik > 100 || fizik < 0) ? 0 : fizik;

        System.out.print("Türkçe Ders Notunuz : ");
        turkce = inp.nextInt();
        int tur = (turkce > 100 || turkce < 0) ? 0 : turkce;

        System.out.print("Kimya Ders Notunuz : ");
        kimya = inp.nextInt();
        int kim = (kimya > 100 || kimya < 0) ? 0 : kimya;

        System.out.print("Müzik Ders Notunuz : ");
        muzik = inp.nextInt();
        int muz = (muzik > 100 || muzik < 0) ? 0 : muzik;

        int toplam = (mat + fiz + tur + kim + muz);
        double ort = toplam / 5.0;

        if (ort >= 55 && ort <= 100)
            System.out.println("Tebrikler...Sinifi Geçtiniz.");

        else if (ort >= 0 && ort < 55)
            System.out.println("Sinifta Kaldiniz....");

        System.out.println("Ortalamaniz : " + ort);
       
    }
    
}
