public class PessoaJuridica extends Contribuinte {
    private Integer numeroEmpregados;

    public PessoaJuridica(String nome, Double rendimentoAnual, Double imposto, Integer numeroEmpregados) {
        super(nome, rendimentoAnual, imposto);
        this.numeroEmpregados = numeroEmpregados;
    }

}
