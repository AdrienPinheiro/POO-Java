package tp_10_collections_list.listes;

import java.util.ArrayList;

public class CreationListe {
    public static void main(String[] args) {
        ArrayList<Integer> entier = new ArrayList<>();

        for(int i = 0; i<100; i++){
            entier.add(i+1);
        }
        System.out.println(entier.size());
    }
}
