package gestion_des_salaires.utils;

public class CalculTech extends CalculSalaire{
    private final static int hour = 1607;
    private double taux;
    public CalculTech(double taux) {
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
        this.setSalaireBrut(taux*hour);
    }
}
