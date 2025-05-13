package Servicos;

public class ServicoTaxaParaiso implements ServicoTaxa {
    public Double calculaTaxa(Double valorDiaria) {
        return 0.05 * valorDiaria + 10;
    }
}
