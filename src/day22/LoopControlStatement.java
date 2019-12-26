package day22;

public class LoopControlStatement {
    /*
    Store this sentence in a variable msg
I struggle with Java I Like Java I love Java Everything is Awesome!
loop through each and every letter
1, print every other letter
 meaning : skip a letter each time you go through the letter
	0123456789
	I struggle with  -->> Isrgl ih
	USE CONTINUE FOR THIS TASK
2,  when you reach letter a break the loop
OPTIONALLY ; BREAK WHEN YOU SEE 3RD A case insensitive //A HARFI GELINCE DURDUR CIK PROGRAMDAN
     */

    public static void main(String[] args) {
        String msg = " I struggle with Java I like Java I love Java Everything is awesome!!!";

        for (int i = 0; i < msg.length(); i++) {
            if (i % 2 == 1)
                continue;
            System.out.print( msg.charAt(i));
        }
        System.out.println();

        for (int i = 0; i <=msg.length()-1 ; i++) {
            if(msg.substring(i,i+1).equalsIgnoreCase("a")){
                break;
            }
            System.out.print(msg.charAt(i)+"");
        }
        }
    }


