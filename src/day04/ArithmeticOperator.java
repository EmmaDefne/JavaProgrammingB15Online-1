package day04;

public class ArithmeticOperator {

    public static void main(String[] args) {

        //arithmetic operator between two int -->> another int

        System.out.println( 5 + 3 );
        System.out.println( 5 - 3 );
        System.out.println( 5 * 3 );
        System.out.println( 5 / 3 );


        //arithmetic operator between two numerical data type
        // the final result will be larger data type
        System.out.println( 5 + 3.0d );
        System.out.println( 5 - 3.0d );
        System.out.println( 5 * 3.0d );
        System.out.println( 5 / 3.0f );

        //store above numbers in variables
        //and replace above statements with variables instead
        //dataType result1 + the calculation here
        //System.out.println (result1);



        int a = 10;
        float b = 3.00f;
        float divide =a/b;
        System.out.println(divide);


        // int result1 = 6 + 4 - 2 / 2;
     //    System.out.println(result1);


        int num1 = 5;
        double num2 = 3.0d;
        float num3 = 3.0f ;

        double result1 = num1 + num2 ;
        double result2 = num1 - num2 ;
        double result3 = num1 * num2 ;
        double result4 = num1 / num2 ;
        float result5 = num1 / num3 ;

        System.out.println(result1);

        System.out.println(result2);
        System.out.println(result3);
        System.out.println(result4);
        System.out.println(result5);


//celsius = (5.0/9)* ( fahrenheit - 32)

        int fahrenheit = 32;
                double celsius = 5.0/9;
        System.out.println(fahrenheit / celsius);

    }
}
