package replIt;


import java.util.Scanner;

public class OverDoseFormula33 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int input, mg;

        System.out.println("Enter number of milligrams in drink:");
         input=scan.nextInt();

mg=10000/input;
        System.out.println("It would take about " + mg + " drinks for a lethal overdose.");

        }
}
/**
 *


 Scientists estimate that roughly 10 grams of caffeine consumed at one time is a
 lethal overdose.

 Write a program with a variable that holds the number of milligrams of caffeine in a drink and outputs how many drinks it takes to kill a person.

 In one gram there is 1000 mg.

 Please refer to the image above as an example and use any number of variables you want.
 Dots mean space in the image.*/
