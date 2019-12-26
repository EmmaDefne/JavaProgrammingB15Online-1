package day27;

public class Multi_Dimensional_Arrays_Practice {

    public static void main(String[] args) {

//N dimensional array MUST CONTAINS (N-1) dimensional arrays

        //2 dimensional array

             //                  0        1               0      1
        String[][] names={  { "Ruya" , "Ghoya", } ,{  "Hasan", "Tina"   } };
                //                    0                        1

        //print Hasan;

names[1][1]="emel";// bunu koyarsan artik tina yerine emel yazar
        System.out.println("Hasan = " + names[1][0]);
        System.out.println("Ruya = " + names[0][0]);
        System.out.println("Tina = " + names[1][1]);







    }
}
