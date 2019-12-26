package day19;

public class SumOfAllNumbersWithinTheRange {
    public static void main(String[] args) {
        //get the sum of numbers from 1-10
        //it is interesting 1+2+3+4+5+6+7+8+9+10) how much is it?

        //when we loop from 1 to 10

        int sum= 0;     //nothing has been added yet so 0
        //sum=sum+1
        //sum=sum+2
        //sum=sum+3
//burda her defasinda mesela once 1 ekliyor, sonra 2 sonra 3 boyle 10 a kadar devam ediyor.
        for (int i = 1; i <=10 ; i++) {
            //System.out.println(i);
            sum=sum+i;
            System.out.println(sum);

        }

        }






    }