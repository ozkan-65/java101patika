
package desenmethodolusturma;

import java.util.Scanner;

public class DesenMethodOlusturma {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter number : " );
        int number = scan.nextInt();
        int temp = number;
        extraction1(number, temp);
    }
     static void extraction1(int number, int temp) {
        if (number > 0) {
            System.out.print(number + " ");
            extraction1(number - 5, temp);
        } else if (number <= 0) {
            extraction2(number, temp);
        }
     }
     static void extraction2(int number, int temp) {
        if (temp >= number) {
            System.out.print(number + " ");
            extraction2(number + 5, temp);
        }
    }
    
}
