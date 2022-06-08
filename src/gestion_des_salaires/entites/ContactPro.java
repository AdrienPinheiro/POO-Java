package gestion_des_salaires.entites;

public class ContactPro {

    private int numTelPro;
    private String mail;
    private String service;
    private Adresse adresse;

    public ContactPro(int numTelPro, String mail, String service, Adresse adresse) {
        this.numTelPro = numTelPro;
        this.mail = mail;
        this.service = service;
        this.adresse = adresse;
    }

    public int getNumTelPro() {
        return numTelPro;
    }

    public void setNumTelPro(int numTelPro) {
        this.numTelPro = numTelPro;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getService() {
        return service;
    }

    public void setService(String service) {
        this.service = service;
    }

    public Adresse getAdresse() {
        return adresse;
    }

    public void setAdresse(Adresse adresse) {
        this.adresse = adresse;
    }

    @Override
    public String toString() {
        return numTelPro + " " + mail + " " + service;
    }
}
