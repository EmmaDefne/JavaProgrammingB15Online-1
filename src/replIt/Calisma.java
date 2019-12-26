package replIt;


import java.util.Scanner;

public class Calisma {


    public static void main(String[] args) {


        Scanner scan=new Scanner(System.in);
        String word = scan.next();

        int character=word.length();

      if (character%2==1 && character>=3){
           System.out.println( word.charAt(word.length() / 2));
      }else if (character==1){
          System.out.println(word+word+word);
      }else if (character%2==0 && character>=4){
          System.out.println( word.charAt(word.length() / 2 - 1) + "" + word.charAt(word.length() / 2));
      }else if (character==2){
          System.out.println(word+word);
      }



    }
}
