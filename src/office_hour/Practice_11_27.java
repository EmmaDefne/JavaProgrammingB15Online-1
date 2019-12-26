package office_hour; //DUKKANDAYDIM HICBIR SEY ANLMADIM

public class Practice_11_27 {
    public static void main(String[] args) {
        String message ="  I LOVE JAVA  ";
       // System.out.println("messageTrimmed = <" + message + ">");//tamamla

        String emptySpaces= "       " ;
        System.out.println("emptySpaces = < " + emptySpaces + ">");
        String emptySpacesAfterTrimmed = emptySpaces.trim();

//tamamla ve anla

        //isEmpty VS isBlank method from String class
        //isEmpty --->> yourString.lenght()>0 true else it's false
        //isBlank ---->> if you have anything other than white spaces, get true, else get false

        System.out.println("emptySpaces is blank or not?? =  " + emptySpaces);

//indexOf --->> give you location of the string you are looking for inside anotherString
        // for example yourString.indexOf("abc")                0122382038203820
        //copied from above so we can see what we have ---->> String message = " I LOVE JAVA "
        int lovationOfLove = message.indexOf("LOVE");
        System.out.println("lovationOfLove = " + lovationOfLove);


    }
}
