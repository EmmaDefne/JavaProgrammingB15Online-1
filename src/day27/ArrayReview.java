package day27;

import java.util.Arrays;

public class ArrayReview {

    public static void main(String[] args) {

int num=10;
int [] arr ={ 10,20,30,40,50,60};

int num1=arr[arr.length-1];
        System.out.println("num1 = " + num1);
        System.out.println("arr = " + Arrays.toString(arr)); // butun arrayi print etmek icin
        String str=Arrays.toString(arr); // yada bu sekilde once string olusturup yazabilirsin
        System.out.println("full array in string mode = " + str);

        for (int x = 0; x <arr.length ; x++) {
            System.out.print( arr[x] +"-");

        }
        }





    }

