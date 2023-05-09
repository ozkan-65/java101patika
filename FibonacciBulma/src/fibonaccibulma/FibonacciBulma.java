
package fibonaccibulma;

import java.util.Scanner;

public class FibonacciBulma {

    public static void main(String[] args) {
         Scanner input = new Scanner(System.in);
        System.out.print("Fibonacci serisi kaç sayı olsun? ");
        int numbersofnumbers = input.nextInt(); //serinin kaç sayı olacağı yazılacak

        int firstnumber = 0, secondnumber = 1;
        System.out.print(firstnumber  + " " + secondnumber);

        for(int i = 2; i < numbersofnumbers ; i++) {
            int nextnumber = firstnumber  + secondnumber; //önceki iki sayı toplanacak
            System.out.print(" " + nextnumber);
            firstnumber  = secondnumber;
            secondnumber = nextnumber;
        }
    }
    
}
