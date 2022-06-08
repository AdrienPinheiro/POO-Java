package gestion_des_salaires.utils;

public class CalculCommercial extends CalculSalaire{
    private final static int pourcentage = 5;
    private double turnover;
    public CalculCommercial(double turnover) {
        super(0, 0);
        this.turnover = turnover;
    }
    public double getTurnover() {
        return turnover;
    }
    public void setTurnover(double turnover) {
        this.turnover = turnover;
    }
    @Override
    public void calculSalaireBrut() {
        this.setSalaireBrut(turnover/100*(pourcentage));
    }
}
