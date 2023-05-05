
package sayisiralama;

import java.util.Scanner;

public class SayiSiralama {

    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        int a,b,c;

        System.out.print("Birinci Sayiyi Giriniz : ");
        a = inp.nextInt();
        System.out.print("İkinci Sayiyi Giriniz : ");
        b = inp.nextInt();
        System.out.print("Ücüncü Sayiyi Giriniz : ");
        c = inp.nextInt();

        if ((a>b)&&(a>c)){
            if (b>c){
                System.out.println("Siralama : "+ a +" > "+ b + " > " + c);
            }else {
                System.out.println("Siralama : "+ a + " > " + " > " + c + " > " + b);
            }
        } else if ((b>c) &&(b>a)) {
            if (a>c){
                System.out.println("Siralama : "+ b + " > " + a + " > " + c);
            }else{
                System.out.println("Siralama : "+ b +" > " + c + " > " + a);
            }
        }else {
            if ((b>a)){
                System.out.println("Siralama : "+ c + " > " + b + " > " + a);
            }else {
                System.out.println("Siralama : "+ c + " > " + a + " > " + b);
            }
        }
    }
    
}
