
package mukemmelsayibulma;

import java.util.Scanner;

public class MukemmelSayiBulma {

    public static void main(String[] args) {
         Scanner input =new Scanner(System.in);
        int number,num=0;
        System.out.println("Sayı giriniz:");
        number=input.nextInt();  // sayı girişi yapılacaktır 
        for(int i=1;i<number;i++){
            if(number%i==0){
                num=num+i;
            }
        }if(num==number){ // mükemmel sayıyı bulan döngü
            System.out.println(number+" Mükemmel sayıdır.");
        }else {
            System.out.println(number+" Mükemmel sayı değildir.");
        }
    }
    
}
