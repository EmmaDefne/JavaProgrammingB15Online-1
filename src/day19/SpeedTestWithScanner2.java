package day19;

import java.util.Scanner;

public class SpeedTestWithScanner2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println(" enter starting speed and ending speed ");


        int start = scan.nextInt();

        int end = scan.nextInt();

        System.out.println("you have started at speed");
        if (start < end) {
            System.out.println("increasinig the speed");

            for (int i = start; i <= end; i++) {
                System.out.print(i + "-");
            }

        }else if (start>end){
            System.out.println("decreasing the speed");
            for (int x=start; x>=end; x-- ){
                System.out.println(x+ "-");
            }
        }else {
            System.out.println("no action needed!!! same speed!!!");
        }
    }
}
