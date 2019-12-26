package day15;

public class SubStringPractice {
    public static void main(String[] args) {

        //getting the part of the string out of another string
        //             0123456789012345
        String movie= "Lord Of The Ring";
        //I want to get the word <Of> from this movie
        String wordOf= movie.substring(5,7);
        System.out.println("wordOF="+ wordOf);
        //sub string will return part of another string
        //starting from beginning index until right before ending index

        String wordThe=movie.substring(8,11);
        System.out.println("wordThe=" + wordThe);

        //Get from the second word till last word
        //                0123456789012345
        // String movie= "Lord Of The Ring";
        int startingPoint = movie.indexOf(" ") + 1;
        int endingPoint = movie.length()-1;
        System.out.println("second word till last:" +movie.substring(startingPoint,endingPoint));

        String secondWordTillLast= movie.substring(5,16);
        System.out.println("second Word TillLast ="+ secondWordTillLast);

        //if you want to start from somewhere and just get the rest of the string
        //above method will work, however there is even better method
        // if you provide only one parameter to substring method
        //it will just start from that location and get till the end
        String secondToLast =movie.substring(5);

        //with this in mind: TASK REVERSE
        //YOU KNOW THE INDEX ALREADY
        //String movie="Lord of The Ring" ;
        //turn--->>> lord of the ring ---->> ring of the lord
        System.out.println(movie.substring(12,16)+" "+movie.substring(5,11)+" "+movie.substring(0,4));

        //bunu bu sekildede yapabilirsin, bende baglanti oldugu icin tek satirda yaptim
//    String movie = "Lord Of The Ring";
     //  String wordThe = movie.substring(8, 11);
       // String wordRing = movie.substring(12, 16);
       // String wordLord = movie.substring(0,4);
      //  System.out.println(wordRing +" "+ wordOf+" " + wordThe+" " + wordLord);

//------------------------------------

        //turn ----> lord of the ring ----> ring of the Java Lord
       // System.out.println(wordRing + wordThe + "Java"+ wordLord); //kapali koda gore yazdim




    }
}
