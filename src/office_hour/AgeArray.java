package office_hour;

import java.util.Arrays;

public class AgeArray {
    public static void main(String[] args) {
     //               0    1  2  3   4
        int[] ages = {23, 43, 5, 7, 87};
        System.out.println(ages[2]);
        System.out.println(ages[4]-ages[3]);

        for (int ageOfStudent : ages) {
            System.out.println("this students age " + ageOfStudent );

            //int ageOfStudent=23
           // System.out.println("this students age " + ageOfStudent );bunu 5 kez yapmaktan kurtuluyoruz.
        }
        System.out.println(Arrays.toString(ages));// [] icinde veri verir.

    }

}
