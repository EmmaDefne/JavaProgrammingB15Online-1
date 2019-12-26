package day13;

public class MoreStringPractice {
    public static void main(String[] args) {
       // String name= "EMEL";
        //System.out.println(name);
        // name = " fatih";
        //System.out.println(name);
        //name = "ebru";
        //System.out.println(name);
        //name = "EMEL";
        //System.out.println(name);

        String name= "Pumpkin";
        System.out.println(name);
        name.toUpperCase();
        System.out.println(name);
        name.toUpperCase(); // bu buyuk yazmadi
        System.out.println(name);
        System.out.println(name.toUpperCase());

        //what if I really want to change the name
        name = name.toUpperCase();
        System.out.println(name);
//dont forget only one pumpkin survive

        //string is immutable, once created it can not be changed
        //any string actions /methods that looks like changing variable
        //actually creatin ?? eksik kaldi

    }
}
