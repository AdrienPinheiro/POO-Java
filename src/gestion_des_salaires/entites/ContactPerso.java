package gestion_des_salaires.entites;

public class ContactPerso {
    private int numTel;
    private String mail;

    public ContactPerso(int numTel, String mail) {
        this.numTel = numTel;
        this.mail = mail;
    }

    public int getNumTel() {
        return numTel;
    }

    public void setNumTel(int numTel) {
        this.numTel = numTel;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    @Override
    public String toString() {
        return numTel + ", " + mail;
    }
}
