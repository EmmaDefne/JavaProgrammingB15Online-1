package day18;

public class EvenNumber_ForLoop {


    public static void main(String[] args) {
        //skip counting by2
        //starting from 0--100

        for (int i =0 ; i<100; i+=2 ) {
            System.out.print(i +" ");
        }

        //skip counting by 3 now
        for (int n=0; n<100; n+=3){
            System.out.print( n+" ");
        }
        System.out.println("-----------------");
        //the short cut for generating for loop is: fori enter or tab
        for (int i = 0; i < 100; i++) {

            if (i%5 == 0  && i%3==0){
                System.out.println(i + "is fizz buzz number");
            }
        }

        System.out.println(" ----------even number ------------");
        for (int y=0; y<100; y++){
            if (y%2==0){
                System.out.print(y+ " ");
            }
        }
    }
}
