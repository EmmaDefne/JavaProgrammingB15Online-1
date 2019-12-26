package office_hour;


public class ArrayPractice {
    public static void main(String[] args) {

        String[] cars={"bmw" , "wv" , "audi"};

        System.out.println(cars[0]);
        System.out.println(cars[1]);
        System.out.println(cars[2]);


        for (int carsIndex = 0; carsIndex <=1 ; carsIndex++) {
            System.out.println("HERE IS YOUR CAR " + cars[carsIndex]);
        }


        for (String carModel : cars) {
            System.out.println("I am done assigning the car " + carModel);



        }
    }
}
