package entites;

import entites2.Personne;

public class TestPersonne {
    public static void main(String[] args) {
        Personne Julien = new Personne("Picquet", "Julien", new AdressePostale(302, "avenue d'Uber eat", 31000, "Angros"));
        Personne Pierre = new Personne("Tremblay", "Pierre", new AdressePostale(302, "avenue du MacGros", 31200, "La Panpouze"));

        System.out.println(Pierre.getNomPrenom());
    }
}
