
public class PessoaFisica extends Contribuinte {
    private Double despesaSaude;

    public PessoaFisica(String nome, Double rendimentoAnual, Double imposto, Double despesaSaude) {
        super(nome, rendimentoAnual, imposto);
        this.despesaSaude = despesaSaude;
    }

}
