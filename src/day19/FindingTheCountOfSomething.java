package day19;

public class FindingTheCountOfSomething {

    public static void main(String[] args) {

        //from 1-100 print out all the numbers can be divided by 15 without remainder

int counter=1;
        for (int i = 1; i<=100 ; i++) {
            if (i%15==0){


            System.out.print(i+" ");

            ++counter;

            }
        }
        System.out.print("counter" + counter); //bunu koydugum {} ara onemli yanlis yere koyarsan yanlis sonuc cikiyor



        //given a string with value
        //find out how many a showed in this string

        String name="Esra Fidan";
       // System.out.println(name.charAt(0)=='a');
        int countOfA=0;

        for (int x = 0; x <name.length() ; x++) {

           System.out.println(name.charAt(x));
            if (name.charAt(x)=='a'){
                System.out.println("bingo found it!");
                ++countOfA;
            }

        }
        System.out.println("countOfA" + countOfA);
    }






}
