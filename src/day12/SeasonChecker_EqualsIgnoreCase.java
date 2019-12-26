package day12;

import java.util.Scanner;

public class SeasonChecker_EqualsIgnoreCase {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println(" Enter your season please");

         String season=scan.next();

         if (season.equalsIgnoreCase("spring")) {
             System.out.println(" Hiking, Nawruz, Allergy, Cool Weather ");
         } else if (season.equalsIgnoreCase("summer")){
             System.out.println("pool, beach, vacation");
         } else if (season.equalsIgnoreCase("fall")){
             System.out.println("barbecue, riding bike, halloween, just code");
         }else if (season.equalsIgnoreCase("winter")){
             System.out.println("code!!! ski, sleeding,snowman");
         }else {
             System.out.println("not valid!!!");
         }

    }
}
