package approche_object.entites2;

import approche_object.entites.AdressePostale;

public class Personne {
    String nom;
    String prenom;
    AdressePostale adresse;

    public Personne(String nom, String prenom, AdressePostale adresse) {
        this.nom = nom;
        this.prenom = prenom;
        this.adresse = adresse;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public String getNomPrenom(){
        return prenom+" "+nom.toUpperCase();
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public AdressePostale getAdresse() {
        return adresse;
    }

    public void setAdresse(AdressePostale adresse) {
        this.adresse = adresse;
    }
}
