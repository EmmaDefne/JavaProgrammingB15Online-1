package day21;

public class SearchingInString {

    public static void main(String[] args) {

        String myName= "Emel elif";

        int charCount= myName.length();
        System.out.println("charCount=" + charCount);
        int lastCharIndex= charCount-1;
        System.out.println("lastCharCount" +lastCharIndex);

        //find out index of all the letter a in cases insensitive manner
        // I will go through each and every letter of the string -
        //           --->> each character i can use substring (0,1) and so on
        //           ----->> going to 0 to last index --->>> for loop
        //while i am going through each and every character
        //i will check whether current character i am looking at
        //equals to a or A ---->>> currentCharacter.equalsIgnorecase("a")
        //if it is I will print the index println(the variable you use to keep the index)
        //if not --->> just move on
        //perform this action until I reach last character if i go over last character index i stop



        System.out.println(" -----1 char----");
        for (int x = 0; x <=lastCharIndex; x++) {
            String currentChar=myName.substring(x,x+1);

            if (currentChar.equalsIgnoreCase("e") ){
                System.out.println("The index of e or E is" + x); //kacinci charda oldugunu soyluyor
            }


        }


    }
}
