package office_hour;

public class GettingCharacter {
    public static void main(String[] args) {
             //      01234567890
        String name="my name is emel";
        //getting each character using charAT(INDEX)
        //generate sequential number 0--->>10
        int x=0;
        while (x<name.length()){
            System.out.println("index: " + x );
            System.out.println(name.charAt(x));
            ++x;
        }
    }
}
