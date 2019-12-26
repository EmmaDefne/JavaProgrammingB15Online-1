package day22;

public class ArrayPracticeWithName {
    public static void main(String[] args) {

        char [] letter= new char[4];

        letter[0]= 'E';
        letter[1]= 'M';
        letter[2]= 'E';
        letter[3]= 'L';

        System.out.println(letter[0]);
        System.out.println(letter[1]);
        System.out.println(letter[2]);
        System.out.println(letter[3]);

        System.out.println(letter);

        boolean [] yesNo =new boolean[3];

        System.out.println(yesNo[0]);
        System.out.println(yesNo[1]);
        System.out.println(yesNo[2]);

        yesNo[0]= 9>5;
        yesNo[1]= 2*2==4;
        yesNo[2]= 10<7;

        System.out.println(yesNo[0]);
        System.out.println(yesNo[1]);
        System.out.println(yesNo[2]);

    }
}
