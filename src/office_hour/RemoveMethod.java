package office_hour;

public class RemoveMethod {
    public static void main(String[] args) {
        String letters="J%a^V**$1a";
        //remove

        letters=letters.replace("%", "").replace("^","")
                .replace("*","").replace("*","")
                .replace("$","").replace("1","");
        System.out.println("letters = " + letters);

    }
}
