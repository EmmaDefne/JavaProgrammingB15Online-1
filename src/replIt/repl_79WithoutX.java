package replIt;

import java.util.Scanner;

public class repl_79WithoutX {

    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);
        String word = scan.next();

        if (word.charAt(0)=='x' || word.charAt(0)=='X'){
            word= word.substring(1,word.length());

        }
        if (word.charAt(word.length()-1) =='X' || word.charAt(word.length()-1 )== 'x'){
            word=word.substring(0,word.length()-1);

        }
        System.out.println(word);
        }

        }

