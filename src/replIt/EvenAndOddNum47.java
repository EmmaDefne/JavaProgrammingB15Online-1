package replIt;

import java.util.Scanner;

public class EvenAndOddNum47 {
    public static void main(String[] args) {


        Scanner s = new Scanner(System.in);


        int grade = s.nextInt();

    if (grade>90){
        System.out.println("excellent");
    }else if (grade>70 && grade<90){
        System.out.println("good");
    }else if (grade>60 && grade<70){
        System.out.println("pass");
    }else {
        System.out.println("fail");
    }



    }
}
