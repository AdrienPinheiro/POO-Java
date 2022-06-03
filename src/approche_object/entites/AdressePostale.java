package approche_object.entites;

public class AdressePostale{
    int numRue;
    String nomRue;
    int codePostal;
    String ville;

    public AdressePostale(int numRue, String nomRue, int codePostal, String ville) {
        this.numRue = numRue;
        this.nomRue = nomRue;
        this.codePostal = codePostal;
        this.ville = ville;
    }

    public int getNumRue() {
        return numRue;
    }

    public void setNumRue(int numRue) {
        this.numRue = numRue;
    }

    public String getNomRue() {
        return nomRue;
    }

    public void setNomRue(String nomRue) {
        this.nomRue = nomRue;
    }

    public int getCodePostal() {
        return codePostal;
    }

    public void setCodePostal(int codePostal) {
        this.codePostal = codePostal;
    }

    public String getVille() {
        return ville;
    }

    public void setVille(String ville) {
        this.ville = ville;
    }
}
