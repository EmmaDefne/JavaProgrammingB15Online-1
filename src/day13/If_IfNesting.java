package day13;

public class If_IfNesting {
    public static void main(String[] args) {

        //create a boolean store the result of doYouWantToShop
        //if yes , do you want to go store or do you wanna shop online
        //if user do not wanna shop at all, print good job stay home coding!!!

        boolean youWantToShop = false;
        String preference ="online";

        if (youWantToShop ==true){
            if (preference.equals("store")){
                System.out.println("going to store for shopping");

            }else {
                System.out.println("going to online for shopping");
            }

        }else {
            System.out.println(" good job stay home coding!!!");
        }
    }
}
