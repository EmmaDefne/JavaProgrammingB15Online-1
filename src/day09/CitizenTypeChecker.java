package day09;

public class CitizenTypeChecker {
    public static void main(String[] args) {

        int age = 80;
        String citizenType;
        if (age > 65){
               citizenType = "Senior";
        }else{
            citizenType =" Not senior" ;
        }
        System.out.println("the citizen age is " + age+ ", and you are a " + citizenType);
    }
}
