
package vücutkitleendeksihesaplama;

import java.util.Scanner;

public class VücutKitleEndeksiHesaplama {

    public static void main(String[] args) {
         double yukseklik, agırlık, vki;

        Scanner scn = new Scanner(System.in);
        System.out.println("Lütfen Boyunuzu(metre cinsinden) Girin: ");
        yukseklik = scn.nextDouble();

        System.out.println("Lütfen Kilonuzu Girin: ");
        agırlık = scn.nextDouble();

        vki = agırlık/(yukseklik*yukseklik);

        System.out.println("Vücut Kitle İndeksiniz: " + vki);

    }
    
}
