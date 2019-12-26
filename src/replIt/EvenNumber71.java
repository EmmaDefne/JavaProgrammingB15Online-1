package replIt;

import java.util.Scanner;

public class EvenNumber71 {
    public static void main(String[] args) {


        Scanner s = new Scanner(System.in);
        String word = s.next();


        int character=word.length();

        if (character%2==1 && character>=5){
            System.out.println(word.substring(word.length()/2-1,word.length()/2+2));
        }else{
            System.out.println("invalid");
        }        }

            }





