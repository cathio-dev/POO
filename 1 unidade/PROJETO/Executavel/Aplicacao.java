package PROJETO.Executavel;

import java.util.Scanner;
import PROJETO.Entidades.Empregado;

public class Aplicacao {
    public static void main(String[] args) { //"public", toda classe pode acessar. "static", "void" (função sem retorno), "main", metodo principal, "String[] args (parametros para passar)"
        Scanner sc = new Scanner(System.in);
        String nome;

        System.out.print("Informe o nome do empregadp: ");
        nome = sc.nextLine();

        Empregado empregado = new Empregado(nome);

        sc.close();

    }
}

