package day22;

public class TernaryOperator {
    public static void main(String[] args) {
        String action;
        //boolean isGreen=true;
        //if (isGreen){
        //    action="can drive";
        //}else {
            //action="can't drive";
        //}
        //System.out.println(action);

        boolean isGreen=true;
        action = (isGreen)? "can drive" : "can't drive.";
        System.out.println(action);
    }
}
