package Aplicacao;

import java.util.Locale;
import java.util.Scanner;

import Entidades.Funcionario;

public class Programa_DadosFunc {
    public static void main(String[] args) throws Exception {
        Locale ptBR = new Locale("pt", "BR");
        Scanner sc = new Scanner(System.in);

        String nome;
        float salBruto, imposto;

        System.out.print("Nome: ");
        nome = sc.nextLine();

        System.out.print("Salário Bruto: ");
        salBruto = sc.nextFloat();

        System.out.print("Imposto: ");
        imposto = sc.nextFloat();

        Funcionario funcionario = new Funcionario(nome, salBruto, imposto);
        funcionario.setSalAntigo(salBruto);
        funcionario.Imposto(imposto);

        System.out.println();

        System.out.printf("Empregado: %s, R$ %.2f\n", funcionario.getNome(), funcionario.getSalBruto());
        System.out.println();

        System.out.print("Qual o percentual de aumento do salário?: ");
        float aumento = sc.nextFloat();

        funcionario.percentualAumento(aumento);

        System.out.println();

        System.out.printf("Dados Atualizados: %s, R$ %.2f", funcionario.getNome(), funcionario.getSalBruto());

        sc.close();
    }
}
