package day09;

public class Greetings {

    public static void main(String[] args) {


        String greeting = " ";
        int languageOption = 5;


        if (languageOption == 1) {
            greeting = "Hello";
            System.out.println("Hold on please");
        } else if (languageOption == 2) {
            greeting = "Salam";
        } else if (languageOption == 3) {
            greeting = "Hola";
        } else if (languageOption == 4) {
            greeting = "Privet";
        } else if (languageOption == 5) {
            greeting = "Merhaba";
            System.out.println("Lutfen bekleyiniz");
        } else if (languageOption == 6) {
            greeting = "Szia";
        } else if (languageOption == 7) {
            greeting = "Bonjour";
        } else {
            System.out.println("Language is unknown");
        }
        System.out.println(" Language is " + languageOption);
    }
}