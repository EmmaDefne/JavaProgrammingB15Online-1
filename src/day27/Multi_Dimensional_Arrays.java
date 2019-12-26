package day27;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Multi_Dimensional_Arrays {
    public static void main(String[] args) {
        /*

        SINGLE DIMENSIONAL ARRAY; Contains values
        int[] arr={1,2,3};

        MULTI-DIMENSIONAL ARRAY: an array that can contain array
        N dimensional array contains (N-1) dimensional array

        ex: 2 dimensional array: contains 1 dimensional arrays
        int[][] arr2d={  { }  {   }  }
         */
int [] arr1D={1,2,3};

        //2D array: is an array that contains single dimensional arrays
int[][] arr2D ={ {1,2,3} , {4,5,6} } ;
        //INDEX:
        System.out.println("arr2D = " + arr2D.length);
        System.out.println(Arrays.toString(arr2D[0]));
        System.out.println(Arrays.toString(arr2D[1]));

        //arr2D[0][2] ==> 3'u elde etmek icin

        System.out.println(arr2D [0][2]); //returns int value

        //print 5: arr2D[1][1] 5 i bastirmak icin
        System.out.println(arr2D[1][1]);
        //System.out.println(Arrays.toString(arr2D)); //array.tostring only applicable to single array

        //Arrays.deepToString(multi-D Arrays):  print all array

        System.out.println(Arrays.deepToString(arr2D));






    }
}


