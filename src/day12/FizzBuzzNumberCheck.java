package day12;

import java.util.Scanner;

public class FizzBuzzNumberCheck {
    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);

        int number = input.nextInt();

        if (number%5==0 && number%3==0 ){
            System.out.println("FizzBuzz Number");
        } else if (number%3==0 ){
            System.out.println("Buzz Number");
        }else if (number%5==0){
            System.out.println("Fizz number");
        }else {
            System.out.println("It is not FizzBuzz Number");
        }

    }
}
