package day11;



        //CREATE a program to check whether myStr value equal to yourStr value
        //if true  correct word!!!
        //if false say java!!!
//baska ornek
       // String myStr = "Java";
        //if (myStr.equals("Java")) {
          //  System.out.println("CORRECT WORD!!!");
       // } else {
        //    System.out.println("SAY JAVA");
        //

        //UPDATE this program to add more condition
        //using else if in the middle

        /*

      *check the value of myStr
      if it is Java ===>> correct word
      if it is Cava ---->>> Pumpkin!!!
      else say NOT JAVA NOR PUMPKIN
         */


   import java.util.Scanner;
    public class StringEqualityPractice_Condition {
        public static void main(String[] args) {
            System.out.println("Please write Java or Cava ? ");
            Scanner bulut = new Scanner(System.in);
            String myStr = bulut.next();
            String yourStr = new String("Java");
            String crazyStr = new String("Cava");
            if (myStr.equals(yourStr)) {
                System.out.println("Correct Word! ");
            } else if (myStr.equals(crazyStr)) {
                System.out.println("Pumpkin! ");
            }
            else {
                System.out.println("Not Java Nor Pumpkin ");
            }
        }
    }










