package day21;

public class NestedLoopIntro {
    public static void main(String[] args) {

        //count from 1 to 5
        //repeat this 10 times

        for (int x = 0; x <= 5; x++) {
            System.out.print(x + " ");

        }
        System.out.println();

        for (int x = 0; x <= 5; x++) {
            System.out.print(x + " ");
        }
        System.out.println();

        for (int x = 0; x <= 5; x++) {
            System.out.print(x + " ");
        }
        System.out.println();
        for (int i = 0; i <= 3; i++) {
            System.out.println("iteration: " + i );
        }
    }
}
