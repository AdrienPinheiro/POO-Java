package gestion_des_salaires.entites;

import java.util.ArrayList;

public class Employe extends Personne implements Mission{
    private String matricule;
    private ContactPro contactPro;
    private Type type;

    private ArrayList<Employe> employes = new ArrayList<>();


    public Employe(String nom, String prenom, String numSecuSocial, Adresse adresse, ContactPerso contactPerso, String matricule, ContactPro contactPro, Type type) {
        super(nom, prenom, numSecuSocial, adresse, contactPerso);
        this.matricule = matricule;
        this.contactPro = contactPro;
        this.type = type;
    }

    public Type getType() {
        return type;
    }

    public ArrayList<Employe> getEmployes() {
        return employes;
    }

    public void setEmployes(ArrayList<Employe> employes) {
        this.employes = employes;
    }

    public void setType(Type type) {
        this.type = type;
    }

    public String getMatricule() {
        return matricule;
    }

    public void setMatricule(String matricule) {
        this.matricule = matricule;
    }

    public ContactPro getContactPro() {
        return contactPro;
    }

    public void setContactPro(ContactPro contactPro) {
        this.contactPro = contactPro;
    }

    @Override
    public String toString() {
        return super.toString() + ". Il a pour matricule " + matricule + " et son employe est de type " + type + ". Son contact pro est " + contactPro;
    }

    @Override
    public String cadreMission(Type metier) {
        if(metier == Type.CADRE){
            return "Gérer les projets.";
        }
        return null;
    }

    @Override
    public String technicienMission(Type metier) {
        if(metier == Type.TECHNICIEN){
            return "Fabriquer et contrôle les produits de l'entreprise.";
        }
        return null;
    }

    @Override
    public String commercialMission(Type metier) {
        if(metier == Type.COMMERCIAL){
            return "Trouve de nouveaux contacts.";
        }
        return null;
    }
}
