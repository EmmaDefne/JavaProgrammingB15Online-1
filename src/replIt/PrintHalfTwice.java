package replIt;

import java.util.Scanner;

public class PrintHalfTwice {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String word = scan.next();
        //WRITE YOUR CODE HERE

        System.out.println(word.substring(0, word.length() / 2) + word.substring(0, word.length() / 2) );
    }
}
