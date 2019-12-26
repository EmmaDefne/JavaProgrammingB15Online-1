package day22;

public class ArrayIntro {
    public static void main(String[] args) {
        //data type variableName= value here

        int num1=10;

        //syntax for creating variable to store multiple items
        //and assigning a values
        //dataType [] variableName= new dataType [ count of item];
//this array can hold 4 items, it is also known as array size
//creating an array object with empty space

        int[] scores = new int[4];

        scores[0]= 95;
        scores[1]=70;
        scores[2]=88;
        scores[3]=100;

        //accessing the elements inside array one by one
        System.out.println(scores[0]);
        System.out.println(scores[1]);
        System.out.println(scores[2]);
        System.out.println(scores[3]);
//updating the value at certain index

        scores[1]=99;
        System.out.println(scores[1]);
//once array is created with certain size, we CAN NOT CHANGE THE SIZE!!!

        //WHEN YOU CREATE new array object
        //it will get default value in each element

        int[] number= new int[3];

        System.out.println(number[0]);
        System.out.println(number[1]);
        System.out.println(number[2]);

        //create an byte array with size 4
        //and store it into a variable called date

        //assign value for each index location
        //print out the values at each index

        //update last index value
        //then print out
    }
}
