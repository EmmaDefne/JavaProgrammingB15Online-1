package replIt;

import java.util.Scanner;

public class ApartmentLeasing1 {
    public static void main(String[] args) {


    Scanner scan = new Scanner(System.in);

    System.out.println("Welcome to Cybertek Apartments!");
    System.out.println("Number of bedrooms you are interested:");
    int numberOfBedrooms = scan.nextInt();
    int startingPrice=0;
if (numberOfBedrooms==1){
    System.out.println("One Bedroom Selected");
     startingPrice=1100; //onceden kendisi atadigi icin ben sadece degeri yaziyorum burda
} else if (numberOfBedrooms==2){
    System.out.println("Two Bedroom Selected");
startingPrice=1850;

} else if (numberOfBedrooms==3){
    System.out.println("Three Bedroom Selected");
startingPrice=2550;
}else {
    System.out.println("No such Bedrooms available");
}
        System.out.println("Starting Price: " + startingPrice);
    }

}
