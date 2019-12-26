package day21;

public class WhileDonguCalismasi {
    public static void main(String[] args) {
        int i=0;
        int j=0;
        while (i<5){
            //j=0; //bunu sonradan ekledi
            while (j<5){
                System.out.println("i=" + i +" j=" + j);//once j yi yokluyor, j'nin kosullarini yokladiktan sonra i ye geciyor.
                j++;
            }
            i++;
        }
        System.out.println("result" + i);
    }

}
