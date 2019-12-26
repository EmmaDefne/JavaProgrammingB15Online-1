package day16;

public class MyLoopIntro {

    public static void main(String[] args) {
        //print hello 5 times
        //and also keep the count of how many times you said hello

        int count=1;
        System.out.println("HELLO");
        //count=count+1; asagidaki gibi yaz
       // count +=1;
        ++count;
        System.out.println("HELLO");
        ++count;
        System.out.println("HELLO");
        ++count;
        System.out.println("HELLO");
        ++count;
        System.out.println("HELLO");

        System.out.println("Count is " + count);

        System.out.println("-------------------" );
        int cnt= 1;
        if (cnt<=5){
            System.out.println("HELLO");
            System.out.println("cnt value is" +cnt);
            ++cnt; //increase the value by one

            /* 1st time in the loop : cnt=1
            check this 1<=5 --> true
            hello world
            cnt value is 1
            increase the cnt value to 2

            2nd time in the loop: cnt=2
            check this 2<=5--->>> true
            hello world
            cnt value is 2
            increase the cnt value to 3

            3rd time in the loop: cnt=2
            check this 3<=5 ---->>> true
            hello world
            cnt value is 3
            increase the cnt value 4


            4th  time in the loop: cnt=4
            check this 4<=5 ---->>> true
            hello world
            cnt value is 4
            increase the cnt value 5

            5th time in the loop: cnt=5
            check this 5<=5 ---->>> true
            hello world
            cnt value is 5
            increase the cnt value 6

            6th time in the loop: cnt 6
            check this 6<=5 ----> false
            GET OUT OF THE LOOP!!!!
             */


        }
    }
}
