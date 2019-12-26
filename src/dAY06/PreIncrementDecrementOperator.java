package dAY06;

public class PreIncrementDecrementOperator {

    public static void main(String[] args) {
        // initilizing (giving value )offerCount value  to 2
        int offerCount =2;
        // increasing the number by one using normal way;
        offerCount = offerCount +1 ;

        // this is increasing the value by one using comppound/ shorthand operator
        offerCount +=1;

        //since increasing or decreasing a value is very special
        //and often used in programming
        // there is even shorter shortcut for this operation
        //and we use ++ or -- , THIS IS EXCLUSIVELY FOR INCREASING OR DECREASING BY 1
        //We can not use it for any other time like increasing or decreasing or decreasing value by more than one. 

        ++ offerCount; // this is same as offerCount+=1; and this offerCount = offerCount+1; it is just shorter

        System.out.println( " Offer Now after increasing by one" + offerCount);

        -- offerCount;
        System.out.println(" Offer Now after decreasing by one" + offerCount);



    }
}
