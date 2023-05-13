
package dizitekrar;

import java.util.Arrays;

public class DiziTekrar {

    public static void main(String[] args) {
        int[] numbers = {21,31,43,24,34,22,24,54,76,-54,56,34,0,234};
        System.out.println("Dizi : " + Arrays.toString(numbers));
        //Diziyi küçükten büyüğe sıralıyoruz.
        Arrays.sort(numbers);
        System.out.println("Sıralı : " + Arrays.toString(numbers));
        //Dizi sıralandığında tekrarlayan değerler sıralı geldi. Sonrası zaten kolay :)
        int counter=0;
        for(int i=0; i < numbers.length-1; i++){
            if(numbers[i] == numbers[i+1]){
                int evenNumber = numbers[i];
                if(evenNumber % 2 == 0){
                    counter++;
                    System.out.print("Çift Sayılar"+ evenNumber + " " );
                }
            }
        }
        if(counter == 0){
            System.out.println("Tekrar Eden Çift Sayı Bulunamadı...:)");
        }
    }
    
}
