package day21;

public class LoopControlStatement {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
            break;
        }
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
            if (i == 5) {
                break;
            }
        }

        int sum=0;
        for (int x = 0; x <=10 ; x++) {
            System.out.println("final sum" + sum);

            if (sum>40){
                break;

            }
            sum += x;

        }
        System.out.println("sum" + sum);
        }

    }

