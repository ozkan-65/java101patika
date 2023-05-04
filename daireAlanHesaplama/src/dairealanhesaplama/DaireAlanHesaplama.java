
package dairealanhesaplama;

import java.util.Scanner;

public class DaireAlanHesaplama {

    public static void main(String[] args) {
          Scanner inp = new Scanner(System.in);
        double r, mAci, alan;

        System.out.print("yarciap degerini giriniz :");
        r = inp.nextDouble();

        System.out.print("merkez aci degerini giriniz :");
        mAci = inp.nextDouble();

        alan = (Math.PI * (r * r) * mAci) / 360;
        System.out.print("Daire diliminin alani : " + alan);
       
    }
    
}
