package day05;

import java.util.Scanner;

public class TimeConverter {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);


        System.out.println( " What day is it today? " );
        String day = scan.next();

        System.out.println(" today is " + day);

        System.out.println(" how many hours is a day ? ");
int hour = scan.nextInt();

        int dayHours= 24*60;


        System.out.println(" a day is  " + dayHours + "  minutes");

        System.out.println(" How many days are you going to drive ? ");
        int workDay = scan.nextInt();
        int minute = workDay * 60 * 24;
        System.out.println(" Your going to drive for " + minute + " minutes ");



    }
}
