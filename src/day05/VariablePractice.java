package day05;

public class VariablePractice {


    public static void main(String[] args) {
        // 8 primitive
        /*

        Block comment, everything in between will be seen as comment

        whole numbers   : byte, short, int, double
        fractional numbers : float, double
        logical : boolean (true , false)
        character : char ( single character in single quote )

        usually by default for whole numbers: just use int
        usually by default for fractional numbers: just use double

        IS String part of Primitive types? : NOOOO!!!!
        String is sequence of character
         */

        int birthYear = 1983;
                int currentYear = 2019;
                int age = currentYear - birthYear;
       // System.out.println("I was born in year  " + birthYear + ", and I am  " + (2019-1983)+ "years old");
         System.out.println("I was born in year  " + birthYear + ", and I am  " + age + "years old");

         int speedLimit = 55;
         int currentSpeed = 65;
       int  overTheLimit = currentSpeed - speedLimit;

        System.out.println(" my speed is  " + currentSpeed + "but I should have gone  " + (currentSpeed-overTheLimit));

        System.out.println("You are driving" + overTheLimit + "mph more than speed limit ");




    }
}
