package gestion_des_salaires.utils;

public class CalculCadre extends CalculSalaire{
    private final static int day = 212;
    private double taux;
    public CalculCadre(double taux) {
        super(0, 0);
        this.taux = taux;
    }
    public double getTaux() {
        return taux;
    }
    public void setTaux(double taux) {
        this.taux = taux;
    }
    @Override
    public void calculSalaireBrut() {
        this.setSalaireBrut(taux * day);
    }
}
