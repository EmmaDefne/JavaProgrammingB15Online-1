package day20;

public class reversingAString {
    public static void main(String[] args) {
        //given a string variable name with value
        //reverse this name and store reversed value into
        //another string variable reversedName

        String name="jon snow";
        String reversedName="";

        int lastChartIndex=name.length()-1;

     /*   System.out.print(name.charAt(7));
        System.out.print(name.charAt(6));
        System.out.print(name.charAt(5));
        System.out.print(name.charAt(4));
        System.out.print(name.charAt(3));
        System.out.print(name.charAt(2));
        System.out.print(name.charAt(1));
        System.out.print(name.charAt(0));        */

        System.out.println();
        for (int x = 7; x >=0 ; x--) {
            System.out.print(x +"index: ");
char currentChar=name.charAt(x);
System.out.println(currentChar);

reversedName=reversedName+currentChar;

        }
        System.out.println("reversedName=" +reversedName);

    }
}
