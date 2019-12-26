package day17;

import java.util.Scanner;

public class UpperCase_LowerCasePractice {
    public static void main(String[] args) {

        String name="kHumAyRa";

    String nameFixed= (name.charAt(0)+"").toUpperCase();
    nameFixed=nameFixed+name.substring(1).toLowerCase();

        System.out.println("nameFixed = " + nameFixed);//soutv kullan
    }
}
