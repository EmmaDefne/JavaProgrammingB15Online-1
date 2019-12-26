package day07;

public class IntroToIfStatement {

    public static void main(String[] args) {

        int score = 79;

        // if (PUT YOUR CONDITION HERE     ) {

        //do this if the condition is true

        //} else{
        //do this if it is not true
        // }

        System.out.println( score > 60 ); // int score 70 yapmistik o zaman denklem dogru oldugu icin chocolate for you cikiyordu outputta ama 59 yaptik olmadi
        if (score > 60 ) {
            System.out.println(" CHOCOLATE FOR YOU!!");
        } else {
            System.out.println( " try harder next time !! no tv, no phone, DO NOT GIVE UP ");
        }
        System.out.println(" THE END");

    }
}
