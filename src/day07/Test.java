package day07;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println(" Enter your first name, last name, company seperated by space");

        String firstName , lastName, company, email;
                firstName = scan.next();
        lastName = scan.next();
        company =scan.next();

        email =firstName+ "_" + lastName+"@"+company+".com";

        //String  name = "Emel Gumustop";
       // String company = " Toys&Beyond";
        //String email = "emelgumustop@hotmail.com";

        System.out.println(" My name is " + firstName + lastName + " and I work for " + company + " and my email is " + email );


    }
}
