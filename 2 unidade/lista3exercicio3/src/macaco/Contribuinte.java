package entidades;

public class Contribuinte {
    private String nome;
    private Double rendimentoAnual;
    private Double imposto;

    public Contribuinte() {

    }

    public Contribuinte(String nome, Double rendimentoAnual, Double imposto) {
        super();
        this.nome = nome;
        this.rendimentoAnual = rendimentoAnual;
        this.imposto = imposto;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getRendimentoAnual() {
        return rendimentoAnual;
    }

    public void setRendimentoAnual(Double rendimentoAnual) {
        this.rendimentoAnual = rendimentoAnual;
    }

    public Double getImposto() {
        return imposto;
    }

    public void setImposto(Double imposto) {
        this.imposto = imposto;
    }

    @Override
    public String toString() {
        return "Contribuinte [nome=" + nome + ", rendimentoAnual=" + rendimentoAnual + ", imposto=" + imposto + "]";
    }
}
