package day26;

import java.util.Arrays;

public class StringSplitPractice {
    public static void main(String[] args) {
        String students = "Abbos, Zulyar,Zhibek,Hasan,Muge, Orhan,Susan";
        //
        // first get all the name into string array called namesArray
        // spell the name of each person in this format
        //a-b-b-o-s...

        students = students.replace(" ", "");
        System.out.println("students = " + students);
        String[] namesArray = students.split(",");
        System.out.println(Arrays.toString(namesArray));
        System.out.println("lenght of namesArray = " + namesArray.length);

        int studentCount = namesArray.length;
        for (int x = 0; x < studentCount; x++) {
            String name = namesArray[0]; // abbos // a-b-b-o-s
            System.out.println("spelling = " + name);
            for (int i = 0; i < name.length(); i++) {
                System.out.print(name.charAt(i) + "-");

            }
            System.out.println();

            String name2 = namesArray[1];
            for (int i = 0; i < name2.length(); i++) {
                System.out.print(name2.charAt(i) + "-");

            }
        }
    }
}
