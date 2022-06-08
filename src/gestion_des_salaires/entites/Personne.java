package gestion_des_salaires.entites;

public abstract class Personne {
    private String nom;
    private String prenom;
    private String numSecuSocial;
    private Adresse adresse;
    private ContactPerso contactPerso;

    public Personne(String nom, String prenom, String numSecuSocial, Adresse adresse, ContactPerso contactPerso) {
        this.nom = nom;
        this.prenom = prenom;
        this.numSecuSocial = numSecuSocial;
        this.adresse = adresse;
        this.contactPerso = contactPerso;
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

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getNumSecuSocial() {
        return numSecuSocial;
    }

    public void setNumSecuSocial(String numSecuSocial) {
        this.numSecuSocial = numSecuSocial;
    }

    public Adresse getAdresse() {
        return adresse;
    }

    public void setAdresse(Adresse adresse) {
        this.adresse = adresse;
    }

    public ContactPerso getContactPerso() {
        return contactPerso;
    }

    public void setContactPerso(ContactPerso contactPerso) {
        this.contactPerso = contactPerso;
    }

    @Override
    public String toString() {
        return nom + " " + prenom + " a pour numéro sociale " + numSecuSocial + ", il habite au " + adresse + " et ses coordonnées sont " + contactPerso;
    }
}
