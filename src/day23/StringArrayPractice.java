package day23;

public class StringArrayPractice {

    public static void main(String[] args) {
        String[] shows={"Orville", "Gifted", "Game of Throne", "Flash", "Arrow","Super girl"};

        int showsCount=shows.length;
        System.out.println("Shows Count=" + showsCount);

        for (int x = 0; x <showsCount ; x++) {
            String currentShow= shows[x];
            System.out.println(currentShow+" has character count"+ currentShow.length());
        }

        String myFavoriteShow=shows[0];
        System.out.println("My Favorite Show is " + myFavoriteShow);
        System.out.println("my favorite show character count is : " + myFavoriteShow.length());
        System.out.println(shows[1] +" has character count: " + shows[1].length());

    }
}
