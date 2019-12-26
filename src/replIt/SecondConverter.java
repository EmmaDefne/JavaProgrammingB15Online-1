package replIt;

import java.util.Scanner;

public class SecondConverter {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);

        int inputSeconds, hours, minutes , seconds;

        System.out.println("Enter seconds:");
        inputSeconds =scan.nextInt();
         seconds= inputSeconds%60;
        hours= inputSeconds/60;
        minutes=hours%60;
        hours=hours/60;  //bunlarin sirasini degistirme calismiyor
        System.out.println(hours + "hours," + minutes +  "minutes," + " and "+ seconds+ " seconds");


    }
}
