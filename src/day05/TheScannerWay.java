package day05;

import java.util.Scanner;

public class TheScannerWay {

    public static void main(String[] args) {
        Scanner scan  = new Scanner (System.in);// bu scanner object

        System.out.println("Enter your name :"); //ask question

        String name = scan.next();// blocking your program until you write the answer on the console

        System.out.println("your name is :"+ name);
        System.out.println("What is your birth year :");

        int birthYear = scan.nextInt();
        int age = 2019- birthYear;
        System.out.println("your age  is :"+ age);

        System.out.println("what is your height? ");
        double height = scan.nextDouble();
        System.out.println("your height is : " + height);


    }
}
