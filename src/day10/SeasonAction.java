package day10;

public class SeasonAction {
    public static void main(String[] args) {
        /*
        what do you do in each season?
        spring ---> hike, easter, nawruz
        summer---> swim, vacation, bbq, holiday
        fall---> halloween, black friday, harvest
        winter----> christmas, ski, new year
         */

        String season = "Fall";
        switch (season){
            case "Spring":
                System.out.println("You can celebrate Easter and Nawruz!");
                break;
            case "Summer":
                System.out.println(" Go to vacation, have some good time");
                break;
            case "Fall":
                System.out.println(" Trick or treat, halloween time!!! ");
                break;
            case "winter":
                System.out.println(" Merry Christmas");
                break;
            default:
                System.out.println(" there is no such a season");


        }
    }
}
