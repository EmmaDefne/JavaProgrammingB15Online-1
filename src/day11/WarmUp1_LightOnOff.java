package day11;

public class WarmUp1_LightOnOff {
    public static void main(String[] args) {

        String targetOption = "Bd";
        switch (targetOption) {
            case "Bd":
                System.out.println("You have turned on bedroom light! ");
                break;
            case "Lr":
                System.out.println("You have turned on living room light! ");
                break;
            case "Ki":
                System.out.println("You have turned on kitchen light! ");
                break;
            case "Ha":
                System.out.println("You have turned on hallway light! ");
                break;
            default:
                System.out.println(" This is no such that light");


        }

    }
}
