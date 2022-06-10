package tp_10_collections_list.liste_object;

public class TestEquals extends Ville {
    public TestEquals(String nom, int nbrHab, Continent continent) {
        super(nom, nbrHab, continent);
    }

    public static void main(String[] args) {

        // return vrai
        Ville v1 = new Ville("Nice", 343000, Continent.EUROPE);
        Ville v2 = v1;

        boolean result = v1.equals(v2);
        System.out.println(result);

        // return faux
        Ville v3 = new Ville("Nice", 343000, Continent.EUROPE);
        Ville v4 = new Ville("Nice", 343000, Continent.EUROPE);

        boolean result2 = v3.equals(v4);
        System.out.println(result2);
        System.out.println(v3 == v4);
    }


}
