package gestion_des_salaires.utils;

public abstract class CalculSalaire {
    private final static double charge = 0.24;
    private double salaireNet;
    private double salaireBrut;
    public CalculSalaire(double salaireNet, double salaireBrut) {
        this.salaireNet = salaireNet;
        this.salaireBrut = salaireBrut;
    }
    public double getSalaireNet() {
        return salaireNet;
    }
    public void setSalaireNet(double salaireNet) {
        this.salaireNet = salaireNet;
    }
    public double getSalaireBrut() {
        return salaireBrut;
    }
    public double setSalaireBrut(double salaireBrut) {
        this.salaireBrut = salaireBrut;
        return salaireBrut;
    }
    public void calculSalaireNet(){
        this.setSalaireNet(this.getSalaireBrut()*(1-charge));
    }
    public abstract void calculSalaireBrut();
    @Override
    public String toString() {
        return "Le salaire est de " + this.getSalaireNet() +"€ NET et de " + this.getSalaireBrut() + "€ BRUT.";
    }
}
