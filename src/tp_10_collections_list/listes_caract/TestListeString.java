package tp_10_collections_list.listes_caract;

import java.util.ArrayList;
import java.util.Collections;

public class TestListeString {
    public static void main(String[] args) {
        ArrayList<String> stringArray = new ArrayList<>();
        Collections.addAll(stringArray, "Nice", "Carcassonne", "Narbonne", "Lyon", "Foix", "Pau", "Marseille", "Tarbes");

        // Qui a le plus nombre de lettre
        int max = 0;
        int index = 0;
        for (int i = 0; i<stringArray.size(); i++){
            if(stringArray.get(i).length() > max){
                max = stringArray.get(i).length();
                index = i;
            }
        }
        System.out.println("Le mot le plus long fait " + max + " lettres, c'est " + stringArray.get(index) + ".");

        // Mettre tout les mots en majuscule
       stringArray.replaceAll(String::toUpperCase);
       System.out.println(stringArray);

       // Supprimer les villes commançant par N
        stringArray.removeIf(v -> v.startsWith("N"));
        System.out.println(stringArray);
    }
}
