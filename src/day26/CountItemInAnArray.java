package day26;

import java.util.Arrays;

public class CountItemInAnArray {
    public static void main(String[] args) {

        String[] marvelHeros ={"Iron Man" , "Captain America" , "Spiderman" , "Black Panther",
        "Hulk" , "Black Widow" , " Wanda" , "Captain Marvel", "Captain America","Spiderman",  "Black Widow",
                " Wanda" ,"Captain Marvel","Captain America"  };

        System.out.println("Marvel Heros ="  + Arrays.toString(marvelHeros));
        int sizeOfArray= marvelHeros.length;
        System.out.println("hero count=" + sizeOfArray);

        String itemToSearch="Iron Man";
        int countOfItem=0;


        for (String eachHero : marvelHeros) {
            if (eachHero.equals(itemToSearch)){
                countOfItem++;
            }
        }

        //count the hero with the name contains black  in case insensive manner

int cntOfBlackInName=0;
        for (String eachHero : marvelHeros) {

            //in order to not care about the case, make all lowercase then check contains
            if (eachHero.toLowerCase().contains("black")){
                cntOfBlackInName ++;
            }

        }

        System.out.println("cntOfBlackInName = " + cntOfBlackInName);    }
}
