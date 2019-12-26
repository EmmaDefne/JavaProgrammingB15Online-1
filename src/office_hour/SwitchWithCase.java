package office_hour;

public class SwitchWithCase {
    public static void main(String[] args) {
        String season= "winter";

        switch (season){
            case "spring":
                case "summer":
                    case "fall":
                System.out.println("bears are active");
                break;
            case "winter":
                System.out.println("bears are sleeping");
                break;

        }
    }
}
