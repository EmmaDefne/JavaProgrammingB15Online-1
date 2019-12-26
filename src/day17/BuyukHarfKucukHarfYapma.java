package day17;

public class BuyukHarfKucukHarfYapma {
    public static void main(String[] args) {

        String name="emeL";

        String namefixed=(name.charAt(0)+"").toUpperCase();// charatten sonra "" kullanmazsan methodu cagiramazsin
        namefixed += name.substring(1).toLowerCase();
        System.out.println("namefixed = " + namefixed);

    }
}
