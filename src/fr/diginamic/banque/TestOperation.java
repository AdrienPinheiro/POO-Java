package fr.diginamic.banque;

import fr.diginamic.banque.utils.Credit;
import fr.diginamic.banque.utils.Debit;
import fr.diginamic.banque.utils.Operation;

import java.util.ArrayList;

public class TestOperation {
    public static void main(String[] args) {
        float montantFinal = 0;

        Operation[] credits = {new Credit("22 mai", 15f),
                new Credit("28 mai", 28f),
                new Debit("10 aout", 94f),
                new Debit("19 juin", 42f)};

        for(Operation credit : credits){
            if(credit.getType() == "CREDIT"){
                montantFinal += credit.getMontant();
            } else {
                montantFinal -= credit.getMontant();
            }
            System.out.println(credit.getType());
            System.out.println(credit);
        }
        System.out.println("Il vous reste : " + montantFinal + "€.");
    }
}
