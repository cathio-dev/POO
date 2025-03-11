package Entidades;

public class Triangulo {
    private double altura;
    private double largura;

    public Triangulo(double altura, double largura) {
        this.altura = altura;
        this.largura = largura;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getLargura() {
        return largura;
    }

    public void setLargura(double largura) {
        this.largura = largura;
    }

    public double Area(){
        return (this.altura*this.largura)/2;
    }



    
}
