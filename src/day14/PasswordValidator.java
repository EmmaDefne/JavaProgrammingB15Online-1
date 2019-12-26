package day14;

public class PasswordValidator {
    public static void main(String[] args) {

        String password = "Abdullah_$";

        //PASSWORD VALIDATOR

    //minimum 8 characters max 16 character
    //password.lenght() >=8 && password.lenth() <=16
    boolean min8max16 = password.length()>=8 && password.length()<=16;
    //it must contains _ or $
    // password.contains("_") || password.contains("$")
    boolean mustContains_or$= password.contains("_" ) || password.contains("$");

    //it must not contains space
    //password.contains(" ")
        boolean mustNotContainsSpace =!password.contains(" ");

    //it must start with Ab
        boolean startWithAb =password.startsWith("Ab");
    //password.startWith ("Ab")


    //if any of above condition does not match say invalid password
    //else say good password!



if (min8max16 && mustContains_or$ && mustNotContainsSpace && startWithAb){
    System.out.println("VALID PASSWORD");
} else {
    System.out.println("INVALID PASSWORD");
}


    }



}
