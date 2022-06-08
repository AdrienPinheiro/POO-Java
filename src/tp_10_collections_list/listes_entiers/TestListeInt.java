package tp_10_collections_list.listes_entiers;

import java.util.ArrayList;
import java.util.Collections;

public class TestListeInt {
    public static void main(String[] args) {
        ArrayList<Integer> entiers = new ArrayList<>();
        Collections.addAll(entiers, -1, 5,7,3,-2,4,8,5);

        // Affichage du tableau
        System.out.println(entiers);

        // Affichage de la taille
        System.out.println(entiers.size());

        // Affichage du max
        Integer max = Collections.max(entiers);
        System.out.println(max);

        // Supprimer le min
        entiers.remove(Collections.min(entiers));
        System.out.println(entiers);

        // Entier neg devient positive
        for(int i = 0; i<entiers.size();i++){
            if(entiers.get(i)<0){
                entiers.set(i, -entiers.get(i));
            }
        }
        // Afficher la liste résultante
        System.out.println(entiers);
    }
}
