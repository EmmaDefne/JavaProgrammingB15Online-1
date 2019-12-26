package day10;


import java.util.Scanner;

public class SeasonAction_Scanner {

    public static void main(String[] args) {

            Scanner scan =new Scanner(System.in);

        System.out.println("Hey what is the season?");

        String season =scan.next();


        switch (season){
            case "Spring":
                System.out.println("You can celebrate Easter and Nawruz!");
                break;
            case "Summer":
                System.out.println(" Go to vacation, have some good time");
                break;
            case "Fall":
                System.out.println(" Trick or treat, halloween time!!! ");
                break;
            case "winter":
                System.out.println(" Merry Christmas");
                break;
            default:
                System.out.println(" there is no such a season");


        }
    }
}

