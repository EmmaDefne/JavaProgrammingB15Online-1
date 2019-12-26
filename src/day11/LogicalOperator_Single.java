package day11;

public class LogicalOperator_Single {
    public static void main(String[] args) {
        // && 2 ampersand & 1 ampersand ---> logical and operator
        //this is used to check both conditions are true at the same time

        //&&is called short circuit AND
        // -->>> It does not check the next condition as long as the first condition is false
        //--> just like if you have multiple condition for rocket launching
        //isEngineRunning, isCommunicationSystemWorking , isAirEnough

        //isEngineRunning && isCommunicationSystemWorking  && isAirEnough
        //if isEngineRunning is false then it does not go and check next condition

        // &  -->> CHECK EACH AND every condition no matter what
        // isEngineRunning  & isCommunicationSystemWorking &  isAirEnough
        // if isEngineRunning is false
        // it still check isCommunicationSystemWorking
        // it still check isAirEnough
        // and eventually give you the outcome


        // combine the result of
        // checking 5 is more than 10
        // and  9 divided by 0 is 3
        System.out.println(  5>10 &&  9/0 ==3  );
        System.out.println(  5>10 &  9/0 ==3  );




    }
}
