
package fighter;

public class Main {
     public static void main(String[] args) {

        Fighter f1 = new Fighter("Ozkan", 10, 95, 90, 20);
        Fighter f2 = new Fighter("Osman", 10, 95, 90, 20);

        Match match = new Match(f1,f2,90,110);
        match.run();

    }
}
