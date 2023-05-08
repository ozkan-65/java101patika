
package donguhesaplama;

import java.util.Scanner;

public class DonguHesaplama {

    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
	        System.out.print("Bir sayı giriniz: ");
	        int inp = input.nextInt(); // bir sayı girilmesi istenmektedir

	        int sum = 0;
	        int count = 0;
	        for (int i = 1; i <= inp; i++) {
	            if (i % 3 == 0 && i % 4 == 0) {
	                sum += i;
	                count++;
	            }
	        }

	        double average = (double) sum / count;

	        System.out.println("0'dan " + inp + " kadar olan sayılardan 3 ve 4'e tam bölünenlerin ortalaması: " + average);
	    
    }
    
}
