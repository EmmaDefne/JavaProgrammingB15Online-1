package office_hour;

import java.sql.Array;
import java.util.Arrays;
import java.util.Scanner;

public class ArrayPracticeWithScanner {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);

        System.out.println("please enter 3 languages that you know");
        String l1=scan.next();
        String l2=scan.next();
        String l3=scan.next();
        String[] languages ={l1,l2,l3};

        System.out.println(languages[2]);

        //1. print all values
        System.out.println(Arrays.toString(languages));

        //2.for each
        for (String lan : languages) {
           // System.out.println('here is t');
           /// BUNU TAMAMLA OFFICE HOUR DEC 10

        }

    }
}
