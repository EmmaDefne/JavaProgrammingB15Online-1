package day14;

public class StringReview {
    public static void main(String[] args) {
        String str = "I like Pumpkin";

        System.out.println("str = " + str);
        //System.out.print(str.equals("pumpkin"));
        //contains:
        // it checks whether a string exists in another string

        System.out.println("does it contains Pumpkin:");
        System.out.println(str.contains("Pumpkin"));

        boolean gotPumpkin = str.contains("Pumpkin");  //true

//shortcut to print variable value in nice format soutv+enter
        System.out.println("gotPumpkin = " + gotPumpkin);

        //startsWith endsWith
        //check whether a string start with another string
        //check whether a string end with another string
        //and return true or false result


boolean startedWithI = str.startsWith("I");
        System.out.println("startedWithI = " + startedWithI);
        boolean endWithPumpkin=str.endsWith("Pumpkin");
        System.out.println("endWithPumpkin = " + endWithPumpkin);

        //PASSWORD VALIDATOR
        //minimum 8 characters max 16 character
        //it must contains _ or $
        //it must not contains space
        //it must start with Ab





    }
}
