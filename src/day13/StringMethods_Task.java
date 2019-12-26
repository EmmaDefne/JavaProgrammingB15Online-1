package day13;

public class StringMethods_Task {
    public static void main(String[] args) {

        //task
        //store your name into a variable
        //print your name in all uppercase "my name is : yourname"
        //you may optionally concatenate "my name is : yourname"

        String s1="emel";
        System.out.println("my name is:" + s1.toUpperCase());
        System.out.println("my name is:" +s1.toLowerCase());
        System.out.println(s1.equalsIgnoreCase("EMEL") );
        System.out.println(s1.equals("EMEL"));

        //IN ORDER TO GET HOW MANY CHARACTER WE HAVE INSIDE STRING
        //WE CAN USE LENGHT METHOD OF STRING

      // System.out.println(s1.length()); //emel kelimesinde kac karakter var onu soyluyor
       // System.out.println("0.index :" + s1.charAt(0)); //ilk harfini veriyor
       //* System.out.println("1.index :" + s1.charAt(1));
       // *System.out.println("2.index :" + s1.charAt(2));
      // / System.out.println("3.index :" + s1.charAt(3));



    }
}