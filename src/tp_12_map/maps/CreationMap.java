package tp_12_map.maps;

import java.util.Collections;
import java.util.HashMap;

public class CreationMap {
    public static void main(String[] args) {
        HashMap<String, Integer> employes = new HashMap();
        employes.put("Paul", 1750);
        employes.put("Hicham", 1825);
        employes.put("Yu", 2250);
        employes.put("Ingrid", 2015);
        employes.put("Chantal", 2418);

        System.out.println(employes.size());
    }
}
