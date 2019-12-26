package day31;

public class Calculator_V2 {
    public static void main(String[] args) {
        char operator = '*'; // it can be + - * /
        int num1 = 15;
        int num2 = 3;

calculate(9,9,'*');

      calculate(4,2,'-');


    }

    public static void calculate(int num1, int num2, char operator) {

        switch (operator) {

            case '+':
                System.out.println("Addition result is " + (num1 + num2));
                break;
            case '-':
                System.out.println("Substraction result is " + (num1 - num2));
                break;
            case '*':
                System.out.println("Multiplication result is " + (num1 * num2));
                break;
            case '/':
                System.out.println("division result is " + (num1 / num2));
                break;
            default:
                System.out.println("invalid");

        }
    }
}
