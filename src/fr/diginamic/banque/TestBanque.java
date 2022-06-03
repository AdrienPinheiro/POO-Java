package fr.diginamic.banque;

import fr.diginamic.banque.entites.Compte;
import fr.diginamic.banque.entites.CompteTaux;

import java.util.ArrayList;

public class TestBanque {
    public static void main(String[] args) {
        Compte[] comptes = {new Compte(136165416, 123.15),
                new CompteTaux(464346, 464.78, 10.2f)};

        ArrayList<Compte> comptesArray = new ArrayList<>();
        comptesArray.add(new Compte(136165416, 123.15));
        comptesArray.add(new CompteTaux(464346, 464.78, 10.2f));

        for (Compte compte : comptes) {
            System.out.println(compte);
        }
    }
}
