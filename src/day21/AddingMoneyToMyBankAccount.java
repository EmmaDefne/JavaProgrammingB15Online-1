package day21;

public class AddingMoneyToMyBankAccount {
    public static void main(String[] args) {
        int sum=0;
        for (int i = 1; i <=10 ; i++) {
            System.out.println("---> current sum is= " +sum );
            System.out.println("If I add " + i +" dollar, it would be " + (sum+i));

            if (sum +i>30){
                break;

            }
            sum = sum+ i ;

        }
        System.out.println("sum: " +sum);

    }

}
