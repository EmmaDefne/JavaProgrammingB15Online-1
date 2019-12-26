package day24;

import java.util.Arrays;

public class DoubleArray {

    public static void main(String[] args) {

// create an double array of 3 items ; and put 3 value
// get a string representation out of this array and save it as pricesString
// print each and every character in this String  in this format
//  character at index 1 is :  yourCharacterHere
//  character at index 2 is :  yourCharacterHere and so on all the way till last

        Double [] prices={ 9.99, 10.99, 11.99};
        System.out.println("Arrays.toString(prices)result" + Arrays.toString(prices));
        //since the moethod give you back a string representation of array object
        //in this format [first item, second item, third item.... last item]
        //i can save it into string variable

        String pricesString= Arrays.toString(prices);
        System.out.println("priceString " + pricesString);

        //we are looping over a string not an array so we after at last character finishes

        for (int i = 0; i <pricesString.length() ; i++) {
            System.out.println("character at index " + i+ "is: " +  pricesString.charAt(i));
            
        }

    }
}
