package Aplicacao;

import java.util.Locale;
import java.util.Scanner;

import Entidades.ConversorMoedas;

public class Programa {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        Locale ptBR = new Locale("pt", "BR");

        double precoDolar;
        double qntdDolar;
        double valReais;

        
        System.out.print("Qual o preço do dólar? ");
        precoDolar = sc.nextDouble();

        System.out.print("Quantos dólares serão comprados? ");
        qntdDolar = sc.nextDouble();

        ConversorMoedas conversor = new ConversorMoedas(precoDolar, qntdDolar);
        valReais = conversor.converterMoedas();

        System.out.print("Valor a ser pago em reais = " + String.format("%.2f", valReais));
        

        sc.close();
    }
}
