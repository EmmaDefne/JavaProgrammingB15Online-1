package day31;

public class Calculator {
    public static void main(String[] args) {

        //create a static method that add
        //it accept 2 numbers and print the result of addition

        add(6,23);
        add(5,3);
        add(23,23);
        add3Numbers(3,5,2);
    }

    //a static method that has 2 int parameters
    public static void add(int num1, int num2 ){
        System.out.println("addition result " + (num1+num2));

    }
    public static void add3Numbers(int num1, int num2, int num3){
        System.out.println("addition result3 " + (num1+num2+num3));


    }
}
