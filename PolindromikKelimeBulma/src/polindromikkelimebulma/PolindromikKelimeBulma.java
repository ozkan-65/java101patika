
package polindromikkelimebulma;

import java.util.Scanner;
import static polindromikkelimebulma.PolindromikKelimeBulma.Main.isPalindrome;

public class PolindromikKelimeBulma {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Text girin : ");
        String text = input.next();
        if(isPalindrome(text)){
            System.out.println(text + "Palindromedur");
        }else{
            System.out.println(text + " Palindrome değildir");
        }
    }
    public class Main {
    public static boolean isPalindrome(String text){
        int i = 0;
        int j = text.length()-1;
        while(i<j){
            if(text.charAt(i) != text.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
    }
}
