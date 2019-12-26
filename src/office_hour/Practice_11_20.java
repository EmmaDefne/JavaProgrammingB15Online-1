package office_hour;

import java.util.Scanner;

public class Practice_11_20 {
// scanner next and nexline method mixture problem
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("What is your age?");
        int age=scan.nextInt();
scan.nextLine();
        System.out.println("What is your full name?");
        String fullName=scan.nextLine();

        System.out.println(" Your name is " + fullName+ ", your age is" + age);
    }
}
