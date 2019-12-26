package replIt;

import java.util.Scanner;

public class VendingMachineFormula {
    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);
        int itemPrice,quarters,dimes,nickel, bozukluk,change;

        System.out.println("Enter price in cents:");
        itemPrice=scan.nextInt();

        change= 100-itemPrice;
        quarters=change/25;
            bozukluk=change%25;
        dimes=bozukluk/10;
        nickel=(bozukluk%10) /5;

        if (itemPrice>25 && itemPrice<100) {
            if (itemPrice % 5 == 0) {
                System.out.println("Your change is " + quarters + " quarters" + "," + dimes + " dimes" + "," + " and" + nickel + " nickel.");
            } else {
                System.out.println("Invalid price!");
            }
        } else if  (itemPrice<25 || itemPrice>100 || itemPrice/5 !=0){
                System.out.println("Invalid Price!");
            }
        }



    }

