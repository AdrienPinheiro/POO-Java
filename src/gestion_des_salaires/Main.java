package gestion_des_salaires;

import gestion_des_salaires.entites.*;

import gestion_des_salaires.utils.CalculCadre;
import gestion_des_salaires.utils.CalculCommercial;
import gestion_des_salaires.utils.CalculSalaire;
import gestion_des_salaires.utils.CalculTech;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Adresse adresse = new Adresse("49", "Rue Euro UberEat", 31400, "Toulouse");
        ContactPerso contactPerso = new ContactPerso(0625252525, "juju@uber.com");
        ContactPro contactPro = new ContactPro(062525252, "juju.pro@eat.com", "mangeurPro",adresse);
        Employe employe = new Employe("Picquet", "Julien", "09 54 1254", adresse, contactPerso, "69", contactPro, Type.CADRE);
        System.out.println(employe);
        String mission = employe.cadreMission(employe.getType());
        if(mission != null){
            System.out.println(mission);
        }

        CalculCadre cadre = new CalculCadre(150);
        cadre.calculSalaireBrut();
        cadre.calculSalaireNet();
        System.out.println(cadre);

        CalculTech tech = new CalculTech(20);
        tech.calculSalaireBrut();
        tech.calculSalaireNet();
        System.out.println(tech);

        CalculCommercial commercial = new CalculCommercial(150000);
        commercial.calculSalaireBrut();
        commercial.calculSalaireNet();
        System.out.println(commercial);
    }
}
