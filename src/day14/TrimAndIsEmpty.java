package day14;

public class TrimAndIsEmpty {
    public static void main(String[] args) {

        String message= "   REPL IS COMING !";
        System.out.println(message);
        System.out.println(" message character count is " + message.length());
        System.out.println(message.trim());
        System.out.println(" message character count is " + message.length());
//yine ayni sonuc cikti
        // ama
        // message= message.trim(); yaparsan trim yaptigi ciktiyi verir .
    }
}
