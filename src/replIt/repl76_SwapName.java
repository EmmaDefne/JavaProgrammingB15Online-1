package replIt;

import java.util.Scanner;

public class repl76_SwapName {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String email = scan.next();
//repl da baska cozum var

      if (email.contains("_")){
          String firstName=email.substring(0,email.indexOf("_"));
          String lastName=email.substring(email.indexOf("_")+1,email.indexOf("@"));
          String rest=email.substring(email.indexOf("@"));
          System.out.println(lastName+"_"+firstName+rest);
      }
        else{
          System.out.println(email);
      }

    }
}
