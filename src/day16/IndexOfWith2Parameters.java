package day16;

public class IndexOfWith2Parameters {
    public static void main(String[] args) {
                  //   012345678901234567890123456789012
       // String name = "I love Java I love Java Java Java";

        //get the second java from the sentence
        //assume you already know there is 4 java in this sentence
        // second java means --->> the java showed up after first Java

        //first find out where is location of the first java showed up
        //in order to find second one
        //instead of searching from begining
        //search from right after the location you found first java
        //then it will give you the index of second java

        //but how do I start from different location when using indexof
        //because indexof always start from begining

        //indexof method has 2 version 1 expect 1 eternal data
        //another expect 2 external data --->> yourstring.inexOf()

        //             012345678901234567890123456789012
        String name = "I love Java I love Java Java Java";

        System.out.println("Java starting from 0 " + name.indexOf("Java"));
        System.out.println("Java starting from 7 "+ name.indexOf("Java" ,7));
        System.out.println("Java starting from 8 " +name.indexOf("Java" ,8));
        System.out.println("Java starting from 9 " +name.indexOf("Java" ,9));
        System.out.println("Java starting from 12 " +name.indexOf("Java" ,12));
        System.out.println("Java starting from 14 " +name.indexOf("Java" ,14));
        System.out.println("Java starting from 20 " +name.indexOf("Java" ,20));
//how do I start from the location that get past first JAVA
        //basically starting point different that 0 so that I get past first java

        int firstJavaLocation = name.indexOf("Java"); //location of first java in this case 7
        //starting point can be right after the index of first character of the word
        //or you can start here +4
        //or you can start write after you finish the word you are searching, for the word java +4
        //if we do not know the lenght of the word -->  word.lenght()
        int startingPointToSearchSecondJava= firstJavaLocation +1; // bu ilk javadan sonraki javadan bahsediyor, java is 4 character
        int secondJavaLocation = name.indexOf("Java" , startingPointToSearchSecondJava);

        System.out.println("second Java Location=" + secondJavaLocation);

        //I do not know how many word in this sentence. I only know there 3+ words
        //and there is only one space in between words
        //i just want to know  what is the second word
        // the word in between first space and second space is second word

        int firstSpaceLocation = name.indexOf(" ");

        int secondSpace= name.indexOf(" ", firstSpaceLocation +1);
        System.out.println("second word in this sentence is" + name.substring(firstSpaceLocation+1,secondSpace));


    }
}
