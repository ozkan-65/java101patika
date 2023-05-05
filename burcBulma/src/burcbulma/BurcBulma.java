
package burcbulma;

import java.util.Scanner;

public class BurcBulma {

    public static void main(String[] args) {
         Scanner inp= new Scanner(System.in);
        int ay,gun;

        System.out.print("Dogdugunuz ayi giriniz (1-12) :");
        ay=inp.nextInt();
        System.out.print("Dogdugunuz gunu giriniz:");
        gun=inp.nextInt();

        if((ay==3 && gun>=21) || (ay==4 && gun <=20)){
            System.out.print("Burcunuz koc.");
        }
        else if((ay==4 && gun>=21) || (ay==5 && gun<=21)){
            System.out.print("Burcunuz boga.");
        }
        else if((ay==5 && gun>=22) || (ay==6 && gun<=22)){
            System.out.print("Burcunuz ikizler.");
        }
        else if((ay==6 && gun>=23) || (ay==7 && gun<=22)){
            System.out.print("Burcunuz yengec.");
        }
        else if((ay==7 && gun>=23) || (ay==8 && gun<=22)){
            System.out.print("Burcunuz aslan.");
        }
        else if((ay==8 && gun>=23) || (ay==9 && gun<=22)){
            System.out.print("Burcunuz basak.");
        }
        else if((ay==9 && gun>=23) || (ay==10 && gun<=22)){
            System.out.print("Burcunuz terazi.");
        }
        else if((ay==11 && gun>=22) || (ay==12 && gun<=21)){
            System.out.print("Burcunuz yay.");
        }
        else if((ay==12 && gun>=22) || (ay==1 && gun<=21)){
            System.out.print("Burcunuz oglak.");
        }
        else if((ay==1 && gun>=22) || (ay==2 && gun<=19)){
            System.out.print("Burcunuz kova.");
        }
        else if((ay==2 && gun>=20) || (ay==3 && gun<=20)){
            System.out.print("Burcunuz balik.");
        }

        else{
            System.out.print("Hatalı giriş yaptınız");
        }
    }
    
}
