package gestion_des_salaires.entites;

public interface Mission {

    String cadreMission(Type metier);

    String technicienMission(Type metier);

    String commercialMission(Type metier);
}
