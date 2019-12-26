package day26;

import java.util.Arrays;

public class ReverseAnArayBySwapping {

    public static void main(String[] args) {
        //                          0,1,2 ,3,4,5, 6
        int [] myNumbers=new int[]{ 5,3,21,2,1,13,8};
        int size=myNumbers.length;
        int lastIndex=size-1;
        int middleIndex=size/2; //3

        //just to see whats inside, we are not doing anything with string
        System.out.println(Arrays.toString(myNumbers));

        //first and last
        System.out.println(myNumbers[0] + "----" + myNumbers[lastIndex]);
        //second and one before last
        System.out.println(myNumbers[1] + "-----" + myNumbers[lastIndex-1]);
        //third one and two before last
        System.out.println(myNumbers[2] + "----" + myNumbers [lastIndex-2]);


//loop this
        System.out.println("------loop here----");
        for (int x = 0; x < middleIndex; x++) {
            //                  first number to swap       second number to swap
            System.out.println("before swamp " + myNumbers[x] + "----" + myNumbers[lastIndex-x]);
            int temp=myNumbers[x];
            myNumbers [lastIndex-x]=myNumbers[x];
            myNumbers[x]=temp;


        }
        System.out.println("after swap complete" + Arrays.toString(myNumbers));
    }
}
