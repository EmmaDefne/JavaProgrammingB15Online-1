package day12;

public class Weather_IfElse_Equals {
    public static void main(String[] args) {
        String weather="Rainy";

        if (weather.equals("Rainy")){
            System.out.println("code in Rainy weather");
        } else if (weather.equals("Sunny")){
            System.out.println("code in sunny weather");
        }else if (weather.equals("snowy")){
            System.out.println("code in snowy weather");
        }else if (weather.equals("cloudy")){
            System.out.println("code in cloudy weather");
        }else {
            System.out.println("rain or shine just keep coding anyway");
        }
        //else koymasam sadece if koysam da olur, bu sefer de kendine uyan kosulda digerlerini kontrol etmez
        //rainy day i gordugu yerde ciktiyi verir.
    }
}
//if ( weather.equals("Sunny") || weather.equals("Rainy") || weather.equals("Cloudy") || weather.equals("Snowy"))
//        {        System.out.println("Code in " + weather + " weather");}
