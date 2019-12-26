package day15;

public class StringCaseInSensitiveCheck {
    public static void main(String[] args) {
        String name= "Arya Stark";

        System.out.println( "name contains st  RESULT IS:" + name.contains("st") );

        // "//I wanna check whether this name contains st no matter the case
        // so I want to store the uppercase version of this name then check for ST

        String upperCaseName= name.toUpperCase(); //"ARYA STARK"
        System.out.println("upperCaseName contains ST or not?" + upperCaseName.contains("ST"));

        String lowerCaseName= name.toLowerCase(); //"arya stark" ;
        System.out.println("lowerCaseName  contains st or not? " + lowerCaseName.contains("st"));

        //this is called method chaining, combinig multiple method call
        //make my name all lowercase (string) then check whether it contains lowercase st
////THIS WORK BECAUSE name/toLowerCase () result in another string object
        System.out.println( name.toLowerCase().contains("st"));
      //   System.out.println(name.length().toUppercase());BAD IDEA


    }
}
