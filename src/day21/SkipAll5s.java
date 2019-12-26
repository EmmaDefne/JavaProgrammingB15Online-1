package day21;

public class SkipAll5s {
    public static void main(String[] args) {

        //count 1 to 100
        // skip all the numbers divisible by5

        //x%5==0
        for (int i = 0; i <=100 ; i++) {
            if (i%5==0){
                System.out.println("skipping" + i);
               continue;
            }
            System.out.println(i);

        }
    }
}
