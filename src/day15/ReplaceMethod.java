package day15;

public class ReplaceMethod {
    public static void main(String[] args) {
        String message= "I love Pumpkin, Pumpkin is FUN!";

     message=   message.replace("Pumpkin", "Java!");
        System.out.println( message);

        //what if I want to replace space from everywhere
        String message2="Happy Thanks Giving to All!!";
        //"Happy Thanks Giving to All!!" ---> Happy Thanksgiving to All!!

        message2=message2.replace("Thank Giving", "Thanksgiving");
        System.out.println( message2);

        //remove all the space

        message2= message2.replace(" ", "");
        System.out.println(" message 2 = " + message2);


        String message3= "TOMORROW IS OFF NO!";
        message3=message3.replace(" NO!", "");
        System.out.println(message3);

    }
}
