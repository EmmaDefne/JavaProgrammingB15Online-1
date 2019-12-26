package day17;

public class ReverseYourName_While {
    public static void main(String[] args) {

        String name= "Emel Gumustop";
        String name2="Ali Gumustop";
        String name3="Elif Sevval Gumustop";
        int x=name.length()-1;// burda ismin son karakterini aliyoruz
        while (x>=0){
            System.out.print(name.charAt(x)+ " " ); //son karakterden geriye dogru print et diyoruz
            --x;
        }

        System.out.println("----------");
        int y=name2.length()-1;
        while (y>=0){
            System.out.print(name2.charAt(y)+" ");
            --y;

        }
        System.out.println("----------");
        int s=name3.length()-1;
        while (s>=0){
            System.out.print(name3.charAt(s) + " ");
            --s;
        }
    }
}
