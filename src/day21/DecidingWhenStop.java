package day21;

public class DecidingWhenStop {
    public static void main(String[] args) {
        String msg="Hello World";

        int charCount= msg.length();
int n=6;
        for (int i = 0; i <=charCount-n ; i++) {
            System.out.println(msg.substring(i,i+n));

        }


    }
}
