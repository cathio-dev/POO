package Aplicacao;

import java.util.Locale;
import java.util.Scanner;

import Entidades.Conta;

public class Programa {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        Locale ptBR = new Locale("pt", "BR");
        int nc = 0;

        System.out.println("Quantas contas deseja criar?: ");
        nc = sc.nextInt();

        Conta[] contas = new Conta[nc];

        for(int i=0; i < nc; i++){
            System.out.println("*** CONTA #" + (i+1) + " ***");
            System.out.println("Informe o número da conta: ");
        }

    }
}
