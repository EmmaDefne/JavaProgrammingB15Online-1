package day09;

import java.util.Scanner;

public class Language_SwitchTechnique {
    public static void main(String[] args) {


        System.out.println("Welcome to Cybertek Call Center");
        System.out.println(" Choose your language");

        int languageOption = 5;
        String greeting = "";

        switch (languageOption){
            case 1:
                greeting = "Salam";
                break;
            case 2:
                greeting = "Hello";
                break;
            case 3:
                greeting = "Hola";
                break;
            case 4:
                greeting = "Merhaba";
                break;
            case 5:
                greeting = "Koniciva";
                break;
            default:
                System.out.println("Unknown language");
// eksik kaldi dersten bul tamamla
        }


    }
}

