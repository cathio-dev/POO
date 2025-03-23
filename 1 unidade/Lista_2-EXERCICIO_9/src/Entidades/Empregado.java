package Entidades;

public class Empregado {
    private Integer ID;
    private String nome;
    private Double salario;

    public Empregado(Integer ID, String nome, Double salario) {
        this.ID = ID;
        this.nome = nome;
        this.salario = salario;
    }

    
    public Integer getID() {
        return ID;
    }
    public void setID(Integer iD) {
        ID = iD;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public Double getSalario() {
        return salario;
    }
    public void setSalario(Double salario) {
        this.salario = salario;
    }

    public void Aumento(double percentual){
        this.salario = this.salario * (1 + (percentual/100));
    }
    
    @Override
    public String toString() {
        return (ID + ", " + nome + ", " + salario);
    }
    
}
