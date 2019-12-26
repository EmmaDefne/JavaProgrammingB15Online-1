package day12;

import javax.swing.*;

public class HardCoreCorollaFan_CarShopping {
    public static void main(String[] args) {
        String carBrand= "Tesla";
 int carPrice = 60000;
 int budget = 60000;

 if (carBrand.equals("corolla")){
     System.out.println("COROLLA CAR ACQUIRED!");
 }else if (carBrand.equals("Tesla") && carPrice<=budget){
     System.out.println("TESLA CAR ACQUIRED!");
 }else {
     System.out.println("NOT WHAT I AM LOOKING FOR");

 }

    }
}
