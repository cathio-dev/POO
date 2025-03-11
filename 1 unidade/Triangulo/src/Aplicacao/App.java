package Aplicacao;

import java.util.Scanner;

import Entidades.Triangulo;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        double altura;
        double largura;

        System.out.println("Informe a altura e largura do triângulo:");
        altura = sc.nextDouble();
        largura = sc.nextDouble();

        Triangulo tri = new Triangulo(altura, largura);

        System.out.println("Área: " + tri.Area());



        

    }
}
