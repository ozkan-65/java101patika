
package hesapmakinesi;

import java.util.Scanner;

public class HesapMakinesi {

    public static void main(String[] args) {
          int islem;
        double s1, s2;
        //Birinci sayı, İkinci sayı ve işlem türünü belirttik

        Scanner input = new Scanner(System.in);
        System.out.print("İlk sayıyı giriniz: ");
        s1 = input.nextDouble();
        //Burada kullanıcıdan ilk değeri alıyoruz

        System.out.print("İkinci sayıyı giriniz: ");
        s2 = input.nextDouble();
        //Burada kullanıcıdan ikinci değeri alıyoruz

        System.out.print("1 - Toplama\n2 - Çıkarma\n3 - Çarpma\n4 - Bölme\nYapılacak işlemi seçiniz: ");
        islem = input.nextInt();
        //Burada kullanıcıdan yapılacak işlemi seçmesini istiyoruz

        switch (islem) {
            case 1:
                System.out.println("Cevap: " + (s1 + s2));
                System.out.println("İşlem Tamamlandı !");
                break;
            case 2:
                System.out.println("Cevap: " + (s1 - s2));
                System.out.println("İşlem Tamamlandı !");
                break;
            case 3:
                System.out.println("Cevap: " + (s1 * s2));
                System.out.println("İşlem Tamamlandı !");
                break;
            case 4:
                if(s2 != 0){
                    System.out.println("Cevap: " + (s1 / s2));
                    System.out.println("İşlem Tamamlandı !");
                }else{
                    System.out.println("Hata: Bir sayı sıfıra bölünemez!\nİşlem Başarısız...");
                    //Burada kullanıcı hatalı giriş yaptığında hatasını söylüyoruz
                }
                break;
            default:
                System.out.println("Hata: Lütfen belirtilen seçenekleri kullanın!");
                    //Burada da aynısını yapıyoruz
                break;

                //Burada kullanıcının seçtiği işleme göre uygun case bulunuyor ve ilk başta alınan değerler kullanılarak cevap veriliyor
      
    }
    
}
}
