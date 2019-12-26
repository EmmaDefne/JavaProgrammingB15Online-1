package day23;

public class WarmUp_Array {
    public static void main(String[] args) {
        //  create an int array of 7 items
//  assign values
// 1,  print out in reverse order
// 2 , store last item in a variable called lastItem
        // print it out separately
// 3 , print the item right in the middle
//
// OPTIONALLY : find sum , find average , find max , find min


        int [] arr={111,222,333,444,555,666,777,};



        for (int i = arr.length-1; i>=0 ; i--) {
            System.out.print( arr[i]+"-");

        }
        System.out.println("      ");

        int arraySize=arr.length;
        int lastItemIndex=arraySize-1;
        int lastItemValue=arr[lastItemIndex];
        System.out.println("last Item Value"+ lastItemValue);
        System.out.println("last item "+ arr[arr.length-1]);//bu yol daha kolay
        System.out.println("item right in the middle: " + arr[arr.length/2+1]);
        System.out.println("item in the middle" + arr[arr.length/2]);

        int sum=0;
        for (int i = 0; i <arraySize ; i++) {

          //  int currentItem=arr[i];
          //  sum=sum+currentItem;
            sum+=arr[i];


        }
        System.out.println("sum=" + sum);


    }
}
