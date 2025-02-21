package Entidades;

public class Produto {
    private String nome;
    private double preco;
    private int qntd;
    private double total;

    public Produto(String nome, double preco, int qntd){
        this.nome = nome; //o nome do objeto recebe o nome que for passado,
        this.preco = preco; ///mesma coisa
        this.qntd = qntd; //mesma coisa
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return this.preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int getQntd() {
        return this.qntd;
    }

    public void setQntd(int qntd) {
        this.qntd = qntd;
    }



    public double total(){

        this.total = this.qntd * this.preco;
        double total = this.total;
        return total;
    }

    public void Remover(int removidos){
        this.qntd = this.qntd - removidos;
        this.total = this.preco * this.qntd;
    }

    public void Adicionar(int adicionados){
        this.qntd = this.qntd + adicionados;
        this.total = this.preco * this.qntd;
    }
}
