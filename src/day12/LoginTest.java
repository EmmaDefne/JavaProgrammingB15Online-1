package day12;

import java.util.Scanner;

public class LoginTest {
    public static void main(String[] args) {

        String correctUserName ="user123";
        String correctPassword= "pass123";
        Scanner scan=new Scanner(System.in);
        System.out.println("Please enter your user name");
        String userName = scan.nextLine();
        System.out.println("Please enter your password");
        String password= scan.nextLine();

if (correctUserName.equals(userName) && !(password.equals(correctPassword))){
    System.out.println("Your password is wrong");
}else if (!(correctUserName.equals(userName)) && (password.equals(correctPassword))){
    System.out.println("Your username is wrong");
} else if (!(correctUserName.equals(userName)) && !(correctPassword.equals(password))){
    System.out.println("Your username and password are wrong! ");
}else  {
    System.out.println(" Login Successful! ");
}

    }
}
