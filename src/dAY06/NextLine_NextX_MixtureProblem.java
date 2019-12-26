package dAY06;

import java.util.Scanner;

public class NextLine_NextX_MixtureProblem {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println(" What is your name?");
        String name =scan.nextLine();
        System.out.println("Your name is  " + name);
        //nextline yaptigimizda birden fazla kelime girebiliyoruz

        System.out.println(" What is your age?");
      int age =scan.nextInt();
        //String age = scan.nextLine();
        //notice we are not storing this into variable
        //we just want below line to capture ENTER keyboard input
        //so that it does not accidentally get captured by
        //the nextLine we use capture address
        scan.nextLine();  //Bu satiri yazmazsan kod birden bitiyor burasi onemli

        System.out.println("Your name is " + age);

        System.out.println(" What is the address?");
        String address = scan.nextLine();
        System.out.println(" Your address is " + address);

    }
}
