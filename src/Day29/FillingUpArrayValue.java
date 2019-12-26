package Day29;

import java.util.Arrays;

public class FillingUpArrayValue {


    public static void main(String[] args) {
        
        //create an int array with size 100 and fill it up as below
        
        int[] numbers=new int[100];
        // 100 tane item koymus olduk, bunlari declare etmedigimiz
        // icin 0 kabul ediyor.100 tane 0 print eder

        System.out.println("Before filling up \n = " + Arrays.toString(numbers));

        //bunlarin icini tek tek dolduramayiz numbers[0]=1; gibi gibi
        //o yuzden for loop kullanacagiz

        for (int x = 0; x <numbers.length ; x++) {
            numbers[x]=x;

        }
        System.out.println("After filling up \n = " + Arrays.toString(numbers));

    }
}
