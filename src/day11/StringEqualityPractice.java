package day11;

public class StringEqualityPractice {
    public static void main(String[] args) {
        //checking for string equality should be always
        //done using equals method of the string
        //oneString.equals (anotherString) --->> true or false
        //each and every String object you created will have this functionality

        //just comparing 2 string literal directly using equals method
      //  System.out.println("Java".equals("java"));

        String myStr = "Java";

        System.out.println(myStr.equals("Java"));

        //intelliJ display original as helper, its not part of your code
        //please ignore and keep typing. do not type original just type your text
String yourStr = new String("Java");
        System.out.println("is my string same as your string?");
        //how to compare myStr to yourStr for equality
        System.out.println(myStr.equals(yourStr));


        //****
        //create a program to check whether myStr value is Java
        //if true -->> correct word!
        //if false --- say JAVA!!

        if (myStr.equals("Java")) {
            System.out.println("CORRECT WORD!");
        }else{
            System.out.println("SAY JAVA!!");



        }
    }
}
