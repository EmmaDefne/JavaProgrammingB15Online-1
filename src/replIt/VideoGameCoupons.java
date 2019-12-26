package replIt;

import java.util.Scanner;

public class VideoGameCoupons {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);





        System.out.println("Enter number of coupons:");
        int coupons=scan.nextInt();
        int candyBar=coupons/10;
        int gumBall=coupons%10/3;
        if (coupons>=3){
            System.out.println("Number of Candies:" + candyBar);
            System.out.println("Number of Gumballs:" + gumBall);
        }else {
            System.out.println("Not enough coupons");
        }



    }

}
