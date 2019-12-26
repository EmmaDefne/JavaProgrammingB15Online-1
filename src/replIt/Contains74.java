package replIt;

import java.util.Scanner;

public class Contains74 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String email = scan.next();

        String firstName= email.substring(0,email.indexOf("_"));
        String lastName=email.substring(email.indexOf("_")+1, email.indexOf("@"));
        String line= email.substring(email.indexOf("_"),email.indexOf("_")+1);
        String email2=email.substring(email.indexOf("@"));


        if (email.contains(line)){
            System.out.println(lastName+ line+ firstName+email2);
        }else {
            System.out.println(email);
        }



        }
    }

