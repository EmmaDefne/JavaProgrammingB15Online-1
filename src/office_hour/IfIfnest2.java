package office_hour;

import java.util.Scanner;

public class IfIfnest2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println(" you want food or not!");
        String mainOption = scan.next();

        if (mainOption.equalsIgnoreCase("food")) {
            System.out.println("You have selected food");

            System.out.println("you want meal or snack");
            String secondOption = scan.next();


            if (mainOption.equalsIgnoreCase("food")) {
                System.out.println("You have selected food");
                if (secondOption.equalsIgnoreCase("snack")) {
                    System.out.println("You have selected snack");
                } else if (secondOption.equalsIgnoreCase("meal")) {
                    System.out.println("Yu have selected meal ");
                } else {
                    System.out.println(" no such food option");
                }
            }
        }

    }
}