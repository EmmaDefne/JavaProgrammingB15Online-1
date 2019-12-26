package day13;

public class WarmUp_AmazonShippingCalculator {
    public static void main(String[] args) {


        /*
        amazon has 2 type of user one is prime member and another is regular member
        prime member get free shipping in all purchase no matter the amount
        regular member user get free shipping only if their purchase is more than $25
        otherwise they get 5$ shipping fee
         */


        String memberType= " prime member  ";
        double amount=45.99d;
        int shippingFee = 0;
        if (memberType.equalsIgnoreCase("PRIME MEMBER")) {
            System.out.println("YOU GET 1 DAY FREE SHIPPING!!!");
            System.out.println(" Your final price is" + amount);
            //} else if (amount>25){
        }else if (!memberType.equalsIgnoreCase("PRIME MEMBER")){
            System.out.println("NOT A PRIME MEMBER BUT YOU ORDER IS MORE THAN 25");
                System.out.println("YOU GET FREE SHIPPING ON AMOUNT" + amount);
        }else {
            System.out.println("DO YOU WANNE SIGN UP FOR PRIME MEMBERSHIP");
            shippingFee = 5;
            amount= amount+shippingFee;  //amount+=shippingfee de yazabilirsin
            System.out.println("YOUR FINAL AMOUNT IS "+ amount);
        }
    }
}
