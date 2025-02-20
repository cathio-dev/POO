package PROJETO.Entidades;

public class Empregado {
    private String nome;

    public Empregado(String nome) {
        this.nome = nome;
    }

    public String getnome() {
        return nome;
    }

    public void setnome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "Empregado [nome = " + nome + " ]";
    }
}