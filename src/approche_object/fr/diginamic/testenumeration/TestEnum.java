package approche_object.fr.diginamic.testenumeration;


public class TestEnum {
    public static void main(String[] args) {
        Saison[] saisons = Saison.values();
        for(Saison saison: saisons){
            System.out.println(saison.getNom());
        }

        String nom = "ETE";
        System.out.println(Saison.valueOf(nom));

        String libelle = "Hiver";
        for(Saison saison: saisons){
            if(libelle.equals(saison.getNom())){
                System.out.println(saison +" à la place "+ saison.getPlace());
            }
        }
    }
}
