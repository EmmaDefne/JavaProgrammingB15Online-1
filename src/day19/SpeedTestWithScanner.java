package day19;

import java.util.Scanner;

public class SpeedTestWithScanner {

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in) ;
        System.out.println(" enter starting speed and ending speed ");


    int start=scan.nextInt();

    int end =scan.nextInt();

        System.out.println("you have started at speed");
        for (int i=start; i<=end; i++){
        System.out.print(i+ "-");
}
    }
}