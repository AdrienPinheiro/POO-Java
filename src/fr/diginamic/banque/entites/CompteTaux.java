package fr.diginamic.banque.entites;

public class CompteTaux extends Compte {

    private float tauxRenum;

    public CompteTaux(int numCompte, float soldeCompte, float tauxRenum) {
        super(numCompte, soldeCompte);
        this.tauxRenum = tauxRenum;
    }

    @Override
    public String toString() {
        return super.toString() + " - Taux : " + tauxRenum+"%";
    }
}
