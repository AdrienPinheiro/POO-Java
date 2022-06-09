package tp_13_tri.tri;


import java.util.ArrayList;
import java.util.Collections;

public class Ville implements Comparable<Ville>{
    private String nom;
    private int nbrHab;

    public Ville(String nom, int nbrHab) {
        this.nom = nom;
        this.nbrHab = nbrHab;
    }

    @Override
    public int compareTo(Ville ville) {
        return Long.compare(this.getNbrHab(), ville.getNbrHab());
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

    public String toString() {
        return nom + " avec " + nbrHab +" habitant.";
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

        /* Alphabétique => il faut remodifier le compare
        System.out.println("Avant : " +villes);
        Collections.sort(villes);
        System.out.println("Après : "+ villes); */

        // Hab
        System.out.println("Avant : " +villes);
        Collections.sort(villes);
        System.out.println("Après : "+ villes);

    }


}
