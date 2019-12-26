package day23;

public class FindMax {
    public static void main(String[] args) {

        long[] salaries= new long[]{ 100000L, 110000L, 120000L,125000L,130000L};

        //i need to pick upp an item from this array so I can compare with other items
        //since fisrt one is right there, I just decided to pick it up
        //and make it temporarily the max value
        //can I pick 2nd and 3rd instead --->>> yes you can


        /*
        PLAIN ENGLISH LOGIC TO FOND MAX SALARY

        Write down the first number as temporarily max salary on a paper
        then go through each number and compare the number
         if the number you are comparing is more than what is on the paper
        delete that number and replacewith bigger number
        keep doing this until you do not have any more number left
         **/

        long maxSalary=salaries[4];// buraya hangi numarayi koydugunun onemi yok

        for (long salary : salaries) { //kisa yolu iter
            //check the current salary is more than max
            if (salary>maxSalary){
                //if so replace the existing value of max with current bigger salary
                maxSalary=salary;


            }

        }
        System.out.println("maxSalary = " + maxSalary); //soutv ye bas//paranteze dikkat et

    }
}
