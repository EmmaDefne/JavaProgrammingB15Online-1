package day21;

public class NameBreakerWithString {

    public static void main(String[] args) {

        String name= " Huseyin";
        for (int i = 0; i <name.length() ; i++) {
            String currentChar= name.substring(i,i+1);
            if (currentChar.equalsIgnoreCase("y")){
                System.out.println("found it!!");
                break;
            }
            System.out.println(currentChar);
        }
    }
}
