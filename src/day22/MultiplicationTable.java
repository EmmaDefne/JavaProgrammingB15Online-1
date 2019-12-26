package day22;

public class MultiplicationTable {
    public static void main(String[] args) {


        // System.out.println("1 x 1 = " + 1 * 1 );
        //System.out.println("1 x 2 = " + 1 * 2 );
        //System.out.println("1 x 2 = " + 1 * 3 );
        System.out.println("Multiplication table 1");
        for (int base = 1; base <= 12; base++) {
            //  System.out.println("1x1=" + 1 * 1 );
            System.out.println("1 x " + base + " = " + 1 * base);

        }
        // System.out.println("2 x 1 = " + 2 * 1 );
        //System.out.println("2 x 2 = " + 2 * 2 );
        //System.out.println("2 x 2 = " + 2 * 3 );
        System.out.println("Multiplication table 2");

        for (int base = 1; base <= 12; base++) {
            System.out.println("2 x " + base + " = " + 2 * base);

        }
        System.out.println("Multiplication table 3");

        for (int base = 1; base <= 12; base++) {
            System.out.println("3 x " + base + " = " + 3 * base);
        }
        System.out.println("Multiplication table 4");
        for (int base = 1; base <= 12; base++) {
            System.out.println("4 x " + base + " = " + 4 * base);
        }
        for (int base = 1; base <= 10; base++) {
            System.out.println("10 x " + base + " = " + 10 * base);
        }
    }
}
