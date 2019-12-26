package day31;

public class Voting {
    public static void main(String[] args) {

        checkEligibility(15);
        checkEligibility(54);
        checkEligibility(6);
//can not access the method parameter outside of the method

    }
// this method has one int parameter named age
    //whoever calling tgis method, need to provide a number
    // it will set the value of age into that number

    public static void checkEligibility (int age){
       // int age= 15;
        if (age>18){
            System.out.println(" You are eligible to vote");
        }else {
            System.out.println("You are not eligible");
        }
    }

}
