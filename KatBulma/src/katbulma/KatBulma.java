package katbulma;

import java.util.Scanner;

public class KatBulma {

    public static void main(String[] args) {
          int n;
        Scanner inp = new Scanner(System.in);
        System.out.println("Sınır sayısı gir");
        n= inp.nextInt();
        for(int i=1; i<n; i*=4)
            System.out.println("dördün kuvvetleri " +i);

        for(int j=1; j<n; j*=5)
            System.out.println("beşin kuvvetleri " +j);
    }
    
}
