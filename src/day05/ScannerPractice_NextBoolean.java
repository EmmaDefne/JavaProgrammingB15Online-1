package day05;


import java.sql.SQLOutput;
import java.util.Scanner;

public class ScannerPractice_NextBoolean {

    public static void main(String[] args) {

        Scanner input = new Scanner( System.in);

        System.out.println(" are you recording ?");

        boolean isRecording = input.nextBoolean();

        // the result of concatenating a string to any data type --->> String
        System.out.println("We are recording " + isRecording);


    }
}
