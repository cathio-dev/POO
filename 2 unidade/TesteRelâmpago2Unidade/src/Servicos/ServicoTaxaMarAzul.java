package Servicos;

public class ServicoTaxaMarAzul implements ServicoTaxa {
    public Double calculaTaxa(Double valorDiaria) {
        return 0.02 * valorDiaria + 15;
    }
}
