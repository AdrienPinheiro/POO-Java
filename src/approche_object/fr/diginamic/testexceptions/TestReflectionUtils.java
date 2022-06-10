package approche_object.fr.diginamic.testexceptions;

import tp_10_collections_list.liste_object.Continent;
import tp_10_collections_list.liste_object.Ville;

public class TestReflectionUtils {
    public static void main(String[] args) throws IllegalAccessException, ReflectionException {
        Ville ville = new Ville("Nantes", 300_000, Continent.EUROPE);
        ReflectionUtils.afficherAttributs(null);
    }
}
