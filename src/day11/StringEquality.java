package day11;

public class StringEquality {
    public static void main(String[] args) {



        String name ="Rabia"; //String literal

        String name2 = new String("Rabia");

        String name3 = "Rabia";
        System.out.println(name);
        System.out.println(name2);
        System.out.println(name3);


        System.out.println("using == methods");
        System.out.println(name ==name2 );
        System.out.println(name ==name3 );

        //the correct way of comparing string to get consistent result is
        //using one of the string object behaviour / method called
        //equals method
        //str1.equals(str2)
        System.out.println("using equals methods");
        System.out.println(name.equals(name2));
        System.out.println(name.equals(name3));
    }
}
