package day26;

public class ArrayTask_NumberTest {

    /*
     * // 1, given an int array
     *   write a program to test all the elementS in this int array are more that 100
     * */
    public static void main(String[] args) {

        int[] scores = {156, 101, 76, 187, 87, 110};
        int size=scores.length;
        System.out.println("size " +size);

        // create a variable called finalResult to store
        // your result of checking if every number in this array is more than 100 or not

// if all numbers are more than 100 then make it yes , if not make it no

        String finalResult = "";
        // LOGIC 1.2:
        // take each item check if it is less than 100, increase count.
        // in the end if count is more than 0, answer is NO,

        int cntMoreThan100 = 0;
        for (int eachNum : scores) {

            if (eachNum >100) {
                System.out.println("eachNum = " + eachNum);
                ++cntMoreThan100;
            }

        }
        System.out.println("cntMoreThan100 = " + cntMoreThan100);
        if (cntMoreThan100 == size) {
            finalResult = "Yes";
        } else {
            finalResult = "No";
        }
        System.out.println("finalResult = " + finalResult);

        // LOGIC 2 :
        // Check each item and break when number is less than 100  after assigning final result to NO

        // LOGIC 3 :
        // minus 100 from all numbers in array and if any of the numbers are negative, it will be a NO

        // LOGIC 4 :
        // find min number if min number more than 100 yes


    }


}

