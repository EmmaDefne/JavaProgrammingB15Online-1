package office_hour;

public class IfIfNest {
    public static void main(String[] args) {
        //*pseudo code:
        //you have option to buy food or drink
        // under food you can buy soda or juice
        //IF YOUR SELECTION IS FOOD
        //WHAT KIND DO YOU WANT? MEAL OR SNACK

        //IF YOUR SELECTION IS DRINK
        //WHAT KIND DO YOU WANT ? SODA OR JUICE


        String mainOption ="Food";
        String secondOption= "meal";
        if (mainOption.equalsIgnoreCase("food")){
            System.out.println("You have selected food");
            if (secondOption.equalsIgnoreCase("snack")){
                System.out.println("You have selected snack");
            }else if (secondOption.equalsIgnoreCase("meal")){
                System.out.println("Yu have selected meal ");
            }else {
                System.out.println(" no such food option");
            }
        }
    }
}
