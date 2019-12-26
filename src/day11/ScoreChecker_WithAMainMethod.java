package day11;

public class ScoreChecker_WithAMainMethod {
    public static void main(String[] args) {

        int score = 35;

        if ((score<100)){
            System.out.println("INVALID SCORE!!!");

        }else if (score==100){
            System.out.println("PERFECT SCORE!!!");

        }else if (score>70 && score<100){
            System.out.println("YOU HAVE PASSED!!!");

        } else if (score<20){
            System.out.println("Come to my office");
        }else if (score>30 && score<40){
            System.out.println("ATTEND ADDITIONAL CLASSES");
        }else if (score>40 && score<70){
            System.out.println("LITTLE BIT MORE STUDY WILL LET YOU PASSED");
        }else{
            System.out.println("YOU HAVE FAILED");

        }


    }
}
