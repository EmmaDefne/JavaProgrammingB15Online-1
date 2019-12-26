package replIt;

import java.util.Scanner;

public class GiftCard {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        String item=scan.nextLine();


        int giftCard=100;

       int  smartPhone = 300;
       int  laptop = 400;
       int  charger = 15;
        int  usbCable = 10;
        int headphones =30;
        int pants= 50;
        int hat =25;
        int socks =5;
        int blanket=60;
        int pillow=40;

if (item.equals(smartPhone) && item.equals(laptop)){
    System.out.println("Sorry, not enough funds on your gift card!");

}else if (item.equals(hat)){
    System.out.println("Thank you for your purchase!");
    System.out.println("Your current balance is:" + (giftCard-hat)+ "$");
}else if (item.equals(charger)){
    System.out.println("Thank you for your purchase!");
    System.out.println("Your current balance is:" + (giftCard-charger)+ "$");
}else if (item.equals(usbCable)){
    System.out.println("Thank you for your purchase!");
    System.out.println("Your current balance is:" + (giftCard-usbCable)+ "$");
}else if (item.equals(headphones)){
    System.out.println("Thank you for your purchase!");
    System.out.println("Your current balance is:" + (giftCard-headphones)+ "$");
}else if (item.equals(pants)){
    System.out.println("Thank you for your purchase!");
    System.out.println("Your current balance is:" + (giftCard-pants)+ "$");
}else if (item.equals(socks)){
    System.out.println("Thank you for your purchase!");
    System.out.println("Your current balance is:" + (giftCard-socks)+ "$");
}else if (item.equals(blanket)){
    System.out.println("Thank you for your purchase!");
    System.out.println("Your current balance is:" + (giftCard-blanket)+ "$");
}else if (item.equals(pillow)){
    System.out.println("Thank you for your purchase!");
    System.out.println("Your current balance is:" + (giftCard-pillow)+ "$");
}else {
    System.out.println("Invalid item!");
}
        }
    }

