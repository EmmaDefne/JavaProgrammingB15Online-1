package replIt;


import java.util.Scanner;

public class Deneme {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String item = scan.nextLine();

        int giftCard = 100;
        int currentBalance;

        if (item.equalsIgnoreCase("smartPhone")  ){
            currentBalance=giftCard-300;
            System.out.println("Sorry, not enough funds on your gift card!");
        } else if (item.equalsIgnoreCase("laptop")  ){
            currentBalance=giftCard-400;
            System.out.println("Sorry, not enough funds on your gift card!");
        } else if (item.equalsIgnoreCase("pants")) {
            currentBalance=giftCard-50;
            System.out.println("Thank you for your purchase!");
            System.out.println("Your current balance is: " + currentBalance + "$");
        } else if (item.equalsIgnoreCase("charger")) {
            currentBalance=giftCard-15;
            System.out.println("Thank you for your purchase!");
            System.out.println("Your current balance is: " + currentBalance + "$");
        } else if (item.equalsIgnoreCase("usbCable")) {
            currentBalance=giftCard-10;
            System.out.println("Thank you for your purchase!");
            System.out.println("Your current balance is: " + currentBalance + "$");

        } else if (item.equalsIgnoreCase("hat")) {
            currentBalance=giftCard-25;
            System.out.println("Thank you for your purchase!");
            System.out.println("Your current balance is: " + currentBalance + "$");
        } else if (item.equalsIgnoreCase("socks")) {
            currentBalance=giftCard-5;
            System.out.println("Thank you for your purchase!");
            System.out.println("Your current balance is: " + currentBalance + "$");
        } else if (item.equalsIgnoreCase("blanket")) {
            currentBalance=giftCard-60;
            System.out.println("Thank you for your purchase!");
            System.out.println("Your current balance is: " + currentBalance + "$");
        } else if (item.equalsIgnoreCase("pillow")) {
            currentBalance = giftCard - 40;
            System.out.println("Thank you for your purchase!");
            System.out.println("Your current balance is: " + currentBalance + "$");
        } else if (item.equalsIgnoreCase("headphones")) {
            currentBalance = giftCard - 30;
            System.out.println("Thank you for your purchase!");
            System.out.println("Your current balance is: " + currentBalance + "$");
        }else {
            System.out.println("Invalid item!");
        }
    }
}
