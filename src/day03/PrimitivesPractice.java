package day03;

import java.sql.SQLOutput;

public class PrimitivesPractice {

    public static void main(String[] args) {

        byte letterCount = 26;
        System.out.println("The letter count is" + letterCount);
        // use above example to print out the rest of the variable value in similar format.

        short sheepCount = 300;
        System.out.println( " The sheep count is " + sheepCount );


        int catCount = 20;
        System.out.println( "The cat count is " + catCount );



        long mileToMoon = 5000000l;
        System.out.println( "The mile to moon is " + mileToMoon ) ;

        long mileTosun = 1000000L ;

        // ---------------floating point ------------
        // you must aa f at the end of number to indicate this is float data type
        //uppercase lowercase does not matter , but it is mandatory

        float priceOfBanana = 1.99f;
        System.out.println (" The price of banana is " + priceOfBanana );

        float priceOfPotato = 2.49F;
        System.out.println( "The price of potato is " + priceOfPotato );


        //---------larger floating point numbers ------

        double priceOfIpad1 = 355.99d;
        double priceOfIpadPro = 1024.99D;
        System.out.println( "the price of Ipad is " + priceOfIpad1) ;
        System.out.println("The price of IpadPro is "+ priceOfIpadPro);

        System.out.println(" Oo My God life is so expensive");


        // compiler automatically assume it's  double so it's not required to have d
        //However for good programming habbit, add them always
        double proceOfMac  =2299.99 ;

        //If you have a whole number by itself, compiler automatically assume it's an int
        // If you have a fractional number by itself, compiler automatically assume it's an double


    }
}
