package day16;

public class Task1_WakeUpTest_Reverse {
    public static void main(String[] args) {

        String word1= "Java";
        String word2= " " ;

        //in order to reverse a word, we need to take last character and put in first character
        // then put the second character at 1 locatipn before first character
        //start getting character from last location till first location then save it
        //word2= word2+ word1.charAt(3) + word1.charAt(2)+word1.charAt(1)+ word1.charAt(0); bunu asagidaki gibi yaz daha guzel olur
        word2 += word1.charAt(3) + " " + word1.charAt(2)+ " " + word1.charAt(1)+ " "+ word1.charAt(0);

        System.out.println("word2 = " + word2);

    }
}


