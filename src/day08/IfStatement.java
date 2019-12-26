package day08;

import java.util.Scanner;

public class IfStatement {


    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("What is your current speed, dear driver: ");
        int currentSpeed = scan.nextInt();
        System.out.println("What is speed limit");
        int speedLimit =scan.nextInt();

        if (currentSpeed >= speedLimit) {
            System.out.println(" get pulled over by the police");
            System.out.println(" given ticket by the police");
            System.out.println(" taken away some point on your licence");
            System.out.println(" go to court");
        }
        //THERE IS NO ELSE; PROGRAM JUST MOVE ON
        System.out.println(" THE END OF THE STORY !!!MOVE ON!!");
    }
}
