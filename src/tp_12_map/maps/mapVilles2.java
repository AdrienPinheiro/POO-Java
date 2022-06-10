package tp_12_map.maps;

import tp_10_collections_list.liste_object.Continent;
import tp_10_collections_list.liste_object.Ville;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class mapVilles2 {
    public static void main(String[] args) {
        HashMap<String, Ville> villes = new HashMap<>();
        villes.put("Nice", new Ville("Nice", 343000, Continent.EUROPE));
        villes.put("Carcassonne", new Ville("Carcassonne", 50000, Continent.EUROPE));
        villes.put("Narbonne", new Ville("Narbonne", 120000, Continent.EUROPE));
        villes.put("Marseille", new Ville("Marseille", 1200000, Continent.EUROPE));
        villes.put("Lyon", new Ville("Lyon", 484000, Continent.EUROPE));
        villes.put("Foix", new Ville("Foix", 9700, Continent.EUROPE));
        villes.put("Pau", new Ville("Pau", 77200, Continent.EUROPE));
        villes.put("Tarbes", new Ville("Tarbes", 40600, Continent.EUROPE));

        String key = "";
        int nbrHab = 1000000;
        Iterator<Ville> valuesIte = villes.values().iterator();
        for(Map.Entry entry : villes.entrySet()){
            Ville test = valuesIte.next();
            if(test.getNbrHab() < nbrHab){
                nbrHab = test.getNbrHab();
                key = (String) entry.getKey();
            }
        }
        villes.remove(key);
        System.out.println(villes);
    }
}
