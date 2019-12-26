package office_hour;

public class GettingWordInsideParanthesis {
    public static void main(String[] args) {
                    //012345678901234567890123456
        String item= "Echo Dot (3rd Gen) Charcoal";
        //get whatever is inside parenthesis
        //find out index of (and index of), use them for substring
        System.out.println(item.substring(9,18));
        System.out.println(item.substring(10,17));
        int indexOfOpeningParenthesis=item.indexOf("(");
        int indexOfEndingParenthesis=item.indexOf(")");

        String wordInsideParenthesis=item.substring(indexOfOpeningParenthesis+1,indexOfEndingParenthesis);
        System.out.println("wordInsideParenthesis = " + wordInsideParenthesis);;

    }
}
