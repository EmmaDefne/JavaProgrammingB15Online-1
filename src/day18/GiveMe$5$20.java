package day18;

import java.util.Scanner;

public class GiveMe$5$20 {
    public static void main(String[] args) {
        //keep asking for $5 or $20 until you get them
        Scanner scan=new Scanner(System.in);
        System.out.println("give me 5 or 20!!");

        int x=scan.nextInt();
//if the bill is not $5 and not 20 dollar keep doing this
        //while (x!=5 && x!=20){

        while (!(x==5|| x==20)){

            System.out.println("not the bill I am looking for ");
            System.out.println("give me 5 or 20");
            x=scan.nextInt();

        }
        System.out.println("the happy ending! got the money");
    }
}
