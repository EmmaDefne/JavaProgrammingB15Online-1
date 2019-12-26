package day14;

public class LastIndexOf {
    public static void main(String[] args) {
        String name= "Game of Java";

        System.out.println("last location the letter a shows up");
        System.out.println(name.lastIndexOf("a"));
        System.out.println("last location the character space shows up");
        System.out.println(name.lastIndexOf(" "));
        System.out.println("last location the letter Ga shows up");
        System.out.println(name.lastIndexOf("Ga"));
        System.out.println("last location the letter Kawa shows up ");
        System.out.println(name.lastIndexOf("Kawa"));
//if i dont use contains method, what would be my condition to check
        //whether we have kawa in this string, either using indexOf or lastIndex

        if (name.indexOf("Kawa")>-1){
            System.out.println("KAWA FOUND!!!");
        }else {
            System.out.println("NO KAWA - NO PUMPKIN");
        }

    }
}
