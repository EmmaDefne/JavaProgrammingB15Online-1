package day22;

public class ReversingArray {
    public static void main(String[] args) {

        int[] scores=new int[4];

        scores[0]=95 ;
        scores[1]= 70;
        scores[2]=88 ;
        scores[3]=100 ;

        int itemCount= scores.length;
        int lastItemIndex= itemCount-1;
        for (int x = lastItemIndex; x >=0 ; x--) {
            System.out.println("index location" +x );
            System.out.println(scores[x]);
        }


    }
}
