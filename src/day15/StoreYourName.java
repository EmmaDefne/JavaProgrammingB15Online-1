package day15;

import java.util.Scanner;

public class StoreYourName {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter your name please: ");
        String name =scan.next();

        int lenthOfTheName = name.length();
        System.out.println("lenthOfTheName = " + lenthOfTheName);

        if (lenthOfTheName<4){
            System.out.println("Short Name");
        }else if (lenthOfTheName<=11){
            System.out.println("Medium Name");
        }else {
            System.out.println("Longer Name");
        }
//-----------------
        //true or false

        if (name.contains("a") || name.contains("e")){
            System.out.println("name contains a or e ");
        }else {
            System.out.println("I don't have both a or e in my name ");
        }






    }
}
