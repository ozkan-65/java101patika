
package cinzodyagıhesaplama;

import java.util.Scanner;

public class CinZodyagıHesaplama {

    public static void main(String[] args) {
         Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen dogum yilinizi giriniz");
        int yil=scan.nextInt(); //Yıl cinsinden doğum yılını girin
        
        //Zodyak bulma döngüsü
        if (yil%12==0){
            System.out.println("Çin Zodyağı Burcunuz : Maymun");
        } else if (yil%12==1) {
            System.out.println("Çin Zodyağı Burcunuz : Horoz");
        }else if (yil%12==2) {
            System.out.println("Çin Zodyağı Burcunuz : Kopek");
        }else if (yil%12==3) {
            System.out.println("Çin Zodyağı Burcunuz : Domuz");
        }else if (yil%12==4) {
            System.out.println("Çin Zodyağı Burcunuz : Fare");
        }else if (yil%12==5) {
            System.out.println("Çin Zodyağı Burcunuz : Okuz");
        }else if (yil%12==6) {
            System.out.println("Çin Zodyağı Burcunuz : Kaplan");
        }else if (yil%12==7) {
            System.out.println("Çin Zodyağı Burcunuz : Tavsan");
        }else if (yil%12==8) {
            System.out.println("Çin Zodyağı Burcunuz : Ejderha");
        }else if (yil%12==9) {
            System.out.println("Çin Zodyağı Burcunuz : Yilan");
        }else if (yil%12==10) {
            System.out.println("Çin Zodyağı Burcunuz : At");
        }else if (yil%12==11) {
            System.out.println("Çin Zodyağı Burcunuz : Koyun");
        }
        
    }
    
}
