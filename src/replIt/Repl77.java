package replIt;

import java.util.Scanner;

public class Repl77 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String email = scan.next();

int indexOfUnderScore= email.indexOf("_");
int indexOfAt=email.indexOf("@");
int indexOfDat=email.indexOf(".");

     String firstName="";
     String  lastName="";
     String domain="";
     String topLevelDomain="";


     firstName +=email.substring(0,indexOfUnderScore);
     lastName +=email.substring(indexOfUnderScore+1, indexOfAt);
    domain +=email.substring(indexOfAt+1, indexOfDat);
     topLevelDomain += email.substring(indexOfDat+1);


        System.out.println("First name:" + firstName.substring(0,1).toUpperCase()+ firstName.substring(1));
        System.out.println("Last name:" + lastName.substring(0,1).toUpperCase()+lastName.substring(1));
        System.out.println("Domain:" + domain);

        System.out.println("Top-Level Domain:" + topLevelDomain);





    }


}
