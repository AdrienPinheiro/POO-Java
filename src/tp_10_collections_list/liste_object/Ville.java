package tp_10_collections_list.liste_object;

import java.util.ArrayList;
import java.util.Collections;

public class Ville {
    private String nom;
    private int nbrHab;
    public Ville(String nom, int nbrHab) {
        this.nom = nom;
        this.nbrHab = nbrHab;
    }

    @Override
    public String toString() {
        return nom + " avec " + nbrHab +" habitant.";
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getNbrHab() {
        return nbrHab;
    }

    public void setNbrHab(int nbrHab) {
        this.nbrHab = nbrHab;
    }

    public static void main(String[] args) {
        ArrayList<Ville> villes = new ArrayList<>();
        Collections.addAll(villes, new Ville("Nice", 343000),
                new Ville("Carcassonne", 47800),
                new Ville("Narbonne", 53400),
                new Ville("Lyon", 484000),
                new Ville("Foix", 9700),
                new Ville("Pau", 77200),
                new Ville("Marseille", 850700),
                new Ville("Tarbes", 40600));
        System.out.println(villes);

        // Afficher la ville la plus peuplée
        int max = 0;
        int index = 0;
        for (int i =0; i<villes.size(); i++) {
            if(villes.get(i).getNbrHab()>max){
                max = villes.get(i).getNbrHab();
                index = i;
            }
        }
        System.out.println("La ville la plus peuplée est " + villes.get(index));

        // Supprimer la ville la moins peuplée
        for (int i =0; i<villes.size(); i++) {
            if(villes.get(i).getNbrHab() < max){
                max = villes.get(i).getNbrHab();
                index = i;
            }
        }
        villes.remove(index);
        System.out.println(villes);

        // Si + de 100 000 hab alors majuscule
        for (int i = 0; i<villes.size(); i++){
            if(villes.get(i).getNbrHab()>100000){
                villes.get(i).setNom(villes.get(i).getNom().toUpperCase());
            }
        }
        System.out.println(villes);
    }
}
