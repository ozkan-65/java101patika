
package kdvhesaplama;

import java.util.Scanner;

public class KdvHesaplama {
    public static void main(String[] args) {
          Scanner inp = new Scanner(System.in);
    System.out.println("Ücret tutarını giriniz:");
    double tutar = inp.nextDouble();
    double kdvTutar;
    if (tutar > 0.0 && tutar < 1000.0) {
        kdvTutar = tutar * 0.18;
        System.out.println("KDV tutarı:" + kdvTutar);
    } else if (tutar > 1000.0) {
        kdvTutar = tutar * 0.08;
        System.out.println("KDV tutarı:" + kdvTutar);
    } else {
        System.out.println("Tutarı Doğru Giriniz");
    }
        
    }
    
}
