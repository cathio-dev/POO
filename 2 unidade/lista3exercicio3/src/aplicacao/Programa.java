package aplicacao;

import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

// Ensure the Contribuinte class exists in the 'entidades' package
import entidades.Contribuinte;

public class Programa {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Use a list of Contribuinte objects
        ArrayList<Contribuinte> pessoas = new ArrayList<>();

        System.out.println("Digite o número de contribuintes: ");
        int N = sc.nextInt();
        sc.nextLine();
        System.out.println();

        for (int i = 0; i < N; i++) {
            System.out.printf("Dados do contribuinte #%d:\n");
            System.out.println("Pessoa física ou jurídica (f/j)? ");
            char pessoa = sc.nextLine().charAt(0);

            System.out.println("Nome: ");
            String nome = sc.nextLine();

            if (pessoa == 'f') {
                System.out.println("Renda anual: ");
                double rendaAnual = sc.nextDouble();
            } else {
                System.out.println("Número de empregados: ");
                double rendaAnual = sc.nextDouble();
            }

        }
    }
}