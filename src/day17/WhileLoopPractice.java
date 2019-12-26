package day17;
//count from 1 to 5 and then 5 to 1
//while i 2 }{ arasinda olmasina ozen goster olmazsa calismiyor
public class WhileLoopPractice {
    public static void main(String[] args) {
        int count = 1;
        while (count <= 5) {

            System.out.println(count);
            count++;


        }
            while (count > 1) {
                --count;
                System.out.println( count);

            }

        System.out.println();
        System.out.println("count after decrement=" + count);


        }
    }


