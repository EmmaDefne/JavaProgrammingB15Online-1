package day11;

import org.w3c.dom.ls.LSOutput;

public class LogicalOperators {
    public static void main(String[] args) {



    //combining multiple condition together
    //in java there is no range check directly like math
    //for example int x=70
    //in math : 60<x<100 --->> true <100
    //in java : x>60 && x<100
    //&& 2 ampersand & 1 ampersand ---> logical and operator
    // this is used to check both conditions are true at the same time

    // think about login example
    //only when your username is right and your password is right at the same time
    //then you will be able to login
    /*
                true      true
    *int x=70; x>60 && x<100; true
    *            false   true
    *int x=10; x>60 && x<100; false
    *            true     false
    *int x=110; x>60 && x<100; false
    *            true   true
    *int x=99; x>60 && x<100; true
     * devami defterde yaziyor 11/23 saturday
     */
        System.out.println("TRUTH TABLE ");
        System.out.println("RESULT OF true && true is " + (true && true));
        System.out.println("RESULT OF false && true is " + (false && true));
        System.out.println("RESULT OF true && false is " + (true && false));
        System.out.println("RESULT OF false && false is " + (false && false));



        System.out.println("TRUTH TABLE ");
        System.out.println( (true && true));
        System.out.println ( (false && true));
        System.out.println( (true && false));
        System.out.println( (false && false));


        System.out.println("TRUTH TABLE ");
        System.out.println("RESULT OF true || true is " + (true || true));
        System.out.println("RESULT OF false || true is " + (false || true));
        System.out.println("RESULT OF true || false is " + (true || false));
        System.out.println("RESULT OF false || false is " + (false || false));


        //create a variable called num with type int
        //find out whether this number is more than 100 or less than 10
        // find out the number is within the range of 10-60
        //and print out the result


      //  ***************
        //int num= 8;
        //System.out.println( num<10 || num>100); //true
       // System.out.println(num<10 && num>100);   //false
        //bununla alakali tablo var
//**************

                             //true  || false --->> true
        System.out.println( true || false || false);
        System.out.println(true && true && false);


        int x=55;
                           //false || false|| true --->>> true
        System.out.println( x==50 || x==51 || x==55);


// check x is more than 50
// and x is not 52
// or x equal to 57
        System.out.println(x>50 && x !=52 || x==57 );
        //and dediginde& , or dediginde || , not equal dediginde !

        System.out.println( false || true && true);

    }
}
