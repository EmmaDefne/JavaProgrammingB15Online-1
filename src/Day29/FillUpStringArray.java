package Day29;

import java.util.Arrays;

public class FillUpStringArray {
    public static void main(String[] args) {
        
        String [] loveJava=new String[300];
        
       // loveJava[0]="I love Java"; bu sekilde 300 kere ekleyemeyecegimize gore 

        for (int i = 0; i <loveJava.length ; i++) {
            loveJava[i]=( i+1)+ ".I Love Java";
            
        }
        System.out.println( Arrays.toString(loveJava));
    }
}
