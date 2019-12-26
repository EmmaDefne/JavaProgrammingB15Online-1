package day12;

public class CheckingStringEqualityWithoutCase {
    public static void main(String[] args) {
        String userName= "emeL";

        boolean userNameCorrect =userName.equals("emeL");

        System.out.println( userNameCorrect);

        boolean nameCheckIgnoreCase = userName.equalsIgnoreCase("emel");

        System.out.println(nameCheckIgnoreCase);
    }
}
