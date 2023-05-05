
package kullanicigirisi;

import java.util.Scanner;

public class KullaniciGirisi {

    public static void main(String[] args) {
         String userName, password;

        Scanner input = new Scanner(System.in);

        System.out.print("Kullanici Adi: ");
        userName = input.nextLine();

        System.out.print("Sifre: ");
        password = input.nextLine();

        if (userName.equals("Ozkan") && password.equals("Pektas")) {
            System.out.println("Giris basarili");
        } else if (userName.equals("Ozkan")) {
            System.out.println("Giris Basarisiz!");
            System.out.println("Sifreyi yenilemek isteromisiniz: Yes / No");
            String answer = input.nextLine();
            if (answer.equals("Yes")) {
                short tryCounter = 0;
                while (tryCounter < 5) {
                    System.out.print("Yeni sifreyi giriniz: ");
                    String newPassword = input.nextLine();
                    tryCounter += 1;
                    if (tryCounter >= 5) {
                        System.out.println(
                                "Cok fazla yanliş oturum açma girişiminde bulundunuz, lutfen bir süre bekleyin ve daha sonra tekrar deneyin..");
                        break;
                    }
                    if (newPassword.equals("Pektas") || newPassword.equals(password)) {
                        System.out.println("Daha once kullanilmamış bir şifre seçin.");
                    } else {
                        password = newPassword;
                        System.out.println("Sifre degistirildi: " + password);
                        break;
                    }
                }
            }
        } else {
            System.out.print("Kullanici bulunamadi.");
        }
       
    }
    
}
