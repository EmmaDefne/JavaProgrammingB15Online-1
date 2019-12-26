package day27;

public class FindingBiggestNumberInArray {
    public static void main(String[] args) {
        /*
        TASK: write a program that returns the maximum number from an array
        do not use sort method
         */

        int[] numbers = {100, 900, 99999, 828, 2, 23, 44};
        int max = numbers[0];

        for (int i = 0; i < numbers.length; i++) {
            if (max < numbers[i]) {
                max = numbers[i];
            }
        }
        System.out.println("max = " + max);
        int secondMax = numbers[0];
        for (int i = 0; i < numbers.length; i++) {
            if (secondMax < numbers[i] && numbers[i] != max) { // birinci buyuk numaraya esit olmamali
                secondMax = numbers[i];
            }
        }
        System.out.println("secondMax = " + secondMax);
    }
}

