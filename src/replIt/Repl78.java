package replIt;

import java.util.Scanner;

public class Repl78 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String message = scan.nextLine();
        String sender= "";
        String phoneNumber= "";
        String messageBody= "";

//Sender:<Mike Smith>. From Number:[202-123-3456]. Message:{I love programing and problem solving}

    int indexOfSmaller= message.indexOf("<");
    int  indexOfGreater=message.indexOf(">");
    int indexOfBracet=     message.indexOf("[");
     int indexOfBracet2=   message.indexOf("]");
     int indexOfCurly= message.indexOf("{");
     int indexOfCurly2=message.indexOf("}");

     sender +=message.substring(indexOfSmaller+1,indexOfGreater);
     phoneNumber +=message.substring(indexOfBracet+1,indexOfBracet2);
     messageBody +=message.substring(indexOfCurly+1,indexOfCurly2);

        System.out.println("Sender: " + sender);
        System.out.println("Phone Number: " + phoneNumber);
        System.out.println("Message body: " + messageBody);



    }
}
