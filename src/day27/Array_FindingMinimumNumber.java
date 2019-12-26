package day27;

public class Array_FindingMinimumNumber {

    public static void main(String[] args) {
        //write a program that can find the minimum number for an array
        //do not use sort method
        //write a program can find the second  minimum number
        // and then


        int[] scores= { 100,877,2,344,1,3,5,66,777};
        int min=999999;
        for (int i = 0; i <scores.length ; i++) {
            if (min>scores[i]){
                min=scores[i];
            }
        }
        System.out.println("min = " + min);



        int secondMin=scores[0]; //ikinci numarayi bulman icin 1. ciyi skip etmen lazim,
        //bu yuzden continue yu kullanman lazim
        for (int i = 0; i <scores.length ; i++) {
            if (scores[i]==min){
                continue;
            }
            if (secondMin>scores[i]){
                secondMin=scores[i];

            }

        }
        System.out.println("secondMin = " + secondMin);
        //third minimum number
        int thirdMin= scores[0];
        for (int i = 0; i <scores.length ; i++) {
      if (scores[i]==min || scores[i]==secondMin){
          continue;
      }
          if (thirdMin>scores[i]){
              thirdMin=scores[i];

          }
        }
        System.out.println("thirdMin = " + thirdMin);
    }
}
