package replIt;

import java.util.Scanner;

public class CatsAndDogs88 {
    public static void main(String[] args) {


    Scanner scan = new Scanner(System.in);
    int countOfCats = 0;
    int countOfDogs = 0;
    String word = scan.next();

    String wordForDogs= word;

    /*
    012345678901234567
    catgggdogcathhdog

     */

    while (word.contains("cat")){
        word=word.substring(word.indexOf("cat")+3);
        countOfCats ++;
    }
    while (wordForDogs.contains("dog")){
        wordForDogs=wordForDogs.substring(wordForDogs.indexOf("dog")+3);
        countOfDogs++;
    }
if (countOfCats==countOfDogs){
    System.out.println("true");
}else {
    System.out.println("false");
}


}
}