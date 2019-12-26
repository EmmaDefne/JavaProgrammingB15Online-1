package day12;

public class Weather_IfElse {
    public static void main(String[] args) {
        String weather = "snowy";
        if (weather =="sunny"){
            System.out.println(" Code in sunny weather!");
        }else if (weather == "rainy"){ //bunu (weather.equals("Rainy")) seklide de yazabilirsin
            System.out.println(" code in rainy weather!");
        }else if (weather =="cloudy"){
            System.out.println("code in cloudy weather!");
        }else if (weather =="snowy"){
            System.out.println("Code in snowy weather!");
        }else{
            System.out.println("rain or shine just keep coding anyway!!!");
        }
    }
}
