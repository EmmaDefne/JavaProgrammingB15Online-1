package day11;

public class LogicalNotOperator {
    public static void main(String[] args) {
        //logical not operator ! exclamation mark used to negate the boolean value
      //  System.out.println( true);
      //  System.out.println(false);

        System.out.println("result of ! true --->>");
        System.out.println(!true);  //flip the coin and make it false
        System.out.println("result of ! false --->");
        System.out.println(!false); //!bu isaret tam tersini yansitiyor

        boolean isRecording = false;
        System.out.println("result of ! isRecording --->>");
        System.out.println(! isRecording);

        //third you can it in front of a boolean expression
        //boolean expression is any expresion that result in a boolean value
        //for example 7>5 , x>10 ,y==20 , x<=100,x>y, x>10 &&x<100
        System.out.println("result of !(7>5)");
        System.out.println(!(7>5)); // 7 5 ten buyuktur dogru ama basina koydumuz ! bunu tersine ceviriyor

       //int x=10;
       // System.out.println("result of !(x>10)");
        // System.out.println(!(x>10));


        int x=7;
        System.out.println("result of (x>10)");
        System.out.println(x>10);
        System.out.println("result of !(x>10)");
        System.out.println(!(x>10));

    }
}
