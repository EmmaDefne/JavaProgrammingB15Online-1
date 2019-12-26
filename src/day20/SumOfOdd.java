package day20;

public class SumOfOdd {

    public static void main(String[] args) {

        int sum = 0;
        for (int i = 10; i < 100; i++) {
            sum = sum + i;
            if (sum % 2 == 0) {  //sum%2==1 odd number
                System.out.println("even number " + i);
            } else {
                System.out.println("odd number " + i);
            }
        }
        System.out.println("sum=" + sum); //bunu koyacagin yer onemli for'u kapadiktan sonraki parantezden sonra koy

    }
}


