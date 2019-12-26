package day31;

public class SeasonChecker {

    public static void main(String[] args) {


        //a string variable declared and assigned value inside main method
        //it can be accesible in main method

       String season ="winter";

       decideSeasonAction("winter");
       decideSeasonAction("Summer");
       decideSeasonAction("my season");
        System.out.println("deneme" +"winter");
    }
    public static void decideSeasonAction(String season){
        //this season method parameter can only be accessible inside method body
        switch (season){
            case "Spring":
                System.out.println("Hiking");
                break;
            case "Summer":
                System.out.println("swimming");
                break;
            case "fall":
                System.out.println("pumpking picking");
                break;
            case "winter":
                System.out.println("go snowboarding");
                break;
            default:
                System.out.println("invalid season");
        }

    }

}
