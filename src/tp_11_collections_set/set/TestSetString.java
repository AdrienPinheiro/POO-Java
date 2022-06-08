package tp_11_collections_set.set;

import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;

public class TestSetString {
    public static void main(String[] args) {
        HashSet<String> stringTest = new HashSet<>();
        Collections.addAll(stringTest, "USA", "France", "Allemagne", "UK", "Italie", "Japon", "Chine", "Russie", "Inde");

        // Prendre le pays avec le plus grand nombre de caractère
        Iterator<String> iter = stringTest.iterator();
        int max = 0;
        String grandPays = "";
        for(int i = 0; i<stringTest.size(); i++){
            String pays = iter.next();
            if(pays.length()>max){
                max = pays.length();
                grandPays = pays;
            }
        }
        System.out.println(grandPays);

        //Supprimer le plus grand
        stringTest.remove(grandPays);
        System.out.println(stringTest);
    }
}
