
package manavkasaprogramı;

import java.util.Scanner;

public class ManavKasaProgramı {

    public static void main(String[] args) {
         Scanner reader = new Scanner(System.in);
     double toplamtutar;
     double armut,elma,domates,muz,patlican;
     double armutfiyat=2.14;
     double elmafiyat=3.67;
     double domatesfiyat=1.11;
     double muzfiyat=0.95;
     double patlicanfiyat=5;
     System.out.println("Armut kaç kilo?");
     armut=reader.nextDouble();
        System.out.println("Elma kaç kilo?");
        elma=reader.nextDouble();
        System.out.println("Domates kaç kilo?");
        domates=reader.nextDouble();
        System.out.println("Muz kaç kilo?");
        muz=reader.nextDouble();
        System.out.println("Patlıcan kaç kilo?");
        patlican=reader.nextDouble();
        toplamtutar=(armut*armutfiyat)+(elma*elmafiyat)+(domates*domatesfiyat)+(muz*muzfiyat)+(patlican*patlicanfiyat);
        System.out.println(toplamtutar);
     
    }
    
}
