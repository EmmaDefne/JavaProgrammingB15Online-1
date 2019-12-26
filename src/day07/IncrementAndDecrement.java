package day07;

public class IncrementAndDecrement {

    public static void main(String[] args) {

        // —— The special case of increasing and decreasing numbers by 1
//. —>> increment and decrement operator come in :  ++ - -
       // int  offer = 2 ;


        int apple = 10;

        //apple = apple +1 ;
        // apple+=1;
       ++ apple; //this is increasing the value by one in shourtcut using ++
        ++ apple;
        System.out.println(" used ++ twice then apple is" + apple);


        //bu kodlarin hepsi 1 ekler

       System.out.println( apple);

        // apple = apple-1;
        //apple- = 1;

        -- apple;
        System.out.println( "used -- once then apple is " + apple);

        //System.out.println( ++ apple);
        System.out.println("used ++ to increment and concatenate :" + (++apple));
    }
}
