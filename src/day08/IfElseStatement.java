package day08;

public class IfElseStatement {
    public static void main(String[] args) {

        int speedLimit= 60;
        int yourCurrentSpeed = 100;

        //if the your current speed more than speed limit
        //get pulled over by the police
        //given ticket by the police
        //taken away some point on your licence
        //go to court

        boolean IamSpeading = yourCurrentSpeed > speedLimit ;
// INSIDE PARANTHESIS WE CAN ONLY PUT
        //BOOLEAN VALUE
        //BOOLEAN VARIABLE
        //ANY EXPRESSION THAT RETURN BOOLEAN VALUE

        //if (true) // boyle de yazabilirsin
if (yourCurrentSpeed > speedLimit)   {

      //  if (IamSpeading){ // boyle de yazabilirsin
            System.out.println(" get pulled over by the police");
            System.out.println(" given ticket by the police");
            System.out.println(" taken away some point on your licence");
            System.out.println(" go to court");

        } else  {
            System.out.println("Go to shopping!!!");
            System.out.println("Hug your kids");
            System.out.println("Enjoy your day!!");

        }

        System.out.println("THE END!");
        //if not over the limit go shopping
        //outside if statement, say the end


    }
}
