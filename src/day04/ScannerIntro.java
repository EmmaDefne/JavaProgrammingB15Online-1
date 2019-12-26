package day04;

import java.util.Scanner;

public class ScannerIntro {

    public static void main(String[] args) {
        //I want to save users input after asking some questions
        // and I want to save this input so I can do something with it

        // Step1 : Use scanner class to create scanner object
             //that have this functionality
        Scanner scan  = new Scanner (System.in);

        //ask use to enter name
        System.out.println("Enter your first name please :");

        // capture what user typed on keyboard in console


        String firstName = scan.next();

        //print the result of what we saved from user input

        System.out.println("You have entered : " + firstName);

// ask question from user before entering
        // capture what user typed on keyboard in console for age

        //scan.nextInt () is capturing single number that user entered
        //print the result of users age

        System.out.println(" enter your age" );

        int age = scan.nextInt();

        System.out.println("your age is:" + age);

        //biz burda parantez icine yas veya ad yazmadik
        //bu sefer asagidaki konsola adini girdi ve ardindan yasini girdi
        //bunun sebebi de yukarda entered dememiz
        //scanner tam ne ise yariyor anlamadim



    }
}
