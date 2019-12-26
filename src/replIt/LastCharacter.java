package replIt;
import java.util.Scanner;

public class LastCharacter {

        public static void main(String[] args) {
            //DO NOT CHANGE
            Scanner scan = new Scanner(System.in);
            String word = scan.next();

            char last=word.charAt(word.length()-1);
           System.out.println(last);
        }
    }

