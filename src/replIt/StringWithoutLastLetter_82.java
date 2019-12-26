package replIt;

import java.util.Scanner;

public class StringWithoutLastLetter_82 {
    public static <Char> void main(String[] args) {


        Scanner s = new Scanner(System.in);
        String txt = s.next();


     //   System.out.println(txt.substring(0, txt.length()-1)); // son harfi basmadi
       // System.out.print(txt.substring(0,2)); // ilk iki harfi alir

        String p2=txt.substring(0,2);
        System.out.print(p2);



    }
}
