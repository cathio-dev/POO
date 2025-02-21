package Aplicacao;

import java.util.Locale;
import java.util.Scanner;

import Entidades.Produto;

public class Program {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);

        String nome;
        int qntd;
        double preco;

        System.out.println("Informe os dados do produto:");
        System.out.print("Nome: ");
        nome = sc.nextLine();

        System.out.print("Preco: ");
        preco = sc.nextDouble();

        System.out.print("Quantidade em estoque: ");
        qntd = sc.nextInt();
        System.out.println();

        Produto produto = new Produto(nome, preco, qntd);

        System.out.println("Dados do produto: " + produto.getNome() + ", R$ " + String.format("%.2f", produto.getPreco()) + ", "
                + produto.getQntd() + " unidades, Total: R$" + String.format("%.2f", produto.total()));

        System.out.println();

        System.out.print("Informe o numero de produtos a serem adicionados no estoque: ");
        int adicionados = sc.nextInt();
        produto.Adicionar(adicionados);

        System.out.println();

        System.out.println("Dados do atualizados: " + produto.getNome() + ", R$ " + String.format("%.2f", produto.getPreco()) + ", "
                + produto.getQntd() + "unidades, Total: R$" + String.format("%.2f", produto.total()));

        System.out.println();

        System.out.print("Informe o numero de produtos a serem removidos no estoque: ");
        int removidos = sc.nextInt();
        produto.Remover(removidos);

        System.out.println();

        System.out.println("Dados do atualizados: " + produto.getNome() + ", R$ " + String.format("%.2f", produto.getPreco()) + ", "
                + produto.getQntd() + "unidades, Total: R$" + String.format("%.2f", produto.total()));

        sc.close();
    }
}
