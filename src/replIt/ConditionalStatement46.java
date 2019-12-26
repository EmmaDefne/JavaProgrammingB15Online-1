package replIt;
import java.util.Scanner;

public class ConditionalStatement46 {

    static class Main {
        public static void main(String[] args) {
            Scanner inp = new Scanner(System.in);
            System.out.print("In:");
            int num = inp.nextInt();

            if (num>0){
                System.out.println(num + " is positive");
            }else if (num<0){
                System.out.println(num + " is negative");

            }
        }
    }
}

