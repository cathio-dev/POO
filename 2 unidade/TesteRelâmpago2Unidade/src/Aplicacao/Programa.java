package Aplicacao;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

import Entidades.Aluguel;
import Entidades.Imovel;

public class Programa {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale ptBR = new Locale("pt", "BR");
        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        System.out.println("*** Informe os dados da locação: ***");

        // Imóvel

        System.out.println("Código do imóvel: 1001");
        int codigo = sc.nextInt();

        System.out.println("Descrição: Casa 4/4");
        String descricao = sc.nextLine();

        Imovel imovel = new Imovel(codigo, descricao);
        
        // Aluguel

        System.out.println("Valor da Diária: 1000,00");
        double valorDiaria = sc.nextDouble();

        System.out.println("Data Entrada (dd/MM/yyyy): 12/05/2023");
        LocalDate entrada = LocalDate.parse(sc.nextLine(), fmt);

        System.out.println("Data Saída (dd/MM/yyyy): 15/05/2023");
        LocalDate saida = LocalDate.parse(sc.nextLine(), fmt);

        Aluguel aluguel = new Aluguel(entrada, saida);

        System.out.println();

        // Impressão dos dados

        System.out.println("*** Boleto Condomínio Mar Azul ***");
        System.out.println(imovel.toString());
        System.out.println(aluguel.toString());
        System.out.println(aluguel.processarBoleto());
    }
}