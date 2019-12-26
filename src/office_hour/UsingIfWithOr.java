package office_hour;

public class UsingIfWithOr {
    public static void main(String[] args) {
        //spring, summer,fall --->> bears are active
        //winter --> bear sleep:

        String season = "spring" ;
    if (season.equals("spring") || season.equals("summer") || season.equals("fall")) {
        System.out.println("bears are active");
    }else if (season.equals("winter")){
        System.out.println("bear is sleeping");
    }

    }
}
