package day12;

public class CheckingStringEqualityWithoutCase2 {
    public static void main(String[] args) {
        String name= "Emre";
        //I want to store the result of checking name into a variable

        boolean nameEqualsWithoutCase= name.equalsIgnoreCase("emre");
        System.out.println("does this name has same character without caring about the case");
        System.out.println(nameEqualsWithoutCase);
        System.out.println(name.equalsIgnoreCase("eMrE"));

        System.out.println(name.equalsIgnoreCase("abc"));
    }
}
