package Entidades;

public class ConversorMoedas {
    private double precoDolar;
    private double qntdDolar;

    public ConversorMoedas(double precoDolar, double qntdDolar) {
        this.precoDolar = precoDolar;
        this.qntdDolar = qntdDolar;
    }

    public double getPrecoDolar() {
        return precoDolar;
    }

    public void setPrecoDolar(double precoDolar) {
        this.precoDolar = precoDolar;
    }

    public double getQntdDolar() {
        return qntdDolar;
    }

    public void setQntdDolar(double qntdDolar) {
        this.qntdDolar = qntdDolar;
    }

    public double converterMoedas(){
        return ( (this.qntdDolar * this.precoDolar) + (0.06 * (this.qntdDolar * this.precoDolar)) );
    }
    
    
}
