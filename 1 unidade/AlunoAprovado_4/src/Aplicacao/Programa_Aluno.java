package Aplicacao;

import Entidades.Aluno;

import java.util.Locale;
import java.util.Scanner;

public class Programa {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        Locale ptBR = new Locale("pt", "BR");

        String nome;
        float nota1;
        float nota2;
        float nota3;

        System.out.print("Nome: ");
        nome = sc.nextLine();

        System.out.print("Nota1: ");
        nota1 = sc.nextFloat();

        System.out.print("Nota2: ");
        nota2 = sc.nextFloat();

        System.out.print("Nota3: ");
        nota3 = sc.nextFloat();

        System.out.println();

        Aluno aluno = new Aluno(nome, nota1, nota2, nota3);

        aluno.calcularNotaFinal();

        System.out.printf("Nota final: %.2f\n", aluno.getTotal());
        
        if (aluno.getTotal() >= 60) {
            aluno.Aprovado();
        }else{
            System.out.println("Reprovado");
            System.out.printf("Faltaram %.2f pontos", aluno.Reprovado());
        }



        sc.close();



    }
}
