package Aplicacao;

import java.util.Locale;
import java.util.Scanner;

import Entidades.Quarto;

public class Programa {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale ptBR = new Locale("pt", "BR");

        Quarto lista[] = new Quarto[10];

        String nome;
        String email;
        int quarto;
        int alugados;
        int j = 0;

        for (int i = 0; i < lista.length; i++) {
            lista[i] = null;
        }

        System.out.print("Quantos quartos serão alugados? ");
        alugados = sc.nextInt();

        for (int i = 0; i < alugados; i++) {
            System.out.printf("Aluguel #%d: \n", i+1); 
            System.out.printf("Nome: ");
            sc.nextLine();
            nome = sc.nextLine();
            

            System.out.printf("Email: "); 
            email = sc.nextLine();

            System.out.printf("Quarto: ");
            quarto = sc.nextInt();
            System.out.println();

            lista[quarto] = new Quarto(nome, email, quarto);

        }

        System.out.println();
        System.out.println("Quartos ocupados: ");
        
        while (j < lista.length) {
            if (lista[j] != null) {
                System.out.println(lista[j].toString());
            }

            j++;


        }


    }
}