package day31;

public class MethodPractice2 {


    //write a piece of reusable code to count from 1 to 10
    //give a name count1to10                                  : method name
    //no need for object when being called                    : static
    //it should be accessible anywhere in your project       : public
    //it does not return any value                           : void
    //does not need any external data when being called      : (nothing inside)

    public static void count1to10 () {

        for (int i = 0; i <= 10; i++) {
            System.out.print(i + " ");

        }

    }

    public static void main(String[] args) {

      count1to10();
        System.out.println();
        count1to10();
        System.out.println();

        //optionally you can call using classname.methodName();
        MethodPractice2.count1to10(); //3. kez sayi basacak
        System.out.println();
         countDownFrom20();
        System.out.println();
        printOddNumbers1t0100();
        System.out.println();
        namePrint();
    }

       public static void countDownFrom20 (){

           for (int x = 20; x > 0 ; x--) {
               System.out.print(x + " ");
           }
       }

       public static void printOddNumbers1t0100 () {

           for (int y = 1; y <=100 ; y++) {
               if (y%2==1){
                   System.out.print(y + " ");
               }

           }
       }
       public static void namePrint (){

        String name= "seda";
           System.out.println(name.charAt(0) + "-" + name.charAt(1)+ "-" + name.charAt(2)+ "-" + name.charAt(3));
       }


    }

