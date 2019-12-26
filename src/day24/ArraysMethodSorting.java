package day24;

import java.util.Arrays;

public class ArraysMethodSorting {
    public static void main(String[] args) {
        int[] scores = {2, 44, 4, 17, 19, 3};

        System.out.println(Arrays.toString(scores));
        System.out.println("original first item value : " + scores[0]);
        //for sorting an array in ascending order -- low to high
        //sort --->>> Arrays.sort(yourArrayHere)

        Arrays.sort(scores);

        //so what happen to my original order ??? GONE!!!
        //CAN I get it back? NO!!!!
        //the original index of items has changed

        System.out.println(Arrays.toString(scores));
        //first item value //en kucuk sayiyi kastediyor
        System.out.println("new first item value : " +scores[0]);

        char[] nameChars={'G',' ','d','Z','C'}; //symbols first, numbers second, letter last, small letter last
        System.out.println("before sorting nameChars = " + Arrays.toString(nameChars));
        Arrays.sort(nameChars);
        System.out.println("after sorting nameChars = " + Arrays.toString(nameChars));
    }


}
//sort method does not work for boolean array
//java tanimlamamis
