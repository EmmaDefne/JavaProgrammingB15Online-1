package day10;

public class Calculator {
    public static void main(String[] args) {

        //create a class calculator with main
        //create a variable called operator with the char
        //assign the value for one of these 4:+-*
        //use switch statement to do following logic

        char operator='*';

        switch (operator){
            case '+': //char oldugu icin tek ' ' kullandik
                System.out.println("You are about the add numbers");
                break;
            case'-':
                System.out.println("You are about the subsract numbers");
                break;
            case'*':
                    System.out.println("You are about to multiply numbers");
                break;
            case '/':
                System.out.println(" You are about to divide numbers");
                break;
            default:
                System.out.println("invalid operator");
        }
    }
}
