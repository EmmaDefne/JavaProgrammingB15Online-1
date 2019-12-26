package replIt;

import java.util.Scanner;

public class ReverseIt67 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String word = scan.next();


        int lengthOfTheName = word.length();


        if (lengthOfTheName<=4){
            System.out.println("Too Short!");
        }else if (lengthOfTheName>5){
            System.out.println("Too Long!");
        }else
            System.out.println(word.charAt(4) + ""+ word.charAt(3) +""+ word.charAt(2) +""+ word.charAt(1) + word.charAt(0));


    }

}






