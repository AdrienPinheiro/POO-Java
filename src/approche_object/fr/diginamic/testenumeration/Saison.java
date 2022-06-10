package approche_object.fr.diginamic.testenumeration;

public enum Saison {
    PRINTEMPS("Printemps", 1),
    ETE("Eté", 2),
    AUTOMNE("Automne", 3),
    HIVER("Hiver", 4);

    private int place;
    private String saison;
    Saison(String saison, int place) {
        this.saison = saison;
        this.place = place;
    }

    public String getNom(){
        return saison;
    }

    public int getPlace(){
        return place;
    }

}
