package fr.diginamic.banque.utils;

public abstract class Operation {
    private String date;
    private float montant;

    public Operation(String date, float montant) {
        this.date = date;
        this.montant = montant;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public float getMontant() {
        return montant;
    }

    public void setMontant(float montant) {
        this.montant = montant;
    }

    @Override
    public String toString() {
        return "Date de l'operation : le "
                + date + " avec pour montant "
                + montant + "€.";
    }

    public abstract String getType();
}
