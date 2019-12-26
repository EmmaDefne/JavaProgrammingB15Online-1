package dAY06;

import java.util.Scanner;

public class RemainderTask {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the minute you want to convert ");
        int minutes = scan.nextInt();   // 135 ; //60*2+15
        int hourPart = minutes / 60;     //135/60 ;  // -->> 2
        int minsPart = minutes % 60; // 135%60 ;  // -->> 15
        System.out.println(" The minutes " + minutes + " is "
                + hourPart + " hours and " + minsPart + " minutes");
//artidan once alt satira gecersen kod yine calisir

    }
}
