package day18;

import java.util.Scanner;

public class SmartLockOpener {
    public static void main(String[] args) {



    //smart lock door has passwrod
    //unless you enter correct password
    //it keep locking you out
    //assuming correct password is B15
    //keep asking until user enter correct me

    Scanner scan=new Scanner(System.in);
        System.out.println("knock knock!!");
        System.out.println("please enter the password!");
    String password=scan.next();

    while (!password.equals("B15")){
        System.out.println(" wrong password! try again!!");
        password=scan.next(); //bunu tekrar tekrar sorsun diye koyuyoruz
    }
        System.out.println("open seseame");
    }
}
