package day17;

public class FullNameCorrector {
    public static void main(String[] args) {
        //               0123456789012
        String fullName="emeL GuMustoP";
        String firstName= fullName.substring(0,4);
        String lastName=fullName.substring(5);

      //  int indexOfSpace=fullName.indexOf("");bununla space i bulurum
        //String firstName= fullName.substring(0,indexOfSpace); buraya koyarsam space e kadar kismi alir

        String firstNameCorrected
                =firstName.toUpperCase().substring(0,1)+ firstName.toLowerCase().substring(1);
        //yukarda 0,1 yaziyoruz yani 1 de dur diyoruz, 1 yazip birakmanda 1 ve devami demek

        String lastNameCorrected
                =lastName.toUpperCase().substring(0,1)+lastName.toLowerCase().substring(1);
        System.out.println("Your full name is; " + firstNameCorrected +" "+ lastNameCorrected);

    }
}
