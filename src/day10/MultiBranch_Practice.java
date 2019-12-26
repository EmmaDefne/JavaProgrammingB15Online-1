package day10;

public class MultiBranch_Practice {
    public static void main(String[] args) {
        System.out.println("Welcome to McDonald, what can I get for you");


        //5, french fries
        //35;ice cream
        //8, nuggets


        String order = "";
        int itemNumber= 35;
        if (itemNumber==11){
            System.out.println("You have selected 11");
            order ="Burger";
        } else if (itemNumber==5){
            System.out.println("You have selected 5");
            order =" French Fries";
        } else if (itemNumber==8) {
            System.out.println("You have selected 8");
            order = " Nugget";
        } else if (itemNumber==35) {
            System.out.println("You have selected 35");
            order = "Ice cream";
        }else {
            System.out.println("You have selected unknown item number@");
            order="unknown";
        }
        System.out.println("your order is " +order);
    }
}
