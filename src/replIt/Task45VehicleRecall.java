package replIt;

import java.util.Scanner;

public class Task45VehicleRecall {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int vehicleyear;
        System.out.println("Enter vehicle's year:");
        vehicleyear=scan.nextInt();
        if ( (vehicleyear>=1995 && vehicleyear<=1998) || (vehicleyear>=2001 && vehicleyear<=2002)||
                (vehicleyear>=2004 && vehicleyear<=2006)|| (vehicleyear>=2015 && vehicleyear<=2017)){
            System.out.println("Your vehicle needs to be recalled!");
        }else {
            System.out.println("Your vehicle is fine, enjoy!");
        }
    }
}
