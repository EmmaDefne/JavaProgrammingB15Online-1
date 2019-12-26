package day14;

public class IndexOfPractice {
    public static void main(String[] args) {
        //index of
        //find out index of another strinh inside this string

        String name= "Game of Java";//oden saymaya basladigini unutma

        //find out the location of java
        //find out the location of letter O
        //find out the location of first space
        System.out.println("find out the location of Java");

        System.out.println(name.indexOf("Java"));
        System.out.println("find out the location of o");
        System.out.println(name.indexOf("o"));

        System.out.println("find out the location of uppercase o");
        System.out.println(name.indexOf(0));// Bu olmadigi icin bana eksi sonuc verecek
        System.out.println("find out the location of first space");
        System.out.println(name.indexOf(" "));
        System.out.println("find out the location of second space");
        System.out.println(name.indexOf(" ",5));


    }
}
