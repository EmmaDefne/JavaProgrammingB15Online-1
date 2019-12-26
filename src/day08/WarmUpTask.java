package day08;

import java.util.Scanner;

public class WarmUpTask {

    public static void main(String[] args) {

        /*
         * Voting eligibility program
         * create a variable called age as int
         * check whether this age is more than 18
         * if yer print: you are ready to vote!!
         * if it's less 18 print wait until you are 18
         * */


        int age = 27;
        System.out.println(age >= 18);
        if (age >= 18) {
            System.out.println("You are eligible for voting! ");

        } else {

            System.out.println("wait until you are 18!");
        }

        }

    }

