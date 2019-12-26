package dAY06;

import java.util.Scanner;

public class saleCalculator {


    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);

       double regularPrice;
      double salePrice;
      double  discount;

      //if you have variables with same data type; you can declare them in one line like this:
       // double regularPrice, salePrice, discount;
        // ayrica burada indirim oranina 0.2 gibi deger gir. formul bu sekilde duzenlenmis



        System.out.println( "What is the regular price?");
        regularPrice = scan.nextDouble();

        System.out.println("What is the discount rate?");
         discount = scan.nextDouble();
         salePrice = regularPrice - regularPrice * discount;

        System.out.println( " Regular price is " + regularPrice + "$ , discount is" + discount + "  and your got deal for"
 + salePrice + " $" );

    }
}
