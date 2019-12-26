package day12;

public class LoginTest_v2 {
    public static void main(String[] args) {
        String userName= "abc123";

        boolean userNameCorrect =userName.equals("ABC123");

        System.out.println( userNameCorrect);

        boolean nameCheckIgnoreCase = userName.equalsIgnoreCase("ABC123");

        System.out.println(nameCheckIgnoreCase);

        //burda ilkinde username in birebir ayni olmasini sorguluyoruz
        //ikincisinde buyuk kucuk harf umursamadan check ediyoruz
    }
}
