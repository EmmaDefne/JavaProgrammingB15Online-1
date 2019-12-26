package day26;

import java.util.Arrays;

public class SwappingValues {
    public static void main(String[] args) {
        String name="Emma" ;
        String name2="Jason";

        //name2 should have Emma, name1 should have Jason

        //name1=name2;
        //name2=name1;

        System.out.println("name1=" + name);
        System.out.println("name2" + name2);

        //swap the value of first item and last item
        int [] myNumbers= new int[]{10,40,30,7};
        System.out.println("my numbers" + Arrays.toString(myNumbers));
        int temp=myNumbers[0];// temp now has 10
        myNumbers[0]=myNumbers[3]; //first item value become7
        myNumbers[3]=temp; //last item now become 10

        System.out.println("first item" + myNumbers[0]) ;
        System.out.println("last item" + myNumbers[3]) ;

        System.out.println("myNumbers " + Arrays.toString(myNumbers) );

//swap the value of second item and third item
       // int [] myNumbers= new int[]{10,40,30,7};
        int temp2 = myNumbers[1];
        myNumbers[1] = myNumbers[2];
        myNumbers[2] = temp2;
        System.out.println("myNumbers = " + Arrays.toString(myNumbers));




    }
}
