package Aplicacao;

import java.util.*;

import Entidades.Disciplina;
import Entidades.Aluno;

public class Programa {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        Locale ptBR = new Locale("pt", "BR");

        String nome;
        float nota1;
        float nota2;
        float nota3;
        String codigo;
        String nomeDisciplina;
        int nAlunos, matricula;



        // Disciplina:

        System.out.print("Informe o código da disciplina: ");
        codigo = sc.nextLine();
        sc.nextLine();

        System.out.print("Informe o nome da disciplina: ");
        nomeDisciplina = sc.nextLine();

        Disciplina disciplina = new Disciplina(codigo, nomeDisciplina);


        // Dados do aluno:

        System.out.println("Informe o número de alunos: ");
        nAlunos = sc.nextInt();
        sc.nextLine();
        
        for (int i = 0; i < nAlunos; i++) {

            System.out.printf("Informe os Dados do Aluno %d:", i + 1);
            System.out.println();

            System.out.print("Matrícula: ");
            matricula = sc.nextInt();
            sc.nextLine();

            System.out.print("Nome: ");
            nome = sc.nextLine();

            System.out.print("Nota1: ");
            nota1 = sc.nextFloat();

            System.out.print("Nota2: ");
            nota2 = sc.nextFloat();

            System.out.print("Nota3: ");
            nota3 = sc.nextFloat();

            Aluno aluno = new Aluno(matricula, nomeDisciplina, nota1, nota2, nota3);
            
            disciplina.addAluno(aluno); //manda pra função que coloca numa lista

            System.out.println();


        }

        // Dados finais:
        System.out.println("Alunos Aprovados:");
        // função que retorna alunos aprvados //
    }
}
