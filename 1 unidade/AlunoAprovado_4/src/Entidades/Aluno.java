package Entidades;

public class Aluno {

    private String nome;
    private float nota1;
    private float nota2;
    private float nota3;
    private double total;

    public Aluno(String nome, float nota1, float nota2, float nota3) {
        this.nome = nome;
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.nota3 = nota3;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getNota1() {
        return nota1;
    }

    public void setNota1(float nota1) {
        this.nota1 = nota1;
    }

    public float getNota2() {
        return nota2;
    }

    public void setNota2(float nota2) {
        this.nota2 = nota2;
    }

    public float getNota3() {
        return nota3;
    }

    public void setNota3(float nota3) {
        this.nota3 = nota3;
    }

    public double getTotal() {
        return total;
    }

    public void calcularNotaFinal() {
        this.total = this.nota1 + this.nota2 + this.nota3;
    }

    public void Aprovado() {
        System.out.println("Aprovado");
    }

    public double Reprovado() {
        double conta = (60) - this.total;
        return conta;
    }

}
