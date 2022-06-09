package tp_12_map.maps;

import java.util.HashMap;
import java.util.Map;

public class mapVilles {

    public static void main(String args[]) {

    HashMap<Integer, String> mapVilles = new HashMap<>();
    mapVilles.put(13, "Marseille");
    mapVilles.put(34, "Montpellier");
    mapVilles.put(44, "Nantes");
    mapVilles.put(75, "Paris");
    mapVilles.put(31, "Toulouse");


    //TODO Développements à réaliser ci-dessous
    mapVilles.put(69, "Lyon");
    mapVilles.put(59, "Lille");
    mapVilles.put(33, "Bordeaux");

    for(Map.Entry<Integer, String> entry : mapVilles.entrySet()){
        Integer key = entry.getKey();
        String value = entry.getValue();
        System.out.println("Clé : " + key + ", Valeur : " + value);
    }
    System.out.println("Il y a " +mapVilles.size() + " clés différentes dans la map.");
    }
}
