package day03;

import jdk.swing.interop.SwingInterOpUtils;

import javax.xml.namespace.QName;

public class StringDateType {

    public static void main(String[] args) {

        String Name = "Emel" ;

        System.out.println( Name );

        System.out.println("My name is: "+ Name);
        //continue the rest about yourself

        String Surname = "Gumustop" ;
        System.out.println("My surname is:"+ Surname);

        int age = 36;
        double height = 5.5 ;
         char myLastNameFirstChar = 'G';
         boolean isMarried = true;

         byte childrenCount = 1 ;
         String city = "Fair Lawn";

        System.out.println("My age is: "+ age);
        System.out.println("My height is:"+ height);
        System.out.println("I am married: " + isMarried);
        System.out.println("My Last Name First Character is: "+ myLastNameFirstChar);
        System.out.println("I have " +  childrenCount +  " kid ");


    }
}
