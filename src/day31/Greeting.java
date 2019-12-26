package day31;

public class Greeting {

    public static void main(String[] args) {
        //sayHello();
        sayHelloTo ("Batch 15");
        sayHelloTo ("Kids");

    }


    //(String name) this is called method parameter
    //it is used to tell caller of this method
    //caller means         sayHelloTo ("Kids");
    //it is expecting this type of data when being called
    public static void sayHelloTo(String name) {



    //public static void sayHello(){
        System.out.println("Hello " + name);
    }
}
