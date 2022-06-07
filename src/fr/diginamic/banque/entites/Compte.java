package fr.diginamic.banque.entites;

public class Compte {
    private int numCompte;
    private float soldeCompte;
    private int operation = 0;

    public Compte(int numCompte, float soldeCompte) {
        this.numCompte = numCompte;
        this.soldeCompte = soldeCompte;
    }

    public Compte(int numCompte, float soldeCompte, int operation) {
        this.numCompte = numCompte;
        this.soldeCompte = soldeCompte;
        this.operation = operation;
    }

    public int getOperation() {
        return operation;
    }

    public void setOperation(int operation) {
        this.operation = operation;
    }

    @Override
    public String toString() {
        return "Numero : " + numCompte +
                " - Nombre d'opération" + (operation <= 1 ? " : ": "s : ") + operation +
                " - Solde : " + soldeCompte + "€";
    }

    public int getNumCompte() {
        return numCompte;
    }

    public void setNumCompte(int numCompte) {
        this.numCompte = numCompte;
    }

    public double getSoldeCompte() {
        return soldeCompte;
    }

    public void setSoldeCompte(float soldeCompte) {
        this.soldeCompte = soldeCompte;
    }
}
