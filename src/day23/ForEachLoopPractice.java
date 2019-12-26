package day23;

public class ForEachLoopPractice {
    public static void main(String[] args) {
        //create a long array or 5 items called salaries
        //put salary amounts that ok for your offer
        //use for each loop iterate over them
        //and print them out
        //print only the salary 100000

        long[] salaries= new long[]{ 100000L, 110000L, 120000L,125000L,130000L};
        for (long eachSalary : salaries){
            System.out.println("Each Salary = " + eachSalary );

        }
        for (long salary :salaries) {
           // if (salary>100000){
              //  System.out.println("salary= " + salary);
            if (salary<=100000){
                continue;
            }
            System.out.println("salary = " + salary);

            }
        }

    }

