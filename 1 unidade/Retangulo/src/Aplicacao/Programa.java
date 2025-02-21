package Aplicacao;

import java.util.Locale;
import java.util.Scanner;

import Entidades.Retangulo;

public class Programa {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        Locale ptBR = new Locale("pt","BR");
    
        double largura, altura;


        System.out.println("Informe a largura e a altura do retangulo:");
        largura = sc.nextDouble();
        altura = sc.nextDouble();
        System.out.println();

        Retangulo retangulo = new Retangulo(largura, altura);

        System.out.println("Area = " + String.format("%.2f", retangulo.Area()));
        System.out.println("Perimetro = " + String.format("%.2f", retangulo.Perimetro()));
        System.out.println("Diagonal = " + String.format("%.2f", retangulo.Diagonal()));



        sc.close();

    }
}
