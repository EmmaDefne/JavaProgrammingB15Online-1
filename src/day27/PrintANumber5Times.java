package day27;

import java.util.Arrays;
import java.util.Scanner;

public class PrintANumber5Times {

    public static void main(String[] args) {
        //write a program that asks user to enter number 5 times
        //and store those numbers into array

        int[] numbers=new int[5];


        Scanner scan=new Scanner(System.in);


        for (int i = 0; i <5 ; i++) {
            System.out.println("Enter a number");

            int input=scan.nextInt();
            numbers[i]=input;

        }
        System.out.println("all numbers = " + Arrays.toString(numbers));

        //Arrays.sort(variableName): sort the array in ascending order

        Arrays.sort(numbers);

        int largestNumber=numbers[numbers.length-1];

        int minNumber = numbers[0];

        System.out.println("largestNumber = " + largestNumber);
        System.out.println("minNumber = " + minNumber);


    }


}
