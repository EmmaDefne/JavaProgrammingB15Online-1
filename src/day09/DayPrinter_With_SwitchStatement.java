package day09;

public class DayPrinter_With_SwitchStatement {
    public static void main(String[] args) {

        int dayCode= 9;

        switch (dayCode){
            case 1:
                System.out.println("Day is Monday");
                break;//used to get out this branch
            case 2:
                System.out.println(" Day is Tuesday");
                break;
            case 3:
                System.out.println(" Day is Wednesday");
                break;
            case 4:
                System.out.println(" Day is Thursday");
                break;
            case 5:
                System.out.println(" Day is Friday");
                break;
            case 6:
                System.out.println("Day is Saturday");
                break;
            case 7:
                System.out.println("Day is Sunday");
                break;
            default:
                System.out.println("Day is unknown");
        }
    }
}
