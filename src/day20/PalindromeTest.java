package day20;

import java.util.EventListener;

public class PalindromeTest {

    public static void main(String[] args) {
        //if you reverse a string it does change it means
        //the string is called palindrome
        //level,kayak,elle,madam,aziza

        String name=" Kayak";
        System.out.println("name=  "+ name);
        String reversedName="";
        for (int x = name.length()-1; x>=0 ; x--) {
            reversedName=reversedName+name.charAt(x);
        }
        System.out.println("reversedName=" + reversedName);

        //make this code does not care about spaces while checking
        if (name.equalsIgnoreCase(reversedName)){
            System.out.println("PALINDROME TEST HAS PASSED");
        }else{
            System.out.println("PALINDROME TEST HAS FAILED");

    }
}

}
