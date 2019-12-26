package dAY06;

import java.util.Scanner;

public class UsingTheValueOfOtherVariables2 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("What is your order? I want the same!");
    String yourOrder = input.nextLine();
    String myOrder = yourOrder;

        System.out.println(" your order is " + yourOrder + "\n" + "my order is " + myOrder);

    }
}
