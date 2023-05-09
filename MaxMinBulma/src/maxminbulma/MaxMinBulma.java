
package maxminbulma;

import java.util.Scanner;

public class MaxMinBulma {

    public static void main(String[] args) {
         Scanner input=new Scanner(System.in);
        int n,i=0,max=0,min=0;
        boolean firstnumber=true;
        System.out.println("Kaç tane sayı gireceksiniz:");
        n= input.nextInt(); //sayı girilecek
        while (i<n){
            i++;
            System.out.println(i+".Sayıyı giriniz");
            int sayi=input.nextInt();
            if(firstnumber){ //sayıları karşılaştırıyor
                max=sayi;
                min=sayi;
                firstnumber=false;
            }else{
                if(sayi>max){ //max sayıyı buluyor
                    max=sayi;
                }if (sayi<min){ //min sayıyı buluyor
                    min=sayi;
                }
            }
        }
        System.out.println("En büyük sayı:"+max);
        System.out.println("En küçük sayı:"+min);
    }
    
}
