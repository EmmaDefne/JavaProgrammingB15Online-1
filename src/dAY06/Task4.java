package dAY06;

import java.util.Scanner;

public class Task4 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("What is your name?");
        String name = scan.nextLine();
        System.out.println(" You have entered  " + name);

        System.out.println("Which city you live in, including state?");
        String city = scan.nextLine();
        System.out.println(" You have entered  " + city);

        System.out.println("What is your street address?");
        String address = scan.nextLine();
        System.out.println(" You have entered  " + address);

    }
}
