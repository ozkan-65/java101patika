
package kombinasyon;

import java.util.Scanner;

public class Kombinasyon {

    public static void main(String[] args) {
         int n, r, i, cikarma, kombinasyon, nfak = 1, rfak = 1, cfak = 1;
        Scanner inp = new Scanner(System.in);
        System.out.println("n değeri girin: ");
        n = inp.nextInt();
        System.out.println("r değeri girin: ");
        r = inp.nextInt();
        cikarma = n - r;
        for (i = 1; i <= n; i++)
            nfak = nfak * i;
        for (i = 1; i < r; i++)
            rfak = rfak * i;
        for (i = 1; i < cikarma; i++)
            cfak = cfak * i;
        kombinasyon = nfak / (rfak * cfak);
        System.out.println("kombinasyon: " + kombinasyon);
    }
    
}
