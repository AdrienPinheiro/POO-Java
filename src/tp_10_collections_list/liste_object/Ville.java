package tp_10_collections_list.liste_object;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Objects;

public class Ville {
    private String nom;
    private int nbrHab;
    private Continent continent;
    public Ville(String nom, int nbrHab, Continent continent) {
        this.nom = nom;
        this.nbrHab = nbrHab;
        this.continent = continent;
    }

    public Continent getContinent() {
        return continent;
    }

    public void setContinent(Continent continent) {
        this.continent = continent;
    }

    @Override
    public String toString() {
        return nom + " avec " + nbrHab +" habitant, fait partie du continent : " + continent.getNom() +".";
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Ville)) return false;
        Ville ville = (Ville) o;
        return getNbrHab() == ville.getNbrHab() && getNom().equals(ville.getNom());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getNom(), getNbrHab());
    }

    public static void main(String[] args) {
        ArrayList<Ville> villes = new ArrayList<>();
        Collections.addAll(villes, new Ville("Nice", 343000, Continent.EUROPE),
                new Ville("Carcassonne", 47800, Continent.EUROPE),
                new Ville("Narbonne", 53400, Continent.EUROPE),
                new Ville("Lyon", 484000, Continent.EUROPE),
                new Ville("Foix", 9700, Continent.EUROPE),
                new Ville("Pau", 77200, Continent.EUROPE),
                new Ville("Marseille", 850700, Continent.EUROPE),
                new Ville("Tarbes", 40600, Continent.EUROPE));
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
