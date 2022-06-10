package tp_10_collections_list.liste_object;

public enum Continent {
    EUROPE("Europe"),
    ASIE("Asie"),
    AFRIQUE("Afrique"),
    OCEANIE("Océanie"),
    AMERIQUE("Amérique");

    private String name;
    Continent(String name) {
        this.name = name;
    }

    public String getNom(){
        return name;
    }
}
