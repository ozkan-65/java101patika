
package atmuygulamasi;

import java.util.Scanner;

public class AtmUygulamasi {

    public static void main(String[] args) {
         String userName,password;
        Scanner inp = new Scanner(System.in);
        int right = 3;
        int balance = 1500 ;
        int select;


        while (right>0){
            System.out.println("user name");
            userName = inp.nextLine();
            System.out.println("user password");
            password = inp.nextLine();

            if (userName.equals("ozkan") && password.equals("123")){
                System.out.println("login system");
                do {

                    System.out.println("1-deposit\n"+
                            "2-withdraw money\n" +
                            "3-show balance\n" +
                            "4-log out\n" );
                    System.out.println("choose some option");
                    select = inp.nextInt();
                   
                    switch (select){
                        case 1:
                            System.out.println("price amount");
                            int price = inp.nextInt();
                            balance += price;
                            System.out.println("Successfully increased ...");
                            break;
                        case 2:
                            System.out.println("price amount");
                            price = inp.nextInt();
                            if(price > balance){
                                System.out.println("balance isn't enough");
                            }else {
                                balance -= price;
                                System.out.println("Successfully you get cash");
                            }
                        case 3:
                            System.out.println("your balance : " + balance);
                            break;
                    }
                }while (select != 4);
                System.out.println("see you again");
                break;
            }else {
                right--;
                System.out.println("username or password is wrong. try again");
                if (right == 0){
                    System.out.println("your account is blocked. contact your bank ");
                }else{
                    System.out.println(" last chance : " + right);
                }

            }


        }
    }
    
}
