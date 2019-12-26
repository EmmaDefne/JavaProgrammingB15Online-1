package day22;

public class TernaryConstruct {
    public static void main(String[] args) {



        int bill= 2400;
        int discount =(bill>2000)? 15 : 10;
        System.out.println(discount);


        int fatura=2000;
        int adet= 10;
        int indirim=(fatura>1000) ? (adet>11) ? 10:9:5;
        System.out.println(indirim);
    }
}
