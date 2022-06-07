package fr.diginamic.banque.entites;

import java.util.ArrayList;

public class CompteDaoMem implements CompteDao{
    public ArrayList<Compte> allCompte = new ArrayList<>();

    @Override
    public ArrayList<Compte> lister() {
        return allCompte;
    }

    @Override
    public void sauvegarder(Compte nvCompte) {
        allCompte.add(nvCompte);
        System.out.println("Compte ajouté");
    }

    @Override
    public boolean supprimer(String numero) {
        for (int i = 0; i<allCompte.size(); i++){
            if(allCompte.get(i).getNumCompte() == Integer.parseInt(numero)){
                allCompte.remove(i);
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean existe(String numero) {
        for(Compte compte : allCompte){
            if(compte.getNumCompte() == Integer.parseInt(numero)){
                return true;
            }
        }
        return false;
    }

    @Override
    public Compte getCompte(String numero) {
        for(int i = 0; i<allCompte.size(); i++){
            if(allCompte.get(i).getNumCompte() == Integer.parseInt(numero)){
                return allCompte.get(i);
            }
        }
        return null;
    }
}
