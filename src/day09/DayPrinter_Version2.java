package day09;

public class DayPrinter_Version2 {
    public static void main(String[] args) {
        int dayCode = 6;
        String dayName =";"; //assigning a empty string value

        if (dayCode == 1) {
            dayName = "Monday";
        } else if (dayCode == 2) {
            dayName = "Tuesday";
        } else if (dayCode == 3) {
            dayName = "Wednesday";
        } else if (dayCode == 4) {
            dayName = "Thursday";
        } else if (dayCode == 5) {
            dayName = "Friday";
        } else if (dayCode == 6) {
            dayName = "Saturday";
            System.out.println(" go shopping");
        } else if (dayCode == 7) {
            dayName = "Sunday";
        }else {
            System.out.println("Day is unknown");
        }
        System.out.println(" Day is " +dayName);
    }
}
