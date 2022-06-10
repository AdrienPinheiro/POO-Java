package tp_10_collections_list.liste_object;

import java.util.ArrayList;
import java.util.Collections;

public class TestContinentAvecEnum extends Ville{
    public TestContinentAvecEnum(String nom, int nbrHab, Continent continent) {
        super(nom, nbrHab, continent);
    }

    public static void main(String[] args) {
        ArrayList<Ville> villes = new ArrayList<>();
        Collections.addAll(villes, new Ville("Nice", 343000, Continent.EUROPE),
                new Ville("Carcassonne", 47800, Continent.AFRIQUE),
                new Ville("Narbonne", 53400, Continent.AMERIQUE),
                new Ville("Lyon", 484000, Continent.ASIE),
                new Ville("Foix", 9700, Continent.OCEANIE));

        for (Ville ville : villes){
            System.out.println(ville);
        }
    }
}
