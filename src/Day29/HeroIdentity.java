package Day29;

public class HeroIdentity {
    public static void main(String[] args) {



        //assume this can be different hero


        //hide this hero identity
        //string heroX="Superman=*******";

        //given a String with hero code and name seperated by -
        //turn this string into hero code and * with same lenght as hero name

        //plain english logic:
        //split it by - to get the code and full name
        //get the lenght of full name
        //generate stars with same lenght as full name character count
        //concatenate hercode with dash and stars and save it
        //or one star is generated , replace full name with stars
        String hero1="Superman-Clark J Kent";

        String [] heroSplitted=hero1.split("-");
        String heroCode=heroSplitted[0];
        String fullName=heroSplitted[1];

        int nameCharCount=fullName.length();
        String stars="";
        for (int i = 0; i <nameCharCount ; i++) {
            stars=stars+ "*";  //stars+="*"; //burda amac ayni uzunluga denk gelecek yildiz basmak

        }
        System.out.println("fullName = " + fullName);
        System.out.println("stars = " + stars);

        String heroX=heroCode+ "-" + stars;
        System.out.println("hero1 = " + hero1);
        System.out.println("heroX = " + heroX);
    }
}
