package fr.diginamic.banque.entites;

import java.util.ArrayList;

public interface CompteDao {
    ArrayList<Compte> lister();

    void sauvegarder(Compte nvCompte);

    boolean supprimer(String numero);

    boolean existe(String numero);

    Compte getCompte(String numero);
}
