package day10;

public class MultiBranch_WithSwitch {
    public static void main(String[] args) {
        String order="";
        int itemNumber =8;
        System.out.println("Welcome to McDonald, what can I get for you");

        //what data type of variable I can use her e
        //byte, short, int,char. string
        switch (itemNumber){
            case 11:
                System.out.println("You have selected 11");
                order ="Burger";
                break; //if break does not show up here it will just move on to next case

            case 5:
                System.out.println("You have selected 5");
                order =" French Fries";
                break;

            case 8:
                System.out.println("You have selected 8");
                order = " Nugget";
                break;
            case 35:
                System.out.println("You have selected 8");
                order="Ice cream";
                break;
            default:
                System.out.println("You have selected unknown item number@");
                order="unknown";
                break;
        }
        System.out.println("your order is " +order);





    }
}
