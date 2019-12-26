package day07;

public class Casting {
    public static void main(String[] args) {

       // int num = 10;
        //implicitly (automatically) converted to double 10.0
        //and stored inside bigNum behind scene

        double bigNum = 10;

        System.out.println(bigNum);


        //12.99 is double, double has much bigger range than int
        //so it just does not fot
           //int num=12.99; // compiler error!!!

       int num= (int) 12.99; //kusurat oldugu icin int kullanamazsin uzerine tikladik cast to int yaptik ama bu seferde 99 centi dusurdu yazmadi


        System.out.println(num);

        //create a long variable and store int
        long earthToMoon = 10000;  //--->>> 10000L
        //create an int variable and try to store above long value
       // System.out.println(earthToMoon);

int earthToMoonIn_int = (int) earthToMoon;
        System.out.println(earthToMoonIn_int);

    }
}
