package day22;

public class TimesTable {
    public static void main(String[] args) {
        for (int timestable = 1; timestable <=10 ; timestable++) {
            System.out.println("Multiplication Table of " + timestable);
            for (int base = 1; base <=10 ; base++) {
                System.out.println(timestable + " x" + base + " = " + timestable * base);
            }

        }
    }
}
