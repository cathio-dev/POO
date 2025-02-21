package Entidades;

public class Retangulo {
    private double largura;
    private double altura;

    public Retangulo(double largura, double altura){
        this.largura = largura;
        this.altura = altura;
    }

    public double getLargura() {
        return largura;
    }

    public void setLargura(double largura) {
        this.largura = largura;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double Area(){
        return this.largura*this.altura;
    }

    
    public double Perimetro(){
        return (2*this.largura)+(2*this.altura);
    }

    public double Diagonal(){
        return Math.sqrt((Math.pow(largura, 2)) + (Math.pow(altura, 2)));
    }


}
