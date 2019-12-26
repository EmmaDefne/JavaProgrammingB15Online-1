package day08;

public class MultiBranchIfStatement {

    public static void main(String[] args) {

        //pseudo
        /*
        given your currentSpeed, speedLimit
        check whether the current speed is
        more than 90 -- > jail
        more than 80 and less than 90 --> reckless driving

        ---start from here above two optional
        more than 70  ---> point taken
        more than 60 and less than 70 --> warning


         if not speeding keep driving
         */
        int currentSpeed = 80;
        if (currentSpeed > 70){
            System.out.println(" you are speeding more than 70 -- points taken!!!");
            //asking whether it is less than or egual 70 and more than 60
            //when you come to this point , your speed is already not more than 70
        } else if (currentSpeed > 60){
            System.out.println(" your speed is less than or equal 70 but more than 60");
        } else {
            System.out.println(" keep driving");
        }

    }
}
