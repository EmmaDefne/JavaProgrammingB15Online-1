package day11;

public class ScoreChecker {
    public static void main(String[] args) {

        int score = 70;
        if ( score<0 || score>100){  //score is less than 0 or more than 100
            System.out.println("INVALID SCORE!!!");
        } else if (score==100){
            System.out.println("PERFECT SCORE");
        }else if (score>=70 && score<100){  //if the score is between 70-100
            System.out.println("passing score!!");
        }else {
            System.out.println("you have failed this exam ! ");
        }
    }
}
