package day17;

public class SkipCounting2 {
    public static void main(String[] args) {



    int oddNumber=1;
            while (oddNumber<=50){
        System.out.print(oddNumber+ " ");
        oddNumber +=2;

    }
        System.out.println("------------");
         int evenNumber= 0;
            while (evenNumber<=50){
                System.out.print(evenNumber+ " ");
                evenNumber+=2;
            }

        System.out.println("----------");
            int number3= 0;

           while (number3<=50){
               if (number3%2==0){
                   System.out.println(number3 + "is even number");
               }else {
                   System.out.println(number3 +" is odd number");

               }
               ++number3;
            }
}

}


