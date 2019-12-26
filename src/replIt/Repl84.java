package replIt;

import java.util.Scanner;
import java.util.StringTokenizer;

public class Repl84 {

    public static void main(String[] args) {


        //premium customer
        //1 free book --->>> 5 or more books
        //2 free books ---->> 8 or more books

        //regular costomer
        //1 free book ---> 7 or more books
        //2 free books ---> 12 or more books

        int freeBooks = 0;
        Scanner scan = new Scanner(System.in);


        boolean isPremiumCustomer = scan.nextBoolean();
        int nbooksPurchased = scan.nextInt();


        if (isPremiumCustomer) {
            if (nbooksPurchased>=8) {
                freeBooks = 2;
            }
            else if (nbooksPurchased>=5) {
                freeBooks = 1;
            }
        }
        else {
            if (nbooksPurchased>=12) {
                freeBooks = 2;
            }
            else if (nbooksPurchased>=7) {
                freeBooks = 1;
            }

        }

        System.out.println(freeBooks );

    }
}