package day12;

public class WarmUp_SeasonFinder {
    public static void main(String[] args) {
        int month = 1;
        if (month>12 || month<1){
            System.out.println("INVALID MONTH");
        } else if (month>=3 && month<=5){
            System.out.println("SPRING! ");
        } else if (month>=6 && month<=8){
            System.out.println("SUMMER!");
        } else if (month>8 && month<12){
            System.out.println("FALL!");

        } else if (month == 12 || month ==1 || month ==2){
            System.out.println(" WINTER! BRRRR");
        }
    }
}
