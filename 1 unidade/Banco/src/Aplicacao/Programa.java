package Aplicacao;

import java.util.Locale;
import java.util.Scanner;

import Entidades.ContaBancaria;

public class Programa {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        Locale ptBR = new Locale("pt", "BR");

        int numConta; //nao muda
        char escolha;
        String nomeTitular; //muda(talvez)
        float saldo = 0; //muda
        float valDeposito;
        float valSaque;

        System.out.print("Informe o número da conta: ");
        numConta = sc.nextInt();
        sc.nextLine();
        
        System.out.print("Informe o nome do titular da conta: ");
        nomeTitular = sc.nextLine();

        System.out.print("Haverá depósito inicial? (s/n): ");
        escolha = sc.next().charAt(0);

        ContaBancaria pessoa = new ContaBancaria(numConta, nomeTitular, saldo);

        if (escolha == 's') {
            System.out.print("Informe o valor do depósito inicial: ");
            valDeposito = sc.nextFloat();
            pessoa.setValDeposito(valDeposito);
            pessoa.Deposito();
        }

        System.out.println();
        System.out.println("Dados da Conta:");
        System.out.printf("Conta %d, Nome do Titular: %s, Saldo: R$ %.2f\n", pessoa.getNumConta(), pessoa.getNomeTitular(), pessoa.getSaldo());

        System.out.println();

        System.out.print("Informe um valor de depósito: ");
        valDeposito = sc.nextFloat();
        pessoa.setValDeposito(valDeposito);
        pessoa.Deposito();
        System.out.println();

        System.out.println("Dados da conta atualizados:");
        System.out.printf("Conta %d, Nome do Titular: %s, Saldo: R$ %.2f\n", pessoa.getNumConta(), pessoa.getNomeTitular(), pessoa.getSaldo());

        System.out.println();

        System.out.print("Informe um valor de saque: ");
        valSaque = sc.nextFloat();
        pessoa.setValSaque(valSaque);
        pessoa.Saque();
        System.out.println(); 

        System.out.println("Dados da conta atualizados:");
        System.out.printf("Conta %d, Nome do Titular: %s, Saldo: R$ %.2f", pessoa.getNumConta(), pessoa.getNomeTitular(), pessoa.getSaldo());

        sc.close();

    }
}
