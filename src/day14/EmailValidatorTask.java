package day14;

public class EmailValidatorTask {

    public static void main(String[] args) {

        String email = "emel@yahoo.com";

       // boolean notContainAtCharacter = !email.contains("@");
      //  boolean containSpace = email.contains(" ");
       // boolean endsWith = email.endsWith("@gmail.com");
        //boolean endsWith2 = email.endsWith("@yahoo.com ");
        //boolean endWith3 = email.endsWith("@mail.ru");

    if (!email.contains("@")|| email.contains(" ")) {
        System.out.println("invalid email");
    }else if (email.endsWith("@gmail.com")){
        System.out.println("Google Mail");
    }else if (email.endsWith("@yahoo.com")){
        System.out.println("Yahoo mail");
    }else if (email.contains("@mail.ru")){
        System.out.println("Russian mail");
    }
}
    }