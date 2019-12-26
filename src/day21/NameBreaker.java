package day21;

public class NameBreaker {

    public static void main(String[] args) {

        String name = "SerKan";

        for (int i = 0; i < name.length(); i++) {

            char currentChar = name.charAt(i);

            if (currentChar == 'k' || currentChar=='K') {
                System.out.println("found it!");
                break;


            }
            System.out.println(currentChar);

        }

    }
}




