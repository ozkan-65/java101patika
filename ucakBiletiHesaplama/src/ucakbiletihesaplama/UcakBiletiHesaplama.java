
package ucakbiletihesaplama;

import java.util.Scanner;

public class UcakBiletiHesaplama {

    public static void main(String[] args) {
         

        Scanner input = new Scanner(System.in);

        double distance, amount, normAmount, ageInd, gdind, price; //double değişkenler
        int age, path; //integer değişkenler

        System.out.print("Mesafe Giriniz:");
        distance = input.nextDouble();

        System.out.print("Yaşınızı Giriniz:");
        age = input.nextInt();

        System.out.println("Yolculuk Tipini Seçiniz:");
        System.out.println("1-Tek Yön\n2-Gidiş Dönüş");
        path = input.nextInt();

        //12 yaşından küçük yolcular için
        if (age < 12) { 
            if (path == 1) { //Tek Yön
                normAmount = distance * 0.10;
                ageInd = normAmount* 0.50;
                System.out.println("Toplam Tutar:" + ageInd);

            } else if (path == 2) { //Gidiş Dönüş
                normAmount = distance * 0.10;
                ageInd = normAmount * 0.50;
                amount = normAmount - ageInd;
                gdind = amount * 0.20;
                price = (amount - gdind) * 2;
                System.out.println("Toplam Tutar:" + price);

            }
            else {
                System.out.println("Hatalı Veri Girdiniz !");
            }
        }


        if (age > 24 && age < 65) {
            if (path == 1) { //Tek Yön
                normAmount=distance*0.10;
                System.out.println("Toplam tutar:"+normAmount);

            } else if (path==2) { //Gidiş Dönüş
                normAmount=distance*0.10;
                gdind=normAmount*0.20;
                price=(normAmount-gdind)*2;
                System.out.println("Toplam tutar:"+price);

            }
            else {
                System.out.println("Hatalı Veri Girdiniz !");
            }


        }


        if ( age>=12 && age<=24) {
                //Tek Yön
            if (path==1) {
                normAmount = distance * 0.10;
                ageInd = normAmount * 0.10;
                amount = normAmount - ageInd;
                System.out.println("Toplam Tutar:" + amount);
            } else if (path==2){ //Gidiş Dönüş
                normAmount = distance * 0.10;
                ageInd = normAmount * 0.10;
                amount = normAmount - ageInd;
                gdind=amount*0.20;
                price=(amount-gdind)*2;
                System.out.println("Toplam tutar:"+price);

            }
            else {
                System.out.println("Hatalı Veri Girdiniz !");

            }
        }

        if (age>65){
            if(path==1){ //Tek Yön
                normAmount=distance*0.10;
                ageInd=normAmount*0.30;
                amount=normAmount-ageInd;

                System.out.println("Toplam tutar:"+amount);
            } else if (path==2) { //Gidiş Dönüş
                normAmount=distance*0.10;
                ageInd=normAmount*0.30;
                amount=normAmount-ageInd;
                gdind=amount*0.20;
                price=(amount-gdind)*2;
                System.out.println("Toplam tutar:"+price);


            }
            else {
                System.out.println("Hatalı Veri Girdiniz !");
            }
        }

    }
    
}
