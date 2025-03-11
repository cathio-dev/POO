package Entidades;

public class Funcionario {
    private String nome;
    private float salBruto;
    private float salAntigo;

    public Funcionario(String nome, float salBruto, float imposto) {
        this.nome = nome;
        this.salBruto = salBruto;
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public float getSalBruto() {
        return salBruto;
    }
    public void setSalBruto(float salBruto) {
        this.salBruto = salBruto;
    }

    public void Imposto(float imposto){
        this.salBruto = this.salBruto - imposto;
    }
    
    public void percentualAumento(float percentual){
        this.salBruto = this.salBruto + ( (percentual/100) * this.salAntigo );
    }

    public float getSalAntigo() {
        return salAntigo;
    }

    public void setSalAntigo(float salAntigo) {
        this.salAntigo = salAntigo;
    }
    
    
}
