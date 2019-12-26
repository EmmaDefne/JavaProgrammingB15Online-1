package day25;

import java.util.Arrays;

public class String_Split_Method {

    public static void main(String[] args) {

        String sentence="I love Java";


        //WHAT DOES IT DO?
        //SPLIT (by something) is a method of string that split string into multiple part
        //do i need to provide extra data while calling the method?
        //yes, we need to tell what to do we use while splitting, in this example space
        //WHAT DO I GET OUT OF IT?
        //we get out string array
        String[] allWords=sentence.split(" ");
        System.out.println("allWords = " + Arrays.toString(allWords) );
        System.out.println("How many word do I have? = " + allWords.length);

        //how do i get the last word of the sentence using this array i got from string
        System.out.println("How many word do I have? = " + allWords[allWords.length-1]);

        //Are we limited to split by space or we can split by anything?

        String sentence2= " Everything is Awesome!!!";
        //split by letter e

        String[] splitBy_e_Arr = sentence2.split("e"); // eleri at dedik
        System.out.println("splitBy_e_Arr = " + Arrays.toString(splitBy_e_Arr));
        for (String eachPieces : splitBy_e_Arr) {
            System.out.println("eachPieces = <" + eachPieces + "> ");


            String[] splitBy_is_Arr = sentence2.split("is"); // eleri at dedik
            System.out.println("splitBy_is_Arr = " + Arrays.toString(splitBy_is_Arr));

        }


    }
}
