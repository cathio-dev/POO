package Aplicacao;

import java.util.Locale;
import java.util.Scanner;

import Entidades.Empregado;

public class Programa {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        Locale ptBR = new Locale("pt", "BR");

        Empregado[] Empregado = new Empregado[10];

        int ID, N;
        String nome;
        double salario, percentual;

        System.out.print("Quantos funcionários serão cadastrados?: ");
        N = sc.nextInt();
        sc.nextLine();

        for(int i=0; i < N; i++){
            System.out.println("Empregado #" + (i+1) + ":");
            System.out.print("ID: ");
            ID = sc.nextInt();
            sc.nextLine();

            System.out.print("Nome: ");
            nome = sc.nextLine();

            System.out.print("Salário: ");
            salario = sc.nextDouble();

            Empregado[i] = new Empregado(ID, nome, salario);

        }

        System.out.println("Informe o Id do funcionário que terá seu salário modificado: ");
        int funcID = sc.nextInt();

        System.out.println("Informe o percentual: ");
        percentual = sc.nextInt();

        for(int j=0; j < Empregado.length; j++){
            

            if (Empregado[j] != null && Empregado[j].getID() == funcID) {
                Empregado[j].Aumento(percentual);
            }
        }

        System.out.println();
        System.out.println("Lista de Empregados:");

        for(int k=0; k < N; k++){
            System.out.println(Empregado[k].toString());
            System.out.println();
        }



    }
}