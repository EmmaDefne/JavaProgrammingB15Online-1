package day12;

public class CarShopping {
    public static void main(String[] args) {

        //there is only one car covered with cloth
        //we dont know what car is it and what is the price
        // once we take out the cloth
        //we check whether its toyota, if it is we buy checking the price
        //if its not we check if it is a tesla and also check whether it is within the budget
        String carBrand = "Tesla";

        int carPrice = 30000;
        int budget = 40000;

        if (carBrand.equals("Corolla") || (carBrand.equals("Tesla") && carPrice<budget)){ //burdaki parantezlere dikkat et
            System.out.println("CAR ACQUIRED! ");
        } else {
            System.out.println(" NOT WHAT I AM LOOKING FOR");
        }
    }
}
