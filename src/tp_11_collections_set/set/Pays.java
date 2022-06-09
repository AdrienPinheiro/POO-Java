package tp_11_collections_set.set;

import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;

public class Pays {
    private String nom;
    private int nbrHab;
    private double PibHab;

    public Pays(String nom, int nbrHab, double pibHab) {
        this.nom = nom;
        this.nbrHab = nbrHab;
        PibHab = pibHab;
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

    public double getPibHab() {
        return PibHab;
    }

    public void setPibHab(double pibHab) {
        PibHab = pibHab;
    }

    @Override
    public String toString() {
        return nom + " a " + nbrHab + " habitant avec un PIB/hab de " + PibHab + " $.";
    }

    public static void main(String[] args) {
        HashSet<Pays> pays = new HashSet<>();
        Collections.addAll(pays, new Pays("USA", 326000000, 63543.58),
                new Pays("France", 67000000, 38625),
                new Pays("Allemagne", 80000000, 45723.64),
                new Pays("UK", 60000000, 40284.64),
                new Pays("Italie", 60000000, 31676.20),
                new Pays("Japon", 126000000, 40113.06),
                new Pays("Chine", 1300000000, 10500.40),
                new Pays("Russie", 146000000, 10126.72),
                new Pays("Inde", 12000000, 1900.40));

        System.out.println(pays);

        // Le pays avec PIB/hab le + important
        Pays paysMaxPibHab = pays.iterator().next();
        for(Pays p : pays){
            if(p.getPibHab()> paysMaxPibHab.getPibHab()){
                paysMaxPibHab = p;
            }
        }
        System.out.println(paysMaxPibHab);

        // Le pays avec le Pib total le plus important
        long maxPib = 0;
        Pays paysMaxPib = null;
        for(Pays p : pays){
            long testMaxPib = (long) ((long) p.getNbrHab() *  p.getPibHab());
            if(testMaxPib > maxPib){
                maxPib = testMaxPib;
                paysMaxPib = p;
            }
        }
        System.out.println(paysMaxPib + " a un PIB total de " + maxPib + "$.");

        //Le pays avec le PIB total le plus petit + en majuscule
        Pays paysMinPib = null;
        for(Pays p : pays){
            long testMinPib = (long) ((long) p.getNbrHab() * p.getPibHab());
            if(testMinPib < maxPib){
                maxPib = testMinPib;
                paysMinPib = p;
            }
        }
        paysMinPib.setNom(paysMinPib.getNom().toUpperCase());
        System.out.println(paysMinPib + " a un PIB total de " + maxPib + "$.");

        // Suppression du pays avec le PIB le plus petit
        pays.remove(paysMinPib);
        System.out.println(pays);
    }
}
