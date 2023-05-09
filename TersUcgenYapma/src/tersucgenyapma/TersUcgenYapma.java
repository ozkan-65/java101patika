
package tersucgenyapma;

import java.util.Scanner;

public class TersUcgenYapma {

    public static void main(String[] args) {
        int number;

        Scanner input =new Scanner(System.in);
        System.out.print("Üçgeniniz kaç katlı olsun :");
        number= input.nextInt(); //üçgenin kaç katlı olacağı yazılacak

        for(int i =1 ; i <= number;i++){

            for (int j =1; j<=i;j++)
            {
                System.out.print(" ");
            }
            for(int k = 1 ; k<= 2*(number-(i-1))-1;k++){

                System.out.print("*");
            }
            System.out.println();
    }
    
    }
}
