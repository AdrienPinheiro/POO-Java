package fr.diginamic.banque;

import fr.diginamic.banque.entites.Compte;
import fr.diginamic.banque.entites.CompteDaoMem;
import fr.diginamic.banque.entites.CompteTaux;

import java.util.ArrayList;
import java.util.Scanner;

public class appBank {

    public static void menu(){
        System.out.println("***** Administration des comptes *****");
        System.out.println("1. Lister les comptes");
        System.out.println("2. Ajouter un nouveau compte");
        System.out.println("3. Ajouter une opération à un compte");
        System.out.println("4. Supprimer un compte");
        System.out.println("99. Sortir");
    }

    public static void comptesList(){
        ArrayList<Compte> comptes = dao.lister();
        for (Compte compte : comptes) {
            System.out.println(compte);
        }
    }
    static CompteDaoMem dao = new CompteDaoMem();

    public static void main(String[] args) {
        int choice;

        Scanner scan = new Scanner(System.in);

        do {
            menu();
            choice = scan.nextInt();
            switch (choice) {
                case 1 -> {
                    comptesList();
                }
                case 2 -> {
                    System.out.println("Veuillez choisir le numéro de compte:");
                    scan.nextLine();
                    String numCompte = scan.nextLine();
                    System.out.println("Veuillez indiquer le solde actuel :");
                    float soldCompte = scan.nextFloat();
                    System.out.println("Veuillez saisir le type de compte (1. NORMAL / 2.REMUNERE)");
                    int typeCompte = scan.nextInt();

                    if(typeCompte == 1){
                        Compte nvCompte = new Compte(Integer.parseInt(numCompte), soldCompte);
                        dao.sauvegarder(nvCompte);
                    } else if (typeCompte == 2) {
                        System.out.println("Veuillez saisir le taux :");
                        float tauxCompte = scan.nextFloat();
                        Compte nvCompte = new CompteTaux(Integer.parseInt(numCompte), soldCompte, tauxCompte);
                        dao.sauvegarder(nvCompte);
                    }
                }
                case 3 -> {
                    comptesList();
                    System.out.println("Veuillez choisir le numéro de compte concerné");
                    scan.nextLine();
                    String choiceCompte = scan.nextLine();
                    if(!dao.existe(choiceCompte)){
                        System.out.println("Compte introuvable");
                        continue;
                    }

                    System.out.println("Veuillez saisir le type d'opération (1. CREDIT / 2. DEBIT):");
                    int choiceOperation = scan.nextInt();
                    System.out.println("Veuillez saisir la date:");
                    scan.nextLine();
                    String dateOperation = scan.nextLine();
                    System.out.println("Veuillez saisir le montant :");
                    float montantOperation = scan.nextFloat();

                    Compte selectCompte = dao.getCompte(choiceCompte);
                    int operations = selectCompte.getOperation();
                    float montantCompte = (float) selectCompte.getSoldeCompte();
                    if(choiceOperation == 1 ){
                        selectCompte.setOperation(++operations);
                        montantCompte += montantOperation;
                        selectCompte.setSoldeCompte(montantCompte);
                    } else if (choiceOperation == 2) {
                        selectCompte.setOperation(++operations);
                        montantCompte -= montantOperation;
                        selectCompte.setSoldeCompte(montantCompte);
                    }
                }
                case 4 -> {
                    comptesList();
                    System.out.println("Veuillez choisir le numéro de compte à supprimer :");
                    scan.nextLine();
                    String choiceCompte = scan.nextLine();
                    if(!dao.existe(choiceCompte)){
                        System.out.println("Compte non trouvé ou inexistant");
                    }
                    boolean deleteCompte = dao.supprimer(choiceCompte);
                    if(deleteCompte){
                        System.out.println("Compte supprimé");
                    } else {
                        System.out.println("Problème serveur");
                    }
                }
                case 99 -> {
                    System.out.println("Aurevoir ☹");
                    scan.close();
                }
                default -> System.out.println("Veuillez choisir un menu énoncé !");
            }
        } while (choice != 99);

    }

}
