package day25;

import java.util.Arrays;

public class CheckArrayIsSortedOrNot2 {

    public static void main(String[] args) {
        //int[] nums = {13,31,8,5,21,2} ;
        int[] nums = {1, 2, 3, 4, 5, 6};
        System.out.println("nums = " + Arrays.toString(nums));
        System.out.println("num s = " + Arrays.toString(nums));

        // CREATE A VARIABLE CALLED isSortedAlready and assign value of true ;
        // I ASSUME THE ARRAY IS ALREADY SORTED
        // AND IF IT'S NOT THEN I CHANGE the value of isSortedAlready to FALSE
        boolean isSortedAlready = true;
        //boolean isSortedAlready = true;

        for (int x = 0; x < nums.length - 1; x++) {
            //System.out.println( nums[x] + " " + nums[x+1]);

                if (!(nums[x] < nums[x + 1])) {
                    System.out.println("ARRAY IS NOT SORTED , NO POINT CHECKING THE REST");
                    isSortedAlready = false;
                    //isSortedAlready = false;
                    break;
                }
            }
            System.out.println("isSortedAlready = " + isSortedAlready);
            //System.out.println("isSortedAlready = " + isSortedAlready);

        }
    }

