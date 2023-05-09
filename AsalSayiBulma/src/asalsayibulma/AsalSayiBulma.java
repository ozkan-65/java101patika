
package asalsayibulma;

public class AsalSayiBulma {

    public static void main(String[] args) {
        // 1'den 100'e kadar olan asal sayıları bulma
         System.out.println("1'den 100'e kadar olan asal sayılar:");
    for (int i = 2; i <= 100; i++) { // 100e kadar arttıran for döngüsü
        boolean prime = true;
        for (int j = 2; j < i; j++) {
            if (i % j == 0) { //asal olup olmadığını kontrol eden if bloğu
                prime = false;
                break;
            }
        }
        if (prime) { //asal sayıları yazan if bloğu
            System.out.println(i);
        }
    }
    }
    
}
