package day20;

public class Get2SiblingChar {
    public static void main(String[] args) {
        //given a string with value
        //print 2 characters in one line as below example
               //      0123
        //for example: ayra
        /*
        ay          02
        yr          13
        ra           24

         */

        String name = "ayra";


        int charCount = name.length();
            int lastCharIndex = charCount - 1;

        for (int x = 0; x <= charCount - 1; x++) {
            System.out.println(name.substring(x, x + 2));


        }

        //      //  System.out.println(name.substring(0,3));
        //      //  System.out.println(name.substring(1,4));
        System.out.println("getting three character");
        for (int x = 0; x <= lastCharIndex-2; x++) {
            System.out.println(name.substring(x,x+3));



        }

    }
}
