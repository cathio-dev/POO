package Aplicacao;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Programa {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        Date dataNascimento = null;

        System.out.println("Informe os dados do Cliente: ");
        System.out.println();

        System.out.println("Nome: ");
        String nome = sc.nextLine();

        System.out.println("Email: ");
        String email = sc.nextLine();

        System.out.println("Data de Nascimento (DD/MM/YYYY): ");
        String dataDeNascimento = sc.nextLine();

        try {
            dataNascimento = sdf.parse(dataDeNascimento);
        } catch (Exception e) {
            System.out.println("Erro ao analisar a data. Certifique-se de usar o formato DD/MM/YYYY.");
        }

    }
}