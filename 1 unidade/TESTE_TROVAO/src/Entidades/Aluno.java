package Entidades;

public class Aluno {
    private Integer matricula;
    private String nome;
    private Float nota1;
    private Float nota2;
    private Float nota3;
    private Float media;

    public Aluno() {

    }

    public Aluno(Integer matricula, String nome, Float nota1, Float nota2, Float nota3) {
        super();
        this.matricula = matricula;
        this.nome = nome;
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.nota3 = nota3;
        calcularMedia(nota1, nota2, nota3);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getMatricula() {
        return matricula;
    }

    public Float getMedia() {
        return media;
    }

    public Float getNota1() {
        return nota1;

    }

    public void setNota1(Float nota1) {
        this.nota1 = nota1;
        calcularMedia(nota1, nota2, nota3);
    }

    public Float getNota2() {
        return nota2;
    }

    public void setNota2(Float nota2) {
        this.nota2 = nota2;
        calcularMedia(nota1, nota2, nota3);
    }

    public Float getNota3() {
        return nota3;
    }

    public void setNota3(Float nota3) {
        this.nota3 = nota3;
        calcularMedia(nota1, nota2, nota3);
    }

    private void calcularMedia(float nota1, float nota2, float nota3) {
        this.media = (nota1 + nota2 + nota3) / 3;
    }

    @Override
    public String toString() {
        return "Matrícula = " + matricula + " - Nome = " + nome + " - Média = " + media;
    }


    
}
