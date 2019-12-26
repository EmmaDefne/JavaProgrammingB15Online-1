package day18;

public class DoWhileIntro {
    public static void main(String[] args) {
        //count from 1 to 5;

        int x=1;
        do {
            System.out.println(x);
            ++x;
        } while (x<5);//semi colon is mandatory
        //count from 5 to 1;

        int y=5;
        do{
            System.out.println(y);
            --y;
        } while (y>=0);
//WHILE LOOP VS DO WHILE LOOP
        /*
        While loop check the condition first then enter the statement
        do while loop will take the action at least once then check the condition

        DO WHILE LOOP ALWAYS RUN AT LEAST ONE ITERATION
        WHILE LOOP MIGHT NOT EVEN RUN!!
         */


        }

    }

