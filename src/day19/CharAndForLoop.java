package day19;

public class CharAndForLoop {
    public static void main(String[] args) {
        //each character has it is corresponding accii value
        // from ascii table
         int x='A';
         //==========================
      //   char myChar=100 +2;
        //   System.out.println(x);
     //   System.out.println(myChar);
       // System.out.println(++myChar);
        //System.out.println(++myChar);
        //System.out.println(++myChar);
        //System.out.println(++myChar);
       // System.out.println(++myChar);

        //==================

        char myChar='A';
        System.out.println(myChar);
        //'A' +1 -->65+1=66 ==>> 66 ---->> 'B' (myChar data type is char)
        System.out.println(++myChar);
        //'B'+1 --->> 66+1=67 --> 67 ---->> 'c' (myChar data type is char)
        System.out.println(++myChar);
        //'C'+1 --->> 67+1=68 --> 68 ---->> 'D' (myChar data type is char)


        for (char iChar='A';iChar<='Z'; iChar++ ){
            System.out.print(iChar+ " ");
        }

        for (char kChar = 'Z'; kChar >='A' ; kChar--) {
            System.out.print(kChar + " ");
        }
    }
}
